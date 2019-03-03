package com.havryliuk.saveforflat.controller;

import com.havryliuk.saveforflat.entity.DefaultExpenseCategory;
import com.havryliuk.saveforflat.entity.ExpenseCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("expenseCategory")
public class ExpenseCategoryController {

    @GetMapping
    public ModelAndView getExpenseCategories() {
        return new ModelAndView("expenseCategories/expenseCategories", Collections.singletonMap("categories",
                DefaultExpenseCategory.builder().build()));
    }

    @GetMapping("/new")
    public ModelAndView getAddNewCategory() {
        return new ModelAndView("expenseCategories/new");
    }

    @PostMapping
    public ModelAndView addNewExpenseCategory(
            @RequestParam("name")
                    String name) {
        return getExpenseCategory(1);
    }

    @GetMapping("{id}")
    public ModelAndView getExpenseCategory(@PathVariable("id") int id) {
        return new ModelAndView("expenseCategories/expenseCategory", "expenseCategory",
                DefaultExpenseCategory.builder().build());
    }
}
