package com.AssigmentDay5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

// Class Person
class Person {

    private String firstName;
    private String lastName;
    private LocalDate dob;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }


    public String getAdult() {
        int age = GetAge(dob);
        if (age >= 18) {
            return "Adult";
        } else {
            return "Child";
        }
    }


    public int GetAge(LocalDate dob) {
        LocalDate currentDate = LocalDate.now();
        if ((dob != null) && (dob.isBefore(currentDate))) {
            return Period.between(dob, currentDate).getYears();
        } else {
            return 0;
        }
    }


    public void DisplayDetails() {
        int age = GetAge(dob);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println(getAdult());
    }
}

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person();


        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        person.setFirstName(firstName);


        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        person.setLastName(lastName);


        System.out.print("Enter date of birth in yyyy/mm/dd format: ");
        String dobInput = scanner.nextLine();
        LocalDate dob = LocalDate.parse(dobInput);
        person.setDob(dob);


        System.out.println();
        person.DisplayDetails();


        scanner.close();
    }
}