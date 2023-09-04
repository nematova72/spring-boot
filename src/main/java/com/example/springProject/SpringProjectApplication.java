package com.example.springProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringProjectApplication.class, args);
	}


	@Scheduled(initialDelay = 1000L, fixedDelay = 2000L)
	public void startDelay(){
		System.out.println("New startDelay " + new Date());
	}

	@Scheduled(cron = "0 17 15 * * *")
	public void startCron(){
		System.out.println("New startCron " + new Date());
	}

}
