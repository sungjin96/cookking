package com.cookking.mappers.member;

import com.cookking.models.alarm.Alarm;
import com.cookking.models.member.Member;
import com.cookking.models.member.dto.MemberDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-17T11:16:21+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public Member toEntity(MemberDto dto) {
        if ( dto == null ) {
            return null;
        }

        Member member = new Member();

        member.setId( dto.getId() );
        member.setEmail( dto.getEmail() );
        member.setNickName( dto.getNickName() );
        member.setLoginType( dto.getLoginType() );
        member.setToken( dto.getToken() );
        member.setCreatedAt( dto.getCreatedAt() );
        member.setUpdatedAt( dto.getUpdatedAt() );
        member.setDeletedAt( dto.getDeletedAt() );
        List<Alarm> list = dto.getAlarms();
        if ( list != null ) {
            member.setAlarms( new ArrayList<Alarm>( list ) );
        }

        return member;
    }

    @Override
    public MemberDto toDto(Member entity) {
        if ( entity == null ) {
            return null;
        }

        MemberDto memberDto = new MemberDto();

        memberDto.setId( entity.getId() );
        memberDto.setEmail( entity.getEmail() );
        memberDto.setNickName( entity.getNickName() );
        memberDto.setLoginType( entity.getLoginType() );
        List<Alarm> list = entity.getAlarms();
        if ( list != null ) {
            memberDto.setAlarms( new ArrayList<Alarm>( list ) );
        }
        memberDto.setToken( entity.getToken() );
        memberDto.setCreatedAt( entity.getCreatedAt() );
        memberDto.setDeletedAt( entity.getDeletedAt() );
        memberDto.setUpdatedAt( entity.getUpdatedAt() );

        return memberDto;
    }

    @Override
    public List<Member> toEntityList(List<MemberDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Member> list1 = new ArrayList<Member>( list.size() );
        for ( MemberDto memberDto : list ) {
            list1.add( toEntity( memberDto ) );
        }

        return list1;
    }

    @Override
    public List<MemberDto> toDtoList(List<Member> list) {
        if ( list == null ) {
            return null;
        }

        List<MemberDto> list1 = new ArrayList<MemberDto>( list.size() );
        for ( Member member : list ) {
            list1.add( toDto( member ) );
        }

        return list1;
    }
}
