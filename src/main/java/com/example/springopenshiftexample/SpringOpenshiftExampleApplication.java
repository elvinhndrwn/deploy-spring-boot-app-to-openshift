package com.example.springopenshiftexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringOpenshiftExampleApplication {

	@GetMapping("/")
	public String example1(){
		return "Hello World";
	}

	@GetMapping("/{text}")
	public String example2(@PathVariable String text) {
		return "Hello " + text;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringOpenshiftExampleApplication.class, args);
	}

}
