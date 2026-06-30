package com.crud.FirstCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FirstCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstCrudApplication.class, args);
	}

}
