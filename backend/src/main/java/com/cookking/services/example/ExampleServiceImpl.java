package com.cookking.services.example;

import com.cookking.mappers.ExampleMapper;
import com.cookking.models.example.Example;
import com.cookking.models.example.ExampleDto;
import com.cookking.repositories.ExampleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by marathoner on 2021/07/16.
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class ExampleServiceImpl implements ExampleService {

    private final ExampleRepository exampleRepository;
    private final ExampleMapper exampleMapper;

    @Override
    public ExampleDto getExampleById(Long exampleId) {
        Example example = exampleRepository.getById(exampleId);

        return exampleMapper.toDto(example);
    }

    @Override
    public void saveNewExample(ExampleDto exampleDto) {
        Example example = exampleMapper.toEntity(exampleDto);
        log.info("LOG ::: "+exampleDto.getContent());
        log.info("LOG ::: "+example.getContent());
        exampleRepository.save(example);
    }

    @Override
    public void updateExampleById(Long exampleId, ExampleDto exampleDto) {
        Example example = exampleRepository.getById(exampleId);
        example.setContent(exampleDto.getContent());
        exampleRepository.save(example);
    }
}
