package com.cookking.mappers;

import com.cookking.configs.components.DateComponent;
import com.cookking.models.common.EntityMapper;
import com.cookking.models.member.Member;
import org.mapstruct.Mapper;

/**
 * Created by marathoner on 2021/08/24
 */
public interface MemberMapper<T> extends EntityMapper<T, Member> {
}
