package com.cookking.services.codeService;

import com.cookking.models.code.Code;
import com.cookking.models.code.dto.CodeDto;

import java.util.List;


/**
 *  create by kimminsang 2021/09/14
 */
public interface CodeService {
    
    //공통코드 추가
    public void create(CodeDto codeDto);
    //공통코드 모두 조회
    public List<Code> findAll();
    //공통코드 수정
    public void update(Long codeId,CodeDto codeDto);
}
