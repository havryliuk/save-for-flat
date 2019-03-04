package com.havryliuk.saveforflat.service;

import com.havryliuk.saveforflat.entity.ExpenseCategory;
import com.havryliuk.saveforflat.repository.ExpenseCategoryRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class ExpenseCategoryServiceImplTest {

    @Mock
    private ExpenseCategoryRepository repository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetExpenseCategories() {
        ExpenseCategoryServiceImpl expenseCategoryService = new ExpenseCategoryServiceImpl(repository);
        List<ExpenseCategory> expenseCategories = expenseCategoryService.getExpenseCategories();
        assertEquals(1, expenseCategories.size());
    }

    @Test
    public void testAddExpenseCategory() {
        when(repository.save(any())).thenReturn(new ExpenseCategory("ALCOHOL", new ArrayList<>()));

        ExpenseCategoryServiceImpl expenseCategoryService = new ExpenseCategoryServiceImpl(repository);
        ExpenseCategory expenseCategory = expenseCategoryService.addExpenseCategory("FOOD", new ExpenseCategory("ALCOHOL", new ArrayList<>()));
        assertEquals("ALCOHOL", expenseCategory.getName());
    }
}