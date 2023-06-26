package com.example.lv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Lv1Application {

    public static void main(String[] args) {
        SpringApplication.run(Lv1Application.class, args);
    }

}
