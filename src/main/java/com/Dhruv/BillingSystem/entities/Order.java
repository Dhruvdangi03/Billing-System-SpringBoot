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

    public Order() {
    }

    public Order(Long id, String invoiceNumber, Double totalAmount, Double discount, Double tax, Double finalAmount, LocalDateTime createdAt, User cashier, Customer customer) {
        this.id = id;
        this.invoiceNumber = invoiceNumber;
        this.totalAmount = totalAmount;
        this.discount = discount;
        this.tax = tax;
        this.finalAmount = finalAmount;
        this.createdAt = createdAt;
        this.cashier = cashier;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(Double finalAmount) {
        this.finalAmount = finalAmount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public User getCashier() {
        return cashier;
    }

    public void setCashier(User cashier) {
        this.cashier = cashier;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
