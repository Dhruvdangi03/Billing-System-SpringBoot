package com.Dhruv.BillingSystem.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String phone;
    private String email;
    private boolean is_deleted;

    public Customer() {
    }

    public Customer(Long id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.is_deleted = false;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
