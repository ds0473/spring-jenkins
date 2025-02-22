package com.jenkins.spring_jenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
 static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
@PostConstruct
public void init(){
	logger.info("Application is initialized");
}
	public static void main(String[] args) {

		SpringApplication.run(SpringJenkinsApplication.class, args);
		logger.info("Application is executed");
	}

}
