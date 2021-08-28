package com.cookking.controllers.v1.search;

import com.cookking.models.search.CreateSearchDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestConstructor;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by marathoner on 2021/08/28
 */
@ActiveProfiles(profiles = {"local"})
@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
@AutoConfigureMockMvc
class SearchControllerTest {

    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getByMemberId() {
    }

    @Test
    void getAll() {
    }

    @Test
    void create() {
    }

    private CreateSearchDto getCreateSearchDto() {
        return CreateSearchDto.builder()
                .content("search")
                .memberId(2L)
                .build();
    }
}
