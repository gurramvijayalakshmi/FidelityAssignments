package com.AssigmentDay5;
import java.util.*;

public class SquareAndCubeCalculator {


    public static double FindSquare(double number) {
        return number * number;
    }


    public static double FindCube(double number) {
        return number * number * number;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();


        double square = FindSquare(number);
        double cube = FindCube(number);

        System.out.println("The square of " +(int) number + " is: " + (int)square);
        System.out.println("The cube of " +(int) number + " is: " + (int)cube);

        scanner.close();
    }
}
