package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner comandLineRunner(StudentRepository repository){
        return args -> {
            Student eric = new Student (
                    "Eric",
                    "eric@gmail.com",
                    LocalDate.of(1999, JANUARY,5)
            );

            Student rosa = new Student (
                    "Rosa",
                    "rosa@gmail.com",
                    LocalDate.of(2001, MARCH,20)
            );

            repository.saveAll(
                    List.of(eric, rosa)
            );
        };
    }
}
