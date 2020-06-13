package com.yisusdevelopment.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yisusdevelopment.expense.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
	Category findByName(String name);
}
