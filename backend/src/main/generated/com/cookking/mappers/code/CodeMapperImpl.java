package com.cookking.mappers.code;

import com.cookking.models.code.Code;
import com.cookking.models.code.dto.CodeDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-17T11:16:22+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class CodeMapperImpl implements CodeMapper {

    @Override
    public Code toEntity(CodeDto dto) {
        if ( dto == null ) {
            return null;
        }

        Code code = new Code();

        code.setId( dto.getId() );
        code.setName( dto.getName() );
        code.setOrd( dto.getOrd() );
        code.setCreatedAt( dto.getCreatedAt() );
        code.setUpdatedAt( dto.getUpdatedAt() );
        code.setDeletedAt( dto.getDeletedAt() );

        return code;
    }

    @Override
    public CodeDto toDto(Code entity) {
        if ( entity == null ) {
            return null;
        }

        CodeDto codeDto = new CodeDto();

        codeDto.setId( entity.getId() );
        codeDto.setName( entity.getName() );
        codeDto.setOrd( entity.getOrd() );
        codeDto.setCreatedAt( entity.getCreatedAt() );
        codeDto.setUpdatedAt( entity.getUpdatedAt() );
        codeDto.setDeletedAt( entity.getDeletedAt() );

        return codeDto;
    }

    @Override
    public List<Code> toEntityList(List<CodeDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Code> list = new ArrayList<Code>( dtos.size() );
        for ( CodeDto codeDto : dtos ) {
            list.add( toEntity( codeDto ) );
        }

        return list;
    }

    @Override
    public List<CodeDto> toDtoList(List<Code> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CodeDto> list = new ArrayList<CodeDto>( entities.size() );
        for ( Code code : entities ) {
            list.add( toDto( code ) );
        }

        return list;
    }
}
