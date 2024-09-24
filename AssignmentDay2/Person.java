package com.AssignmentDay2;

class PersonDetails {
    private String name;
    public String gender;
    public int age;

    public PersonDetails(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("------------------------------\n");
    }
}

public class Person {
    public static void main(String[] args) {
        PersonDetails p1 = new PersonDetails("vijaya","F",22);
        p1.displayDetails();
        System.out.println("After changing \"name\" using getters and setters\n");
        p1.setName("Vijji");
        p1.displayDetails();
    }
}
