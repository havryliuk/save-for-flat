package com.havryliuk.saveforflat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;

@Controller
@RequestMapping("/expenseCategories")
public class ExpenseCategoryController {
    @GetMapping
    public ModelAndView getExpenseCategories() {
        return new ModelAndView("expenseCategories", Collections.singletonMap("categories", "categories"));
    }
}
