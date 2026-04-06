package com.Dhruv.BillingSystem.DTO.product;

import com.Dhruv.BillingSystem.entities.Category;

public class ProductDTO {
    private String name;
    private String barcode;
    private String description;

    private Double price;
    private Double costPrice;

    private Integer stockQuantity;
    private Category category;

    public ProductDTO() {
    }

    public ProductDTO(String name, String barcode, String description, Double price, Double costPrice, Integer stockQuantity, Category category) {
        this.name = name;
        this.barcode = barcode;
        this.description = description;
        this.price = price;
        this.costPrice = costPrice;
        this.stockQuantity = stockQuantity;
        this.category = category;
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
}
