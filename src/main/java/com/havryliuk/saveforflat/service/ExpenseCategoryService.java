package com.havryliuk.saveforflat.service;

import com.havryliuk.saveforflat.entity.ExpenseCategory;

import java.util.List;

public interface ExpenseCategoryService {

    List<ExpenseCategory> getExpenseCategories();

    ExpenseCategory addExpenseCategory(String parent, ExpenseCategory expenseCategory);
}
