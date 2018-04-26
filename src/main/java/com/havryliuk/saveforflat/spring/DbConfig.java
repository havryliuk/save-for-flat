package com.havryliuk.saveforflat.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.havryliuk.saveforflat.db.DefaultExpenseRepository;
import com.havryliuk.saveforflat.db.ExpenseCategoryDao;

@Configuration
public class DbConfig {
    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate();
    }

    @Bean
    public DefaultExpenseRepository defaultExpenseRepository() {
        return new DefaultExpenseRepository();
    }

    @Bean
    public ExpenseCategoryDao expenseCategoryDao() {
        return new ExpenseCategoryDao();
    }
}
