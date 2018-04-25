package com.havryliuk.saveforflat.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.havryliuk.saveforflat.service.ExpenseCategoryService;
import com.havryliuk.saveforflat.service.ExpenseCategoryServiceImpl;

@Configuration
public class ServiceConfig {
    @Bean
    ExpenseCategoryService expenseCategoryService() {
        return new ExpenseCategoryServiceImpl();
    }
}
