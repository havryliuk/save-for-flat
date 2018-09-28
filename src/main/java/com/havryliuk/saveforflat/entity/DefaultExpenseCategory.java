package com.havryliuk.saveforflat.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class DefaultExpenseCategory implements ExpenseCategory, Serializable {
    private static final long serialVersionUID = -4674548881643092068L;

    @Id
    private int id;

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

    @Override
    public String toString() {
        return "DefaultExpenseCategory{" + "name='" + name + '\'' + ", categories=" + categories + '}';
    }
}
