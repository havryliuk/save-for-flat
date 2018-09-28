package com.havryliuk.saveforflat.controller;

import com.havryliuk.saveforflat.entity.ExpenseCategory;
import com.havryliuk.saveforflat.service.ExpenseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("expenseCategories")
public class ExpenseCategoryController {
    @Autowired
    private ExpenseCategoryService expenseCategoryService;

    @GetMapping
    public ModelAndView getExpenseCategories() {
        List<ExpenseCategory> categories = expenseCategoryService.getAllExpenseCategories();
        return new ModelAndView("expenseCategories/expenseCategories",
                                Collections.singletonMap("categories", categories));
    }

    @GetMapping("/new")
    public ModelAndView getAddNewCategory() {
        return new ModelAndView("expenseCategories/new");
    }

    @PostMapping
    public ModelAndView addNewExpenseCategory(
        @RequestParam("name")
            String name) {
        int id = expenseCategoryService.addCategory(name);
        return getExpenseCategory(id);
    }

    @GetMapping("{id}")
    public ModelAndView getExpenseCategory(@PathVariable("id") int id) {
        ExpenseCategory expenseCategory = expenseCategoryService.getExpenseCategoryById(id);
        return new ModelAndView("expenseCategories/expenseCategory", "expenseCategory", expenseCategory);
    }
}
