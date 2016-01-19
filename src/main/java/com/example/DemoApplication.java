package com.example;

import org.springframework.boot.actuate.system.ApplicationPidFileWriter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class DemoApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .listeners(new ApplicationPidFileWriter())
                .sources(DemoApplication.class)
                .run(args);

    }
}
