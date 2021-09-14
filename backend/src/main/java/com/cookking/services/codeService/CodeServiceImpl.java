package com.cookking.services.codeService;

import com.cookking.models.code.Code;
import com.cookking.models.code.dto.CodeDto;
import com.cookking.repositories.CodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *  create by kimminsang 2021/09/14
 */
@Service
@RequiredArgsConstructor
public class CodeServiceImpl implements CodeService{


    private final CodeRepository codeRepository;


    // TODO : 개발중
    @Override
    public void create(Code code) {
        codeRepository.save(code);
    }
}
