package com.model;

import jakarta.persistence.*;

import java.util.List;


@Entity

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;

    @Embedded
    private EmployeeNames employeeNames;

    private int salary;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "laptopId")
    private Laptop lap;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "employee")
    @JoinColumn(name = "employeeId")
    private List<Laptop> laptops;

    // Getters and setters

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public EmployeeNames getEmployeeNames() {
        return employeeNames;
    }

    public void setEmployeeNames(EmployeeNames employeeNames) {
        this.employeeNames = employeeNames;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }
}
