package com.havryliuk.saveforflat.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import com.havryliuk.saveforflat.entity.ExpenseCategory;

@Repository
public class DefaultExpenseRepository implements ExpenseRepository {
    @Autowired
    private JdbcTemplate jdbcTempate;

    @Override
    public List<ExpenseCategory> getAllExpenseCategories() {
        return null;
    }
}
