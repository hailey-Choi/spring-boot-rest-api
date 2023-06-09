package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// is a combination of ...
// @SpringBootConfiguration : allows to resister extra beans in the context or import additional configuration classes (Java-based configuration)
// @EnableAutoConfiguration : enable Spring Boot's auto-configuration mechanism
// @ComponentScan : enable @Component scan on the package where the application is located
public class SpringbootRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestApiApplication.class, args);
	}

}
