package com.cookking.controllers.v1.code;

import com.cookking.models.code.dto.CreateCodeDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestConstructor;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 *  create by kimminsang 2021/09/14
 */

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles(profiles = {"local"})
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
public class CodeControllerTest {

    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;

    private final String URL = "/api/v1/code/";

    private CreateCodeDto getCreateCommonCode(){
        return CreateCodeDto.builder()
                .name("test")
                .ord(1F)
                .build();
    }

    @Test
    @DisplayName("공통코드 모두 조회")
    void searchAllCode() throws Exception{
        mockMvc.perform(get(URL).accept(MediaType.ALL))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("공통코드 추가")
    void createCommonCode() throws Exception{
        String createCodeJson = objectMapper.writeValueAsString(getCreateCommonCode());

        mockMvc.perform(post(URL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(createCodeJson))
                .andExpect(status().isCreated());
    }
}
