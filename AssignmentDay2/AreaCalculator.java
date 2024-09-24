package com.AssignmentDay2;

public class AreaCalculator {

    public int CalculateArea(int side){
        return side*side;
    }

    public double CalculateArea(double length, double breadth){
        return length*breadth;
    }

    public double CalculateArea(double radius){
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        System.out.println("The area of square is : "+ calc.CalculateArea(4));
        System.out.println("The area of Rectangle is : "+ calc.CalculateArea(15.0,8.0));
        System.out.printf("The area of square is : %.3f",calc.CalculateArea(8.0));
    }
}
