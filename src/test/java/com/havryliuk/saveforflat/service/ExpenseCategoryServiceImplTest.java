package com.havryliuk.saveforflat.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.havryliuk.saveforflat.db.ExpenseCategoryDao;
import com.havryliuk.saveforflat.entity.DefaultExpenseCategory;
import com.havryliuk.saveforflat.entity.ExpenseCategory;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExpenseCategoryServiceImplTest {
    @Test
    public void testGetAllExpenseCategories() {
        List<ExpenseCategory> expected = new ArrayList<>();
        expected.add(new DefaultExpenseCategory(""));
        ExpenseCategoryDao expenseCategoryDao = mock(ExpenseCategoryDao.class);
        when(expenseCategoryDao.getAllExpenseCategories()).thenReturn(expected);

        ExpenseCategoryService service = new ExpenseCategoryServiceImpl(expenseCategoryDao);
        List<ExpenseCategory> categories = service.getAllExpenseCategories();
        assertEquals(1, categories.size());
    }
}
