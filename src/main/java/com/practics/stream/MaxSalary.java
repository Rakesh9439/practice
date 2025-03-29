package com.practics.stream;



import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Employee1 {
private int id;
private String name;
private double salary;

// Constructor
public Employee1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        }

// Getters
public double getSalary() {
        return salary;
        }

@Override
public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + '}';
        }
        }

public class MaxSalary {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
                new Employee1(1, "Alice", 50000),
                new Employee1(2, "Bob", 60000),
                new Employee1(3, "Charlie", 70000),
                new Employee1(4, "Diana", 80000)
        );


    }
}
