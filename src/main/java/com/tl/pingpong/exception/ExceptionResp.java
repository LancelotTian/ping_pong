package com.tl.pingpong.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ExceptionResp implements Serializable {
    private Integer status;
    private String message;
    private String path;
    private LocalDateTime timestamp;
    private String error;

    public ExceptionResp(HttpStatus httpStatus, String message, String path) {
        this.status = httpStatus.value();
        this.error = httpStatus.getReasonPhrase();
        this.timestamp = LocalDateTime.now();
        this.message = message;
        this.path = path;
    }
}
