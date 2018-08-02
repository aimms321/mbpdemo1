package com.example.mbpdemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mbpdemo1.*")
public class Mbpdemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Mbpdemo1Application.class, args);
	}
}
