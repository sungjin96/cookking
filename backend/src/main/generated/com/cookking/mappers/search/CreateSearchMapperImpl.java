package com.cookking.mappers.search;

import com.cookking.models.search.CreateSearchDto;
import com.cookking.models.search.Search;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-14T20:49:32+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class CreateSearchMapperImpl implements CreateSearchMapper {

    @Override
    public Search toEntity(CreateSearchDto dto) {
        if ( dto == null ) {
            return null;
        }

        Search search = new Search();

        search.setId( dto.getId() );
        search.setContent( dto.getContent() );
        search.setCreatedAt( dto.getCreatedAt() );

        return search;
    }

    @Override
    public CreateSearchDto toDto(Search entity) {
        if ( entity == null ) {
            return null;
        }

        CreateSearchDto createSearchDto = new CreateSearchDto();

        createSearchDto.setId( entity.getId() );
        createSearchDto.setContent( entity.getContent() );
        createSearchDto.setCreatedAt( entity.getCreatedAt() );

        return createSearchDto;
    }

    @Override
    public List<Search> toEntityList(List<CreateSearchDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Search> list = new ArrayList<Search>( dtos.size() );
        for ( CreateSearchDto createSearchDto : dtos ) {
            list.add( toEntity( createSearchDto ) );
        }

        return list;
    }

    @Override
    public List<CreateSearchDto> toDtoList(List<Search> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CreateSearchDto> list = new ArrayList<CreateSearchDto>( entities.size() );
        for ( Search search : entities ) {
            list.add( toDto( search ) );
        }

        return list;
    }
}
