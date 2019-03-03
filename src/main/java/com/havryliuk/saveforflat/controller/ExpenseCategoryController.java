package com.havryliuk.saveforflat.controller;

import com.havryliuk.saveforflat.entity.DefaultExpenseCategory;
import com.havryliuk.saveforflat.entity.ExpenseCategory;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("expenseCategories")
public class ExpenseCategoryController {

    @GetMapping
    public List<ExpenseCategory> getExpenseCategories() {
        return Collections.singletonList(DefaultExpenseCategory.builder().build());
    }
}
