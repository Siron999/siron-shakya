package com.portfolio.siron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class SironApplication {

    public static void main(String[] args) {
        SpringApplication.run(SironApplication.class, args);
    }

}
