package com.cookking.controllers.v1.code;

import com.cookking.models.code.Code;
import com.cookking.models.code.dto.CreateCodeDto;
import com.cookking.services.codeService.CodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
*  create by kimminsang 2021/09/14
*/
@RestController
@RequestMapping("/api/v1/code")
@RequiredArgsConstructor
public class CodeController {

    private final CodeService codeService;


    // 공통코드 추가
    @PostMapping
    public ResponseEntity createCommonCode(@RequestBody @Validated CreateCodeDto createCodeDto){
        codeService.create(createCodeDto);
        return new ResponseEntity(HttpStatus.CREATED);
    }
    // 공통코드 모두 조회
    @GetMapping
    public ResponseEntity<List<Code>> searchAllCode(){
        List<Code> getCodes = codeService.findAll();
        return new ResponseEntity(getCodes,HttpStatus.OK);
    }
    


}
