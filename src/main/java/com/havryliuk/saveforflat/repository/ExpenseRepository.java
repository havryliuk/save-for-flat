package com.havryliuk.saveforflat.repository;

import com.havryliuk.saveforflat.entity.ExpenseCategory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends MongoRepository<ExpenseCategory, Integer> {

    List<ExpenseCategory> getAllExpenseCategories();

    ExpenseCategory getExpenseCategoryById(int id);

    int addExpenseCategory(String name);
}
