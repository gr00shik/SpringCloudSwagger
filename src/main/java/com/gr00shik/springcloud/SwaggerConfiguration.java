package com.gr00shik.springcloud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static springfox.documentation.builders.PathSelectors.any;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public Docket getDocket1(){
        return new Docket(DocumentationType.SWAGGER_2).
                groupName("Dock1").
                select().
                apis(RequestHandlerSelectors.basePackage("com.gr00shik.springcloud")).
//                paths(any()).
                paths(regex("/get1")).
                build().
                apiInfo(apiInfo());
    }

    @Bean
    public ApiInfo apiInfo(){
        return new ApiInfo("Cloud Title",
                "Cloud Config description",
                "0.1",

                "http://google.com",
                 getContact(),
                "Public licence",
                "http://licence.com");
    }
    @Bean
    public Contact getContact(){
        return new Contact("Sergey",
                "http://opennet.ru",
                "gr00shik@gmail.com");
    }

}
