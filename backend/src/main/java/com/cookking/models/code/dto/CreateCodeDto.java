package com.cookking.models.code.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.sql.Timestamp;


/**
 * Created by kimminsang on 2021/09/22
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateCodeDto {
    @NotNull
    private Long id;

    @NotNull
    private Long parents_id;

    @NotNull
    private String name;

    @NotNull
    private Float ord;

    @Null
    private Timestamp createdAt;
}
