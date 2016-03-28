package com.example;

import com.example.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RestController
	static class HelloRestController {
		@Autowired
		MessageMapper messageMapper;
		@RequestMapping("/")
		public String hello(){
			return messageMapper.findOne("000001").getMessage();
		}
	}

}
