package com.example.CS4125;

import com.example.CS4125.config.SwaggerConfiguartion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SwaggerConfiguartion.class)
public class Cs4125Application {

	public static void main(String[] args) {
		SpringApplication.run(Cs4125Application.class, args);
	}

}
