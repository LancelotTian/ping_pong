package com.tl.pingpong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.tl.pingpong.*"})
public class PingPongApp {
    public static void main(String[] args) {
        SpringApplication.run(PingPongApp.class, args);
    }
}
