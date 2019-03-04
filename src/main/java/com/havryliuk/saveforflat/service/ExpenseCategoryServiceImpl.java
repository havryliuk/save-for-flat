package com.havryliuk.saveforflat.service;

import com.havryliuk.saveforflat.entity.ExpenseCategory;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ExpenseCategoryServiceImpl implements ExpenseCategoryService {

    @Override
    public List<ExpenseCategory> getExpenseCategories() {
        return Collections.singletonList(
                ExpenseCategory.builder().name("FOOD").categories(
                        Collections.singletonList(ExpenseCategory.builder().name("Alcohol").build()))
                        .build());
    }

    @Override
    public ExpenseCategory addExpenseCategory(String parent) {
        return null;
    }
}
