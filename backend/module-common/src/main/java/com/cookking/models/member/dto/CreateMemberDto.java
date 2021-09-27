package com.cookking.models.member.dto;

import com.cookking.models.member.LoginType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * Created by marathoner on 2021/08/24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateMemberDto {

    @NotNull
    @Email
    private String email;

    @Null
    private String nickName;

    @NotNull
    private LoginType loginType;

    @Null
    private String token;

}
