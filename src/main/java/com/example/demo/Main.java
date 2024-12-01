package com.example.demo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        // Create a new employee
        Employee employee = new Employee(0, "John Doe", "Developer", 75000.0, new Date());
        employeeData.createEmployee(employee);

        // Retrieve an employee by ID
        Employee retrievedEmployee = employeeData.getEmployeeById(1);
        System.out.println("Retrieved: " + retrievedEmployee);

        // Retrieve all employees
        System.out.println("All Employees: ");
        employeeData.getAllEmployees().forEach(System.out::println);

        // Update an employee
        if (retrievedEmployee != null) {
            retrievedEmployee.setSalary(80000.0);
            employeeData.updateEmployee(retrievedEmployee);
        }

        // Delete an employee
        employeeData.deleteEmployee(1);
    }
}

