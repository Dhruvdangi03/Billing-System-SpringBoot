package com.Dhruv.BillingSystem.repos;

import com.Dhruv.BillingSystem.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
