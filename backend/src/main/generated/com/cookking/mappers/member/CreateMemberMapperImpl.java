package com.cookking.mappers.member;

import com.cookking.models.member.Member;
import com.cookking.models.member.dto.CreateMemberDto;
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
public class CreateMemberMapperImpl implements CreateMemberMapper {

    @Override
    public Member toEntity(CreateMemberDto dto) {
        if ( dto == null ) {
            return null;
        }

        Member member = new Member();

        member.setEmail( dto.getEmail() );
        member.setNickName( dto.getNickName() );
        member.setLoginType( dto.getLoginType() );
        member.setToken( dto.getToken() );

        return member;
    }

    @Override
    public CreateMemberDto toDto(Member entity) {
        if ( entity == null ) {
            return null;
        }

        CreateMemberDto createMemberDto = new CreateMemberDto();

        createMemberDto.setEmail( entity.getEmail() );
        createMemberDto.setNickName( entity.getNickName() );
        createMemberDto.setLoginType( entity.getLoginType() );
        createMemberDto.setToken( entity.getToken() );

        return createMemberDto;
    }

    @Override
    public List<Member> toEntityList(List<CreateMemberDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Member> list1 = new ArrayList<Member>( list.size() );
        for ( CreateMemberDto createMemberDto : list ) {
            list1.add( toEntity( createMemberDto ) );
        }

        return list1;
    }

    @Override
    public List<CreateMemberDto> toDtoList(List<Member> list) {
        if ( list == null ) {
            return null;
        }

        List<CreateMemberDto> list1 = new ArrayList<CreateMemberDto>( list.size() );
        for ( Member member : list ) {
            list1.add( toDto( member ) );
        }

        return list1;
    }
}
