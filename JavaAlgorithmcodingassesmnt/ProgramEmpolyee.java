package com.JavaAlgorithmcodingassesmnt;


import java.util.ArrayList;
import java.util.List;

public class ProgramEmpolyee {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Anandh", 22, "staff", 18000));
        employees.add(new Employee("berlin", 35, "non-it", 55000));
        employees.add(new Employee("Jhonson", 25, "IT", 87000));
        employees.add(new Employee("Alice", 30, "Sales", 60000));


        List<Employee> salesEmployees = employees.stream()
                .filter(emp-> emp.getName().startsWith("A"))
                .toList();

        System.out.println("Employees Names starts with A : ");
        salesEmployees.forEach(System.out::println);
    }
}

class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;


    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name + " - " + department + " - $" + salary;
    }
}
