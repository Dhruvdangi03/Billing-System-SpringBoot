package com.Dhruv.BillingSystem.entities;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    private String invoiceNumber;

    private Double totalAmount;
    private Double discount;
    private Double tax;
    private Double finalAmount;

    private LocalDateTime createdAt;

    @ManyToOne
    private User cashier;

    @ManyToOne
    private Customer customer;
}
