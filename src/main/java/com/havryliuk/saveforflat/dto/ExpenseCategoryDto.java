package com.havryliuk.saveforflat.dto;

import com.havryliuk.saveforflat.entity.ExpenseCategory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class ExpenseCategoryDto extends ExpenseCategory {

    private @Id @GeneratedValue Long id;

    protected ExpenseCategoryDto(String name, List<ExpenseCategory> categories) {
        super(name, categories);
    }
}
