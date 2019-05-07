package com.rabbitpoc.test.publisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Import(RabbitmqConfig.class)
public class PublisherApplication {


	public static void main(String[] args) {
		SpringApplication.run(PublisherApplication.class, args);
	}


	

}
