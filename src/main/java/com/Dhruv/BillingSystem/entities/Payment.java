package com.Dhruv.BillingSystem.entities;

import com.Dhruv.BillingSystem.enums.PaymentMode;
import jakarta.persistence.*;

@Entity
@Table
public class Payment {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Order order;

    @Enumerated(EnumType.STRING)
    private PaymentMode mode; // CASH, CARD, UPI

    private Double amount;
    private String transactionId;

    public Payment() {
    }

    public Payment(Long id, Order order, PaymentMode mode, Double amount, String transactionId) {
        this.id = id;
        this.order = order;
        this.mode = mode;
        this.amount = amount;
        this.transactionId = transactionId;
    }

    public Long getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
