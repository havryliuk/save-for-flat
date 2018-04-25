package com.havryliuk.saveforflat.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.havryliuk.saveforflat.entity.ExpenseCategory;

@Service
public class ExpenseCategoryServiceImpl implements ExpenseCategoryService {
    @Override
    public List<ExpenseCategory> getAllExpenseCategories() {
        return null;
    }

    @Override
    public boolean addSubcategoryForCategory(String categoryName, String subcategoryName) {
        return false;
    }

    @Override
    public boolean removeSubcategoryFromCategory(String categoryName, String subcategoryName) {
        return false;
    }
}
