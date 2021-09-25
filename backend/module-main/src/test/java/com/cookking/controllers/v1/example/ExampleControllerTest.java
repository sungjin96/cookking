package com.cookking.controllers.v1.example;

import com.cookking.models.example.ExampleDto;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestConstructor;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


/**
 * Created by marathoner on 2021/07/16.
 */
@ActiveProfiles(profiles = {"local"})
@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
@AutoConfigureMockMvc
class ExampleControllerTest {

    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getExampleById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/example/" + 1L).accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void saveNewExample() throws Exception {
        String exampleDtoJson = objectMapper.writeValueAsString(getExample());

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/example/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(exampleDtoJson))
                .andExpect(MockMvcResultMatchers.status().isCreated());
    }

    @Test
    void updateExampleById() throws Exception {
        String exampleDtoJson = objectMapper.writeValueAsString(getExample());

        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/example/" + 1L)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(exampleDtoJson))
                .andExpect(MockMvcResultMatchers.status().isNoContent());
    }

    private ExampleDto getExample() {
        return ExampleDto.builder()
                .id(2L)
                .content("My Second Example")
                .build();
    }


}
