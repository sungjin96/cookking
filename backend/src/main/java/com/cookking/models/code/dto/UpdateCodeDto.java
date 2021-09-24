package com.cookking.models.code.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.sql.Timestamp;


/**
 * Created by kimminsang on 2021/08/29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateCodeDto {
    @NotNull
    private Long id;

    @NotNull
    private Long parentsId;

    @NotNull
    private String name;

    @NotNull
    private Float ord;


}
