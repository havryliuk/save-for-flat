package com.havryliuk.saveforflat.spring;

import com.havryliuk.saveforflat.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SaveForFlatSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaveForFlatSpringBootApplication.class, args);
    }
}
