package com.ruhul.tomcatsse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TomcatsseApplication {

	public static void main(String[] args) {
		SpringApplication.run(TomcatsseApplication.class, args);
	}

}
