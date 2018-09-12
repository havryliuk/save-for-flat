package com.havryliuk.saveforflat.controller;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ExpenseCategoryControllerTest {
    @Test
    public void testGetExpenseCategories() {
        ModelAndView mav = new ExpenseCategoryController().getExpenseCategories();
        assertEquals("expenseCategories", mav.getViewName());
        assertTrue(mav.getModel().keySet().contains("categories"));
    }
}
