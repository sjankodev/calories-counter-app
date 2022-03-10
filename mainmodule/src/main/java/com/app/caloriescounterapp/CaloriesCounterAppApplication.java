package com.app.caloriescounterapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = {"com.*"})
@SpringBootApplication(scanBasePackages = {"com.*"})
public class CaloriesCounterAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaloriesCounterAppApplication.class, args);
    }

}
