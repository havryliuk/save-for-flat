package com.havryliuk.saveforflat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.havryliuk.saveforflat.db.ExpenseCategoryDao;
import com.havryliuk.saveforflat.entity.ExpenseCategory;

@Service
public class ExpenseCategoryServiceImpl implements ExpenseCategoryService {
    private final ExpenseCategoryDao expenseCategoryDao;

    @Autowired
    public ExpenseCategoryServiceImpl(ExpenseCategoryDao expenseCategoryDao) {
        this.expenseCategoryDao = expenseCategoryDao;
    }

    @Override
    public List<ExpenseCategory> getAllExpenseCategories() {
        return expenseCategoryDao.getAllExpenseCategories();
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
