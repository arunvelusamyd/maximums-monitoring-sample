package com.flexy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SampleZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleZipkinServerApplication.class, args);
    }

}
