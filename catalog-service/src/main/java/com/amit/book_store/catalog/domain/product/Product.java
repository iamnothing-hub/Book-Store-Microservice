package com.amit.book_store.catalog.domain.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column(nullable = false, unique = true)
    @NotEmpty(message = "Product Code should not be empty!")
    private String code;

    @NotEmpty(message = "Book Name should not be empty!")
    private String name;

    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    private Double price;

    // Constructors
    public Product() {}

    public Product(String code, String name, String description, String imageUrl, Double price) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
    }

    // Getters & Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
