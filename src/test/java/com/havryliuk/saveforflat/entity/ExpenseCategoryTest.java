package com.havryliuk.saveforflat.entity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpenseCategoryTest {
    @Test
    public void testAddSubcategories() {
        ExpenseCategory category = new DefaultExpenseCategory("Groceries");
        category.addSubcategory("Bread");
        assertEquals(1, category.getSubcategories().size());
    }

    @Test
    public void testRemoveSubcategories() {
        ExpenseCategory category = new DefaultExpenseCategory("Leisure");
        category.addSubcategory("Books");
        category.addSubcategory("Concerts");
        category.removeSubcategory("Books");
        assertEquals(1, category.getSubcategories().size());
    }
}
