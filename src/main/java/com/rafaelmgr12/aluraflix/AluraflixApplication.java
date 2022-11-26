package com.rafaelmgr12.aluraflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class AluraflixApplication {

    public static void main(String[] args) {
        SpringApplication.run(AluraflixApplication.class, args);
    }

}
