package com.cookking.mappers.code;

import com.cookking.configs.components.DateComponent;
import com.cookking.mappers.EntityMapper;
import com.cookking.models.code.Code;
import com.cookking.models.code.dto.UpdateCodeDto;
import org.mapstruct.Mapper;

/**
 * Created by kimminsang on 2021/09/17
 */
@Mapper(uses = {DateComponent.class}, componentModel = "spring")
public interface UpdateCodeMapper extends EntityMapper<UpdateCodeDto, Code> {
}
