package com.exception;

import java.util.HashMap;
import java.util.Map;


class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}


class EmployeeManagement {
    private Map<Integer, String> employees;

    public EmployeeManagement() {
        employees = new HashMap<>();
    }

    public void addEmployee(int id, String name) {
        employees.put(id, name);
    }

    public String checkEmployee(int id) throws EmployeeNotFoundException {
        if (!employees.containsKey(id)) {
            throw new EmployeeNotFoundException("java.UserDefinedException.EmployeeNotException : Employee with ID " + id + " is not present.");
        }
        return "Employee " + employees.get(id) + " is present.";
    }
}


public class Main {
    public static void main(String[] args) {
        EmployeeManagement empMgmt = new EmployeeManagement();
        empMgmt.addEmployee(1, "Alice");
        empMgmt.addEmployee(2, "Bob");

        try {
            System.out.println(empMgmt.checkEmployee(1));
            System.out.println(empMgmt.checkEmployee(3));
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
