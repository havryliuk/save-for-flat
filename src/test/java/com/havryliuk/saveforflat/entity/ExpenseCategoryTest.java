package com.havryliuk.saveforflat.entity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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

    @Test
    public void testHashCode() {
        ExpenseCategory category = new DefaultExpenseCategory("Travelling");
        category.addSubcategory("Tickets");
        assertEquals(-938464885, category.hashCode());
    }

    @Test
    public void testEqualsForObjectOfDifferentType() {
        ExpenseCategory category = new DefaultExpenseCategory("");
        assertFalse(category.equals(""));
    }

    @Test
    public void testEqualsWhenListsOfSubcategoriesAreUnequal() {
        ExpenseCategory category1 = new DefaultExpenseCategory("Medicine");
        category1.addSubcategory("Pain killers");
        ExpenseCategory category2 = new DefaultExpenseCategory("Medicine");
        assertFalse(category1.equals(category2));
    }

    @Test
    public void testEqualsWhenCategoryNamesAreDifferent() {

        ExpenseCategory category1 = new DefaultExpenseCategory("Medicine");
        category1.addSubcategory("Pain killers");
        ExpenseCategory category2 = new DefaultExpenseCategory("Car");
        category2.addSubcategory("Pain killers");
        assertFalse(category1.equals(category2));
    }
}
