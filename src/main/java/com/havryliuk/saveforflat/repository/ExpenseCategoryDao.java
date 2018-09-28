package com.havryliuk.saveforflat.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.havryliuk.saveforflat.entity.ExpenseCategory;

public class ExpenseCategoryDao {
    @Autowired
    private ExpenseRepository repository;

    public List<ExpenseCategory> getAllExpenseCategories() {
        return new ArrayList<>();
    }

    public int addCategory(String name) {
        return repository.addExpenseCategory(name);
    }

    public ExpenseCategory getExpenseCategoryById(int id) {
        return repository.getExpenseCategoryById(id);
    }
}
