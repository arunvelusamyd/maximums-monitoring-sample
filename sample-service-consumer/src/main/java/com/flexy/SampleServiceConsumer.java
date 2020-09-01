package com.flexy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class SampleServiceConsumer {

    public static void main(String[] args) {
        SpringApplication.run(SampleServiceConsumer.class, args);
    }

}
