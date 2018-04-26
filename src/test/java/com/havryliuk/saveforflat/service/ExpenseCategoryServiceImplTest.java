package com.havryliuk.saveforflat.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.havryliuk.saveforflat.db.ExpenseCategoryDao;
import com.havryliuk.saveforflat.entity.DefaultExpenseCategory;
import com.havryliuk.saveforflat.entity.ExpenseCategory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExpenseCategoryServiceImplTest {
    private ExpenseCategoryDao expenseCategoryDao = mock(ExpenseCategoryDao.class);

    @Test
    public void testGetAllExpenseCategories() {
        List<ExpenseCategory> expected = new ArrayList<>();
        expected.add(new DefaultExpenseCategory(""));
        when(expenseCategoryDao.getAllExpenseCategories()).thenReturn(expected);

        ExpenseCategoryService service = new ExpenseCategoryServiceImpl(expenseCategoryDao);
        List<ExpenseCategory> categories = service.getAllExpenseCategories();
        assertEquals(1, categories.size());
    }

    @Test
    public void testAddSubcategoryForCategory() {
        ExpenseCategoryService service = new ExpenseCategoryServiceImpl(expenseCategoryDao);
        assertFalse(service.addSubcategoryForCategory("", ""));
    }

    @Test
    public void testRemoveSubcategoryFromCategory() {
        ExpenseCategoryService service = new ExpenseCategoryServiceImpl(expenseCategoryDao);
        assertFalse(service.removeSubcategoryFromCategory("", ""));
    }
}
