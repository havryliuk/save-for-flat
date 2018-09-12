package com.havryliuk.saveforflat.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.havryliuk.saveforflat.db.DefaultExpenseRepository;
import com.havryliuk.saveforflat.db.ExpenseCategoryDao;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

@Configuration
@PropertySource("classpath:db.properties")
public class DbConfig {
    @Value("${db.url}")
    private String dbUrl;
    @Value("${db.name}")
    private String dbName;

    @Bean
    public MongoDatabase mongoDatabase() {
        MongoClientURI uri = new MongoClientURI(dbUrl);
        return new MongoClient(uri).getDatabase(dbName);
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
