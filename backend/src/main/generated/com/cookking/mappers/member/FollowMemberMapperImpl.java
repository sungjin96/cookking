package com.cookking.mappers.member;

import com.cookking.models.member.Member;
import com.cookking.models.member.dto.FollowMemberDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-17T11:16:22+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class FollowMemberMapperImpl implements FollowMemberMapper {

    @Override
    public Member toEntity(FollowMemberDto dto) {
        if ( dto == null ) {
            return null;
        }

        Member member = new Member();

        member.setEmail( dto.getEmail() );

        return member;
    }

    @Override
    public FollowMemberDto toDto(Member entity) {
        if ( entity == null ) {
            return null;
        }

        FollowMemberDto followMemberDto = new FollowMemberDto();

        followMemberDto.setEmail( entity.getEmail() );

        return followMemberDto;
    }

    @Override
    public List<Member> toEntityList(List<FollowMemberDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Member> list1 = new ArrayList<Member>( list.size() );
        for ( FollowMemberDto followMemberDto : list ) {
            list1.add( toEntity( followMemberDto ) );
        }

        return list1;
    }

    @Override
    public List<FollowMemberDto> toDtoList(List<Member> list) {
        if ( list == null ) {
            return null;
        }

        List<FollowMemberDto> list1 = new ArrayList<FollowMemberDto>( list.size() );
        for ( Member member : list ) {
            list1.add( toDto( member ) );
        }

        return list1;
    }
}
