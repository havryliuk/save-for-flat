package com.havryliuk.saveforflat.controller;

import com.havryliuk.saveforflat.entity.ExpenseCategory;
import com.havryliuk.saveforflat.service.ExpenseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("expenseCategories")
public class ExpenseCategoryController {

    @Autowired
    private ExpenseCategoryService expenseCategoryService;

    @GetMapping
    public List<ExpenseCategory> getExpenseCategories() {
        return expenseCategoryService.getExpenseCategories();
    }

    @PostMapping
    public ExpenseCategory addExpenseCategory(String parent) {
        return expenseCategoryService.addExpenseCategory(parent);
    }
}
