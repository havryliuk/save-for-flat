package com.havryliuk.saveforflat.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.Getter;

@Getter
public class DefaultExpenseCategory implements ExpenseCategory {
    private String name;
    private List<ExpenseCategory> categories = new ArrayList<>();

    public DefaultExpenseCategory(String name) {
        this.name = name;
    }

    @Override
    public List<ExpenseCategory> getSubcategories() {
        return categories;
    }

    public void addSubcategory(String name) {
        categories.add(new DefaultExpenseCategory(name));
    }

    public void removeSubcategory(String name) {
        categories.remove(new DefaultExpenseCategory(name));
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof DefaultExpenseCategory && ((DefaultExpenseCategory) o).getName().equals(name) && (
                (DefaultExpenseCategory) o).categories.equals(categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, categories);
    }
}
