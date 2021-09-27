package com.cookking.controllers.v1.member;

import com.cookking.mappers.member.MemberMapper;
import com.cookking.models.member.dto.CreateMemberDto;
import com.cookking.models.member.dto.FollowMemberDto;
import com.cookking.models.member.dto.MemberDto;
import com.cookking.models.member.dto.UpdateMemberDto;
import com.cookking.services.Member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by marathoner on 2021/07/16.
 */
@RequestMapping("/api/v1/member")
@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;
    private final MemberMapper memberMapper;

    @GetMapping("/{memberId}")
    public ResponseEntity<MemberDto> getExampleById(@PathVariable("memberId") Long memberId) {
        MemberDto memberDto = memberMapper.toDto(memberService.findById(memberId));
        return new ResponseEntity<MemberDto>(memberDto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewExample(@RequestBody @Validated CreateMemberDto createMemberDto) {
        memberService.create(createMemberDto);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{memberId}")
    public ResponseEntity updateExampleById(@PathVariable("memberId") Long memberId, @RequestBody @Validated UpdateMemberDto updateMemberDto) {
        memberService.update(memberId, updateMemberDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/follow")
    public ResponseEntity follow(@RequestBody @Validated FollowMemberDto followMemberDto) {
        memberService.follow(followMemberDto);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PostMapping("/un-follow")
    public ResponseEntity unFollow(@RequestBody @Validated FollowMemberDto followMemberDto) {
        memberService.unFollow(followMemberDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
