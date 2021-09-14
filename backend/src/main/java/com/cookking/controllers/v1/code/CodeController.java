package com.cookking.controllers.v1.code;

import com.cookking.models.code.dto.CodeDto;
import com.cookking.services.codeService.CodeService;
import com.cookking.services.example.ExampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


/**
*  create by kimminsang 2021/09/14
*/
@RestController
@RequestMapping("/api/v1/code")
@RequiredArgsConstructor
public class CodeController {

    private final CodeService codeService;

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<String>("hello", HttpStatus.OK);
    }

    // 공통코드추가
    @PostMapping
    public ResponseEntity createCommonCode(@RequestBody @Validated CodeDto codeDto){
        codeService.create(codeDto);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
