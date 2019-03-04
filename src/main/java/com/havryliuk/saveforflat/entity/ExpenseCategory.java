package com.havryliuk.saveforflat.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ExpenseCategory {

    private String name;

    private List<ExpenseCategory> categories = new ArrayList<>();

    protected ExpenseCategory(String name, List<ExpenseCategory> categories) {
        this.name = name;
        this.categories = categories;
    };

    void addSubcategory(String name) {
        categories.add(ExpenseCategory.builder().name(name).build());
    }

    void removeSubcategory(String name) {
        categories.remove(ExpenseCategory.builder().name(name).categories(new ArrayList<>()).build());
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof ExpenseCategory && ((ExpenseCategory) o).getName().equals(name) && (
                (ExpenseCategory) o).categories.equals(categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, categories);
    }

    @Override
    public String toString() {
        return "ExpenseCategory{" + "name='" + name + '\'' + ", categories=" + categories + '}';
    }
}
