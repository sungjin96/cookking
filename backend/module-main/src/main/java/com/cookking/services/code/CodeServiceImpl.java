package com.cookking.services.code;

import com.cookking.mappers.code.CreateCodeMapper;
import com.cookking.models.code.Code;
import com.cookking.models.code.dto.CreateCodeDto;
import com.cookking.repositories.CodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  create by kimminsang 2021/09/14
 */

@Service
@RequiredArgsConstructor
public class CodeServiceImpl implements CodeService{

    private final CodeRepository codeRepository;
    private final CreateCodeMapper createCodeMapper;

    // 공통 코드 생성
    @Override
    public void create(CreateCodeDto createCodeDto) {
        codeRepository.save(createCodeMapper.toEntity(createCodeDto));
    }

    // 공통 코드 조회
    @Override
    public List<Code> findAll() {
        return codeRepository.findAll();
    }

}
