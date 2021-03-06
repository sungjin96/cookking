package com.cookking.services.code;

import com.cookking.models.code.Code;
import com.cookking.models.code.dto.CreateCodeDto;

import java.util.List;


/**
 *  create by kimminsang 2021/09/14
 */
public interface CodeService {
    //공통코드 추가
    public void create(CreateCodeDto createCodeDto);
    //공통코드 모두 조회
    public List<Code> findAll();
}
