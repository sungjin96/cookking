package com.cookking.controllers.v1.member;

import com.cookking.models.member.LoginType;
import com.cookking.models.member.dto.CreateMemberDto;
import com.cookking.models.member.dto.UpdateMemberDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestConstructor;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by marathoner on 2021/07/16.
 */
@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
@AutoConfigureMockMvc
class MemberControllerTest {

    private final String URL = "/api/v1/member/";

    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;

    @Test
    @DisplayName("존재하는 멤버 아이디로 조회")
    void getMemberById() throws Exception {
        mockMvc.perform(get(URL + 1L).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("존재하는 멤버 아이디로 조회")
    void getMemberByNoneId() throws Exception {
        mockMvc.perform(get(URL + 999L).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("이메일로 1차 생성")
    void saveNewExample() throws Exception {
        String createMemberDtoJson = objectMapper.writeValueAsString(getCreateMemberDto());

        mockMvc.perform(post(URL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(createMemberDtoJson))
                .andExpect(status().isCreated());
    }

    @Test
    void updateExampleById() throws Exception {
        String updateMemberDtoJson = objectMapper.writeValueAsString(getUpdateMemberDto());

        mockMvc.perform(put(URL + 1L)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(updateMemberDtoJson))
                .andExpect(status().isNoContent());
    }

    private CreateMemberDto getCreateMemberDto() {
        return CreateMemberDto.builder()
                .email("test@gmail.com")
                .loginType(LoginType.NATIVE)
                .build();
    }

    private UpdateMemberDto getUpdateMemberDto() {
        return UpdateMemberDto.builder()
                .id(1L)
                .nickName("HELLLLLOOOOOOOO")
                .build();
    }


}
