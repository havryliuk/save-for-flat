package com.havryliuk.saveforflat.spring;

import com.havryliuk.saveforflat.controller.ExpenseCategoryController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {
    @Bean
    public ExpenseCategoryController expenseCategoryController() {
        return new ExpenseCategoryController();
    }
}
