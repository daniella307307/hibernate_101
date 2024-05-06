package com.hibernateTest;

import com.dao.EmployeeDAO;
import com.model.Employee;
import com.model.EmployeeNames; // Make sure you import EmployeeNames
import com.model.Laptop;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        // Create an employee
//        Employee employee = new Employee();
//        EmployeeNames employeeNames = new EmployeeNames();
//        employeeNames.setFirstName("Daniella");
//        employeeNames.setLastName("Ganza");
//        employee.setEmployeeNames(employeeNames); // Set the EmployeeNames object
//        employee.setSalary(50000);
//        Laptop laptop = new Laptop("Elite Book", "HP");
////        employee.setLap(laptop); // Associate the laptop object with the employee
        // Create an employee
        Employee employee = new Employee();
        EmployeeNames employeeNames = new EmployeeNames();
        employeeNames.setFirstName("Daniella");
        employeeNames.setLastName("Ganza");
        employee.setEmployeeNames(employeeNames);
        employee.setSalary(600000);

        // Create laptops
        Laptop laptop1 = new Laptop("Elite Book", "HP");
        Laptop laptop2 = new Laptop("Think Book", "Lenovo");
        Laptop laptop3 = new Laptop("Positive", "Lenovo");

        // Create a list of laptops and add them to the employee
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        employee.setLaptops(laptops);

        // Add the employee to the database
        employeeDAO.addEmployee(employee);

      // Retrieve an employee by ID
//        Employee retrievedEmployee = employeeDAO.getEmployeeById(1);
//        System.out.println("Retrieved Employee: " + retrievedEmployee);
//
//        // Update the employee's salary
//        retrievedEmployee.setSalary(60000);
//        employeeDAO.updateEmployee(retrievedEmployee);
//
//        // Delete the employee
//        employeeDAO.deleteEmployee(retrievedEmployee);
    }
}
