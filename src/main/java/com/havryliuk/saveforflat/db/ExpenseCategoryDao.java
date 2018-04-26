package com.havryliuk.saveforflat.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.havryliuk.saveforflat.entity.ExpenseCategory;

public class ExpenseCategoryDao {
    @Autowired
    private DefaultExpenseRepository repository;

    public List<ExpenseCategory> getAllExpenseCategories() {
        return new ArrayList<>();
    }
}
