package com.cookking.services.codeService;

import com.cookking.models.code.Code;
import com.cookking.models.code.dto.CodeDto;
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


    // 공통 코드 생성
    @Override
    public void create(Code code) {
        codeRepository.save(code);
    }
    // 공통 코드 조회
    @Override
    public List<Code> findAll() {
        return codeRepository.findAll();
    }
    // 공통 코드 수정
    @Override
    public void update(Long codeId, CodeDto codeDto) {
      Code code = codeRepository.getById(codeId);
      codeRepository.save(code);
    }
}
