package com.AssigmentDay5;
import java.util.*;

public class CalculatorProgramMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Operator : ");
        String op = sc.next();
        System.out.println("Enter the operands : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        double[] remainder= new  double[1];
        CalculatorProgram prog = new CalculatorProgram();

        switch (op){
            case "+":
                System.out.println("Result of "+num1 +op+num2+" is "+prog.Addition(num1,num2));
                break;
            case "-":
                System.out.println("Result of "+num1 +op+num2+" is "+prog.Subtraction(num1,num2));
                break;
            case "*":
                System.out.println("Result of "+num1 +op+num2+" is "+prog.Multiplication(num1,num2));
                break;
            case "/":
                System.out.println("Result of "+num1 +op+num2+" is "+(int)prog.Division(num1,num2,remainder));
                System.out.println("Remainder = "+(int)remainder[0]);
                break;
            default:
                System.out.println("Invalid Operator ");
        }
    }
}
