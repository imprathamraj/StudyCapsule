package com.example.demo.documentation;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.*;
        import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI studyCapsuleOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("StudyCapsule API")
                        .version("1.0.1")
                        .description("**Demo Spring Boot project to learn Swagger (Springdoc OpenAPI). Covers CRUD for capsule data using Spring Boot, JPA, MySQL. Exploring API design best practices through hands-on learning.**")
                        .termsOfService("https://www.apache.org/licenses/LICENSE-2.0")
                        .contact(new Contact()
                                .name("Pratham Raj")
                                .url("https://www.linkedin.com/in/pratham-raj-516071234/"))
                        .license(new License()
                                .name("Github")
                                .url("https://github.com/imprathamraj/StudyCapsule")))
                .servers(List.of(
                        new Server().url("http://localhost:8080").description("Local server")
                ));
    }
}
