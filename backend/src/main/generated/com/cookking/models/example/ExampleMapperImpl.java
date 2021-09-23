package com.cookking.models.example;

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
public class ExampleMapperImpl implements ExampleMapper {

    @Override
    public Example toEntity(ExampleDto dto) {
        if ( dto == null ) {
            return null;
        }

        Example example = new Example();

        example.setId( dto.getId() );
        example.setContent( dto.getContent() );
        example.setCreatedAt( dto.getCreatedAt() );
        example.setUpdatedAt( dto.getUpdatedAt() );
        example.setDeletedAt( dto.getDeletedAt() );

        return example;
    }

    @Override
    public ExampleDto toDto(Example entity) {
        if ( entity == null ) {
            return null;
        }

        ExampleDto exampleDto = new ExampleDto();

        exampleDto.setId( entity.getId() );
        exampleDto.setContent( entity.getContent() );
        exampleDto.setCreatedAt( entity.getCreatedAt() );
        exampleDto.setUpdatedAt( entity.getUpdatedAt() );
        exampleDto.setDeletedAt( entity.getDeletedAt() );

        return exampleDto;
    }

    @Override
    public List<Example> toEntityList(List<ExampleDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Example> list1 = new ArrayList<Example>( list.size() );
        for ( ExampleDto exampleDto : list ) {
            list1.add( toEntity( exampleDto ) );
        }

        return list1;
    }

    @Override
    public List<ExampleDto> toDtoList(List<Example> list) {
        if ( list == null ) {
            return null;
        }

        List<ExampleDto> list1 = new ArrayList<ExampleDto>( list.size() );
        for ( Example example : list ) {
            list1.add( toDto( example ) );
        }

        return list1;
    }
}
