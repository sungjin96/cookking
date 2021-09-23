package com.cookking.mappers.code;

import com.cookking.models.code.Code;
import com.cookking.models.code.Code.CodeBuilder;
import com.cookking.models.code.dto.CreateCodeDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-23T09:12:13+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class CreateCodeMapperImpl implements CreateCodeMapper {

    @Override
    public Code toEntity(CreateCodeDto arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CodeBuilder code = Code.builder();

        code.id( arg0.getId() );
        code.name( arg0.getName() );
        code.ord( arg0.getOrd() );
        code.createdAt( arg0.getCreatedAt() );

        return code.build();
    }

    @Override
    public CreateCodeDto toDto(Code arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CreateCodeDto createCodeDto = new CreateCodeDto();

        createCodeDto.setId( arg0.getId() );
        createCodeDto.setName( arg0.getName() );
        createCodeDto.setOrd( arg0.getOrd() );
        createCodeDto.setCreatedAt( arg0.getCreatedAt() );

        return createCodeDto;
    }

    @Override
    public List<Code> toEntityList(List<CreateCodeDto> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<Code> list = new ArrayList<Code>( arg0.size() );
        for ( CreateCodeDto createCodeDto : arg0 ) {
            list.add( toEntity( createCodeDto ) );
        }

        return list;
    }

    @Override
    public List<CreateCodeDto> toDtoList(List<Code> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<CreateCodeDto> list = new ArrayList<CreateCodeDto>( arg0.size() );
        for ( Code code : arg0 ) {
            list.add( toDto( code ) );
        }

        return list;
    }
}
