package com.flexy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@EnableAutoConfiguration
public class SampleServiceConsumer {

    public static void main(String[] args) {
        SpringApplication.run(SampleServiceConsumer.class, args);
    }

}
