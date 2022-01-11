package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository)    {
        return args -> {
            Student prajwalkb = new Student(
                    "Prajwal",
                    "K B",
                    "kbprajwal8@gmail.com",
                    21
            );
            studentRepository.save(prajwalkb);
        };
    }
}
