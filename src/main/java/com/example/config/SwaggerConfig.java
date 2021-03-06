package com.example.config;

import de.flapdoodle.embed.mongo.config.IMongodConfig;
import de.flapdoodle.embed.mongo.config.MongodConfigBuilder;
import de.flapdoodle.embed.mongo.config.Storage;
import de.flapdoodle.embed.mongo.distribution.Version;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.IOException;

/**
 * Created by julien on 19/01/2016.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example"))
                .paths(PathSelectors.ant("/rest/*"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "My REST API",
                "Some custom description of API.",
                "1.0",
                "Terms of service",
                "myeaddress@company.com", "Home", "/");
        return apiInfo;
    }

    @Bean
    IMongodConfig mongodConfig() {
        Storage replication = new Storage("databaseDir", null, 0);

        try {
            return new MongodConfigBuilder()
                    .version(Version.Main.PRODUCTION)
                    .replication(replication)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
