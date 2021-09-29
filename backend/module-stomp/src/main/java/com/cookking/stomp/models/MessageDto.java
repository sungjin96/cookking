package com.cookking.stomp.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by marathoner on 2021/09/29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MessageDto {
    private String message;
    private String fromLogin;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
