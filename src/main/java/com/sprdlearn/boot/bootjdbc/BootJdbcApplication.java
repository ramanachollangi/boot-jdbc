package com.sprdlearn.boot.bootjdbc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;


@SpringBootApplication
public class BootJdbcApplication {

    public static void main(String[] args) {
       SpringApplication.run(BootJdbcApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(RequestMappingHandlerMapping mapping) {
        return args -> {
            mapping.getHandlerMethods().forEach((key, value) -> System.out.println(key + " -> " + value));
        };
    }

}
