package com.havryliuk.saveforflat.repository;

import com.havryliuk.saveforflat.entity.ExpenseCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseCategoryRepository extends JpaRepository<ExpenseCategory, Long> {
}
