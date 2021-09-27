package com.cookking.models.example;

import com.cookking.configs.components.DateComponent;
import com.cookking.models.common.EntityMapper;
import org.mapstruct.Mapper;

/**
 * Created by marathoner on 2021/07/16.
 */
@Mapper(uses = {DateComponent.class}, componentModel = "spring")
public interface ExampleMapper extends EntityMapper<ExampleDto, Example> {
}
