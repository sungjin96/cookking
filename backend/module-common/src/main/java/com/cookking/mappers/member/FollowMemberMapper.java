package com.cookking.mappers.member;

import com.cookking.configs.components.DateComponent;
import com.cookking.models.common.EntityMapper;
import com.cookking.models.member.Member;
import com.cookking.models.member.dto.FollowMemberDto;
import org.mapstruct.Mapper;

/**
 * Created by marathoner on 2021/08/24
 */
@Mapper(uses = {DateComponent.class}, componentModel = "spring")
public interface FollowMemberMapper extends EntityMapper<FollowMemberDto, Member> {
}
