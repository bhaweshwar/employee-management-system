package com.example.ems.Employee.config;  // ✅ Keep config folder clean

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI employeeAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Employee Management System API")
                        .description("API documentation for Employee REST APIs")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Prathamesh")
                                .email("prathaam19@gmail.com")
                                .url("https://github.com/Prathamesh596")
                        )
                );
    }
}
