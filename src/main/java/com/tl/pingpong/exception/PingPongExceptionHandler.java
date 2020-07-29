package com.tl.pingpong.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice(basePackages = "com.tl.pingpong.controller")
public class PingPongExceptionHandler {
    private static Logger logger = LoggerFactory.getLogger(PingPongExceptionHandler.class);

    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ExceptionResp handleCommonException(HttpServletRequest request, Exception e) {
        String path = request.getServletPath();
        logger.error("Exception Raised, path:{}", path, e);
        String message = "Unchecked Exception: " + e.getClass().getName() + " -> " + e.getMessage();
        return new ExceptionResp(HttpStatus.INTERNAL_SERVER_ERROR, message, path);
    }
}