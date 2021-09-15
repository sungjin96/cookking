package com.cookking.services.codeService;

import com.cookking.models.code.Code;
import com.cookking.models.code.dto.CodeDto;

import java.util.List;


/**
 *  create by kimminsang 2021/09/14
 */
public interface CodeService {

    public void create(Code code);
    public List<Code> findAll();
}
