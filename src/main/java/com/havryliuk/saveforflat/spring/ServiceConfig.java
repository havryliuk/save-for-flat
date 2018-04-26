package com.havryliuk.saveforflat.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.havryliuk.saveforflat.service.ExpenseCategoryService;
import com.havryliuk.saveforflat.service.ExpenseCategoryServiceImpl;

@Configuration
@Import(DbConfig.class)
public class ServiceConfig {
    private final DbConfig dbConfig;

    @Autowired
    public ServiceConfig(DbConfig dbConfig) {
        this.dbConfig = dbConfig;
    }

    @Bean
    ExpenseCategoryService expenseCategoryService() {
        return new ExpenseCategoryServiceImpl(dbConfig.expenseCategoryDao());
    }
}
