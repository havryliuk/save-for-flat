package com.havryliuk.saveforflat.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Builder
public class DefaultExpenseCategory implements ExpenseCategory {

    @Builder.Default
    private String name = "";

    @Builder.Default
    private List<ExpenseCategory> categories = new ArrayList<>();

    @Override
    public List<ExpenseCategory> getSubcategories() {
        return categories;
    }

    @Override
    public void addSubcategory(String name) {
        categories.add(DefaultExpenseCategory.builder().name(name).build());
    }

    public void removeSubcategory(String name) {
        categories.remove(DefaultExpenseCategory.builder().name(name).build());
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

    @Override
    public String toString() {
        return "DefaultExpenseCategory{" + "name='" + name + '\'' + ", categories=" + categories + '}';
    }
}
