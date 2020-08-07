package com.tl.pingpong.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    private static Logger logger = LoggerFactory.getLogger(HealthController.class);

    @GetMapping(value = "/ping")
    public ResponseEntity<String> ping() {
        logger.info("Ping...");
        return ResponseEntity.status(HttpStatus.OK).body("pong at " + System.currentTimeMillis() +"ms");
    }
}