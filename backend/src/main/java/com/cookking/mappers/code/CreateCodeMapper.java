package com.cookking.mappers.code;

import com.cookking.configs.components.DateComponent;
import com.cookking.models.code.Code;
import com.cookking.models.code.dto.CreateCodeDto;
import com.cookking.models.common.EntityMapper;
import org.mapstruct.Mapper;

/**
 * Created by kimminsang on 2021/09/22
 */

@Mapper(uses ={DateComponent.class}, componentModel = "spring")
public interface CreateCodeMapper extends EntityMapper<CreateCodeDto , Code> {
}
