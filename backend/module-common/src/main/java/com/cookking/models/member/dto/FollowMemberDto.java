package com.cookking.models.member.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * Created by marathoner on 2021/09/04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FollowMemberDto {
    @Null
    @Email
    private String email;

    @NotNull
    @Email
    private String followingEmail;
}
