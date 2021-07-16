package com.cookking.services.example;

import com.cookking.models.example.ExampleDto;
/**
 * Created by marathoner on 2021/07/16.
 */
public interface ExampleService {
    public ExampleDto getExampleById(Long exampleId);
    public void saveNewExample(ExampleDto exampleDto);
    public void updateExampleById(Long exampleId, ExampleDto exampleDto);
}
