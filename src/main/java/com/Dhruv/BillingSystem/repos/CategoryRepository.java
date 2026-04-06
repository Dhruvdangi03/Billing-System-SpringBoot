package com.Dhruv.BillingSystem.repos;

import com.Dhruv.BillingSystem.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
