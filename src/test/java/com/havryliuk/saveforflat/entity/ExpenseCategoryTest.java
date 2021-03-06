package com.havryliuk.saveforflat.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ExpenseCategoryTest {

    private static final String FOOD = "FOOD";
    private static final String ALCOHOL = "ALCOHOL";

    @Test
    public void testAddSubcategory() {
        ExpenseCategory expenseCategory = new ExpenseCategory(FOOD, new ArrayList<>());
        expenseCategory.addSubcategory(ALCOHOL);
        assertEquals(1, expenseCategory.getCategories().size());
        assertEquals(ALCOHOL, expenseCategory.getCategories().get(0).getName());
    }

    @Test
    public void testRemoveSubcategory() {
        List<ExpenseCategory> subcategories = new ArrayList<>();
        subcategories.add(new ExpenseCategory(ALCOHOL, new ArrayList<>()));
        ExpenseCategory expenseCategory = new ExpenseCategory(FOOD, subcategories);
        expenseCategory.removeSubcategory(ALCOHOL);
        assertEquals(0, expenseCategory.getCategories().size());
    }

    @Test
    public void testEqualObjects() {
        List<ExpenseCategory> subcategories1 = new ArrayList<>();
        subcategories1.add(new ExpenseCategory(ALCOHOL, new ArrayList<>()));
        ExpenseCategory expenseCategory1 = new ExpenseCategory(FOOD, subcategories1);

        List<ExpenseCategory> subcategories2 = new ArrayList<>();
        subcategories2.add(new ExpenseCategory(ALCOHOL, new ArrayList<>()));
        ExpenseCategory expenseCategory2 = new ExpenseCategory(FOOD, subcategories2);

        assertEquals(expenseCategory1, expenseCategory2);
    }

    @Test
    public void testEqualsUnequalSubcategory() {
        List<ExpenseCategory> subcategories1 = new ArrayList<>();
        subcategories1.add(new ExpenseCategory("FISH", new ArrayList<>()));
        ExpenseCategory expenseCategory1 = new ExpenseCategory(FOOD, subcategories1);

        List<ExpenseCategory> subcategories2 = new ArrayList<>();
        subcategories2.add(new ExpenseCategory(ALCOHOL, new ArrayList<>()));
        ExpenseCategory expenseCategory2 = new ExpenseCategory(FOOD, subcategories2);

        assertNotEquals(expenseCategory1, expenseCategory2);
    }

    @Test
    public void testEqualsUnequalName() {
        List<ExpenseCategory> subcategories1 = new ArrayList<>();
        subcategories1.add(new ExpenseCategory(ALCOHOL, new ArrayList<>()));
        ExpenseCategory expenseCategory1 = new ExpenseCategory(FOOD, subcategories1);

        List<ExpenseCategory> subcategories2 = new ArrayList<>();
        subcategories2.add(new ExpenseCategory(ALCOHOL, new ArrayList<>()));
        ExpenseCategory expenseCategory2 = new ExpenseCategory("TRANSPORT", subcategories2);

        assertNotEquals(expenseCategory1, expenseCategory2);
    }

    @Test
    public void testEqualsDifferentClass() {
        List<ExpenseCategory> subcategories = new ArrayList<>();
        subcategories.add(new ExpenseCategory(ALCOHOL, new ArrayList<>()));
        ExpenseCategory expenseCategory = new ExpenseCategory(FOOD, subcategories);

        Integer integer = 5;

        assertNotEquals(expenseCategory, integer);
    }

    @Test
    public void testHashCode() {
        List<ExpenseCategory> subcategories = new ArrayList<>();
        subcategories.add(new ExpenseCategory(ALCOHOL, new ArrayList<>()));
        ExpenseCategory expenseCategory = new ExpenseCategory(FOOD, subcategories);

        assertEquals(-1890227754, expenseCategory.hashCode());
    }

    @Test
    public void testToString() {
        List<ExpenseCategory> subcategories = new ArrayList<>();
        subcategories.add(new ExpenseCategory(ALCOHOL, new ArrayList<>()));
        ExpenseCategory expenseCategory = new ExpenseCategory(FOOD, subcategories);

        String expected = "ExpenseCategory{name='FOOD', categories=[ExpenseCategory{name='ALCOHOL', categories=[]}]}";
        assertEquals(expected, expenseCategory.toString());
    }

    @Test
    public void builderTest() {
        ExpenseCategory expenseCategory = ExpenseCategory.builder().name(FOOD).categories(new ArrayList<>()).build();
        expenseCategory.setCategories(new ArrayList<>());
        assertEquals(FOOD, expenseCategory.getName());
        assertEquals(0, expenseCategory.getCategories().size());
    }
}