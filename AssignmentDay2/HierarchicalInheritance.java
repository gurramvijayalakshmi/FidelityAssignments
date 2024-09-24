package com.AssignmentDay2;

class A {
    public void display() {
        System.out.println(" A Called ");
    }
}

class B extends A {
    public void print() {
        System.out.println("B Called");
    }
}

class C extends A {
    public void show() {
        System.out.println("c Called");
    }
}

class D extends A {
    public void outPut() {
        System.out.println("D Called");
    }
}
public class HierarchicalInheritance{
    public static void main(String[] args) {
        B objB = new B();
        C objC = new C();
        D objD = new D();
        objB.display();
        objC.display();
        objD.display();
    }
}