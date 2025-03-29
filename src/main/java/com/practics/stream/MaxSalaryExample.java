package com.practics.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxSalaryExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 50000),
                new Employee("Bob", 70000),
                new Employee("Charlie", 60000),
                new Employee("Diana", 90000)
        );

        // Find employee with the maximum salary
        Employee maxSalaryEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(() -> new RuntimeException("No employees found"));

        System.out.println("Employee with max salary: " + maxSalaryEmployee);
    }
    }

