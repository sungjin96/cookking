package com.cookking.models.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.sql.Timestamp;

/**
 * Created by marathoner on 2021/07/16.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExampleDto {
    @Null
    private Long id;

    @NotNull
    private String content;

    @Null
    private Timestamp createdAt;

    @Null
    private Timestamp updatedAt;

    @Null
    private Timestamp deletedAt;

}
