package com.havryliuk.saveforflat.db;

import java.util.List;

import com.havryliuk.saveforflat.entity.ExpenseCategory;

public interface ExpenseRepository {
    List<ExpenseCategory> getAllExpenseCategories();
}
