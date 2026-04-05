package com.Dhruv.BillingSystem.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String barcode;
    private String description;

    private Double price;
    private Double costPrice;

    private Integer stockQuantity;

    @ManyToOne
    private Category category;

    private boolean active;

    public Product() {
    }

    public Product(Long id, String name, String barcode, String description, Double price, Double costPrice, Integer stockQuantity, Category category, boolean active) {
        this.id = id;
        this.name = name;
        this.barcode = barcode;
        this.description = description;
        this.price = price;
        this.costPrice = costPrice;
        this.stockQuantity = stockQuantity;
        this.category = category;
        this.active = active;
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

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
