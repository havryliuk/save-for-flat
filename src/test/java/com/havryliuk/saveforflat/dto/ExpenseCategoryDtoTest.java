package com.havryliuk.saveforflat.dto;

import com.havryliuk.saveforflat.entity.ExpenseCategory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class ExpenseCategoryDtoTest {

    @Test
    public void testConstructor() {
        ExpenseCategoryDto dto = new ExpenseCategoryDto("FOOD", Collections.singletonList(
                new ExpenseCategory("ALCOHOL", new ArrayList<>())));
        assertEquals("FOOD", dto.getName());
        assertEquals(1, dto.getCategories().size());
        assertEquals("ALCOHOL", dto.getCategories().get(0).getName());
        assertEquals(0, dto.getCategories().get(0).getCategories().size());
    }

}