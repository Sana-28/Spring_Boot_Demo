package com.springStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SpringBootFirstApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstApiApplication.class, args);
	}
	/*@GetMapping("/hello")
	public @ResponseBody String Hello() {
		return "Hey Spring Boot";
	} */
}
