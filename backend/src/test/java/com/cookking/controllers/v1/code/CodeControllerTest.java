package com.cookking.controllers.v1.code;

import com.cookking.models.code.Code;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestConstructor;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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


    @Test
    @DisplayName("테스트")
    void hello() throws Exception{
        mockMvc.perform(get(URL + "/hello").accept(MediaType.ALL))
                .andExpect(status().isOk());
    }
    @Test
    @DisplayName("공통 코드 조회")
    void searchAllCode() throws Exception{
        mockMvc.perform(get(URL).accept(MediaType.ALL))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("공통 코드 추가")
    void createCommonCode() throws Exception{
        String createCodeJson = objectMapper.writeValueAsString(getCreateCommonCode());

        mockMvc.perform(post(URL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(createCodeJson))
                .andExpect(status().isCreated());
    }

    private Code getCreateCommonCode(){
        return Code.builder()
                .name("test")
                .id(2L)
                .ord(1F)
                .build();
    }
}
