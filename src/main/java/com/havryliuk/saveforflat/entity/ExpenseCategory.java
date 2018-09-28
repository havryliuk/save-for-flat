package com.havryliuk.saveforflat.entity;

import java.util.List;

public interface ExpenseCategory {

    List<ExpenseCategory> getSubcategories();

    void addSubcategory(String categoryName);

    void removeSubcategory(String categoryName);

    String getName();

    int getId();
}
