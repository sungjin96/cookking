package com.cookking.services.search;

import com.cookking.mappers.search.CreateSearchMapper;
import com.cookking.mappers.search.SearchMapper;
import com.cookking.models.search.CreateSearchDto;
import com.cookking.models.search.Search;
import com.cookking.models.search.SearchDto;
import com.cookking.repositories.SearchRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by marathoner on 2021/08/28
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class SearchServiceImpl implements SearchService {

    private final SearchRepository searchRepository;
    private final CreateSearchMapper createSearchMapper;
    private final SearchMapper searchMapper;

    @Override
    public void create(CreateSearchDto createSearchDto) {
        Search search = createSearchMapper.toEntity(createSearchDto);
        searchRepository.save(search);
    }

    @Override
    public SearchDto findByMemberId(Long memberId) {
        return null;
    }

    @Override
    public List<SearchDto> findAll() {
        return searchMapper.toDtoList(searchRepository.findAll());
    }
}
