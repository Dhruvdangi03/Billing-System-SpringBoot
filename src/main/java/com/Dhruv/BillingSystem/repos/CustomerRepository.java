package com.Dhruv.BillingSystem.repos;

import com.Dhruv.BillingSystem.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query(value = "SELECT * FROM account c WHERE c.phone = :phoneNumber AND c.is_deleted = false", nativeQuery = true)
    Customer getCustomerByPhoneNumber(@Param("phoneNumber") String phoneNumber);
}
