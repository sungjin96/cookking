package com.cookking.services.Member;

import com.cookking.mappers.member.CreateMemberMapper;
import com.cookking.mappers.member.FollowMemberMapper;
import com.cookking.mappers.member.MemberMapper;
import com.cookking.models.member.Member;
import com.cookking.models.member.dto.CreateMemberDto;
import com.cookking.models.member.dto.FollowMemberDto;
import com.cookking.models.member.dto.MemberDto;
import com.cookking.models.member.dto.UpdateMemberDto;
import com.cookking.repositories.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by marathoner on 2021/07/16.
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final CreateMemberMapper createMemberMapper;
    private final FollowMemberMapper followMemberMapper;

    @Override
    public Member findById(Long memberId) {
        return memberRepository.getById(memberId);
    }

    @Override
    public Member findByEmail(String email) {
        return memberRepository.getByEmail(email);
    }

    @Override
    public List<Member> findAll() {
        return null;
    }

    @Override
    public void create(CreateMemberDto createMemberDto) {
        Member member = createMemberMapper.toEntity(createMemberDto);
        memberRepository.save(member);
    }

    @Override
    public void update(Long memberId, UpdateMemberDto updateMemberDto) {
        Member member = memberRepository.getById(memberId);
        memberRepository.save(member);
    }

    @Override
    public void follow(FollowMemberDto followMemberDto) {
        Member member = this.findByEmail(followMemberDto.getEmail());
        Member following = this.findByEmail(followMemberDto.getFollowingEmail());
        member.getFollowing().add(following);
        memberRepository.save(member);
    }

    @Override
    public void unFollow(FollowMemberDto followMemberDto) {

    }
}
