package com.vishnuvy;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Employees API", version = "2.0", description = "Employees Information"))
public class SwaggerSpringDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SwaggerSpringDemoApplication.class, args);
	}
}