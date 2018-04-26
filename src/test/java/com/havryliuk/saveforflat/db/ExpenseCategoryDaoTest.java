package com.havryliuk.saveforflat.db;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpenseCategoryDaoTest {
    @Test
    public void testGetAllExpenseCategories() {
        ExpenseCategoryDao dao = new ExpenseCategoryDao();
        assertEquals(0, dao.getAllExpenseCategories().size());
    }
}
