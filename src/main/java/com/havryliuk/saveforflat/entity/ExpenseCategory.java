package com.havryliuk.saveforflat.entity;

import java.util.List;

public interface ExpenseCategory {

    void addSubcategory(String categoryName);

    void removeSubcategory(String categoryName);

    String getName();
}
