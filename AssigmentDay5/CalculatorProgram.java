package com.AssigmentDay5;

public class CalculatorProgram {

    public int Addition(int a, int b){
        return a+b;
    }
    public int Subtraction(int a, int b){
        if (a>b) {
            return a - b;
        }
        else{
            return b-a;
        }
    }
    public int Multiplication(int a, int b){
        return a*b;
    }
    public double Division(int a, int b, double[] remainder){
        double quotient=(double)a/b;
        remainder[0]= a%b;
        return quotient;
    }
}
