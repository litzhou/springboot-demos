package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author jameszhou
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
       // System.setProperty("spring.profiles.active","dev");
        SpringApplication.run(Application.class, args);
    }

}
