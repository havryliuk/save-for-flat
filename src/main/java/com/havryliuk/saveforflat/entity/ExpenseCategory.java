package com.havryliuk.saveforflat.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Builder
@Entity
public class ExpenseCategory {

    private @Id @GeneratedValue Long id;

    @Builder.Default
    private String name = "";

    @Builder.Default
    private List<ExpenseCategory> categories = new ArrayList<>();

    void addSubcategory(String name) {
        categories.add(ExpenseCategory.builder().name(name).build());
    }

    void removeSubcategory(String name) {
        categories.remove(ExpenseCategory.builder().name(name).build());
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
