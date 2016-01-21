package com.example;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.Banner;
import org.springframework.boot.actuate.system.ApplicationPidFileWriter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@Configuration
@EnableSwagger2
@EnableAdminServer
@EnableZuulServer
public class DemoApplication {


    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .listeners(new ApplicationPidFileWriter())
                .bannerMode(Banner.Mode.CONSOLE)
                .sources(DemoApplication.class)
                .run(args);
    }
}
