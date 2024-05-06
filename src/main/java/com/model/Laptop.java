package com.model;

import jakarta.persistence.*;

@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "laptop_sequence")
    @SequenceGenerator(name = "laptop_sequence", sequenceName = "laptop_sequence", allocationSize = 1)
    private int laptopId;

    private String name;
    private String brand;
    @Transient
    private String Description;
    @ManyToOne
    private Employee employee;

    // Constructors, getters, and setters

    public Laptop() {
    }

    public Laptop(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
