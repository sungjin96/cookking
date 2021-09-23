package com.cookking.mappers.search;

import com.cookking.models.search.Search;
import com.cookking.models.search.SearchDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-17T11:16:21+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class SearchMapperImpl implements SearchMapper {

    @Override
    public Search toEntity(SearchDto dto) {
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
    public SearchDto toDto(Search entity) {
        if ( entity == null ) {
            return null;
        }

        SearchDto searchDto = new SearchDto();

        searchDto.setId( entity.getId() );
        searchDto.setContent( entity.getContent() );
        searchDto.setCreatedAt( entity.getCreatedAt() );

        return searchDto;
    }

    @Override
    public List<Search> toEntityList(List<SearchDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Search> list = new ArrayList<Search>( dtos.size() );
        for ( SearchDto searchDto : dtos ) {
            list.add( toEntity( searchDto ) );
        }

        return list;
    }

    @Override
    public List<SearchDto> toDtoList(List<Search> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SearchDto> list = new ArrayList<SearchDto>( entities.size() );
        for ( Search search : entities ) {
            list.add( toDto( search ) );
        }

        return list;
    }
}
