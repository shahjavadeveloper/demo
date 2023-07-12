package com.shah.jenkinsapi;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoApplication {
	
	
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
@PostConstruct
	public void init() {
		log.info("Application started.......");
	}

   @GetMapping("/message")
   public String getMessage() {
	   return "welcome to docker application";
   }

	public static void main(String[] args) {
		log.info("Application executed");
		SpringApplication.run(DemoApplication.class, args);
	}

}
