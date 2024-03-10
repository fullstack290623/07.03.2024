package com.example.demo;

import com.example.demo.service.RedisDetailsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(value = {RedisDetailsConfig.class})
@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring1Application.class, args);
	}

}
