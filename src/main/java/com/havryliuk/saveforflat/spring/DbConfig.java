package com.havryliuk.saveforflat.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.havryliuk.saveforflat.db.DefaultExpenseRepository;
import com.havryliuk.saveforflat.db.ExpenseCategoryDao;

@Configuration
public class DbConfig {
    @Bean
    public DefaultExpenseRepository defaultExpenseRepository() {
        return new DefaultExpenseRepository();
    }

    @Bean
    public ExpenseCategoryDao expenseCategoryDao() {
        return new ExpenseCategoryDao();
    }
}
