package com.cookking.services.codeService;

import com.cookking.mappers.code.CreateCodeMapper;
import com.cookking.models.code.Code;
import com.cookking.models.code.dto.CreateCodeDto;
import com.cookking.repositories.CodeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  create by kimminsang 2021/09/14
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class CodeServiceImpl implements CodeService{

    private final CodeRepository codeRepository;
    private final CreateCodeMapper createCodeMapper;

    // 공통 코드 생성
    @Override
    public void create(CreateCodeDto createCodeDto) {
        Code code = createCodeMapper.toEntity(createCodeDto);
        codeRepository.save(code);
    }

    // 공통 코드 조회
    @Override
    public List<Code> findAll() {
        return codeRepository.findAll();
    }

}
