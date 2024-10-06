package com.week2assesment_practiceQuestion;


import java.util.*;

public class PayCalculation {

    private static final double Standard_rate = 80.0;
    private static final double Overtime_hours = 1.5 * Standard_rate;
    private static final int Standard_Hours = 56;
    private static final double TAX_PERCENTAGE = 2.0;


    public static double GetGrossPay(int hoursWorked) {
        if (hoursWorked <= Standard_Hours) {
            return hoursWorked * Standard_rate;
        } else {

            int overtimeHours = hoursWorked - Standard_Hours;
            return (Standard_Hours * Standard_rate) + (overtimeHours * Overtime_hours);
        }
    }


    public static double CalculateTax(double grossPay) {
        return (TAX_PERCENTAGE / 100) * grossPay;
    }

    public static double CalculateNetPay(int hoursWorked) {

        double grossPay = GetGrossPay(hoursWorked);

        double tax = CalculateTax(grossPay);

        return (grossPay - tax);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours worked: ");
        int hoursWorked = scanner.nextInt();

        double netPay = CalculateNetPay(hoursWorked);

        System.out.printf("The calculated Net Pay is $%.1f%n", netPay);

        scanner.close();
    }
}