package com.havryliuk.saveforflat.service;

import java.util.List;

import com.havryliuk.saveforflat.entity.DefaultExpenseCategory;
import com.havryliuk.saveforflat.entity.ExpenseCategory;

public interface ExpenseCategoryService {
    List<ExpenseCategory> getAllExpenseCategories();

    boolean addSubcategoryForCategory(String categoryName, String subcategoryName);

    boolean removeSubcategoryFromCategory(String categoryName, String subcategoryName);

    int addCategory(String name);

    ExpenseCategory getExpenseCategoryById(int id);
}
