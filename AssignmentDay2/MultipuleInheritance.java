package com.AssignmentDay2;


class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}


class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

public class MultipuleInheritance{
    public static void main(String[] args) {
        BabyDog babyDog = new BabyDog();
        babyDog.weep();
        babyDog.bark();
        babyDog.eat();
    }
}
