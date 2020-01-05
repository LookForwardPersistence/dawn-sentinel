package com.dawn.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Dawn on 2020-01-04.
 */
@SpringBootApplication(scanBasePackages = "com.dawn.sentinel.*")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
