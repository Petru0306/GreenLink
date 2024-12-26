package com.greenlink.greenlink.dto;

public class ProductDto {
    private Long id;            // ID-ul produsului
    private String name;        // Numele produsului
    private String description; // Descrierea produsului
    private double price;       // Prețul produsului

    // Constructori
    public ProductDto() {
    }

    public ProductDto(Long id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // Getteri și setteri
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}