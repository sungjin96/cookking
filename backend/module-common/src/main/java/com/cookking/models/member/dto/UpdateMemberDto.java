package com.cookking.models.member.dto;

import com.cookking.models.member.LoginType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * Created by marathoner on 2021/08/24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateMemberDto {
    @NotNull
    private Long id;

    @Null
    private String nickName;

    @Null
    private LoginType loginType;

    @Null
    private String token;
}
