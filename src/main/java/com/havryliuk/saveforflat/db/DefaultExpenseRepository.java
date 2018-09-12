package com.havryliuk.saveforflat.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.havryliuk.saveforflat.entity.ExpenseCategory;
import com.mongodb.client.MongoDatabase;

@Repository
public class DefaultExpenseRepository implements ExpenseRepository {
    @Autowired
    private MongoDatabase database;

    @Override
    public List<ExpenseCategory> getAllExpenseCategories() {
        return new ArrayList<>();
    }
}
