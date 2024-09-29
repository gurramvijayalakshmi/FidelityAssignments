package com.AssigmentDay5;
import java.util.*;

public class MaxValueofSignedByte {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number : ");
        byte num= sc.nextByte();
        System.out.println("Value of Number : "+num);
        num=127;
        System.out.println("Largest value stored in a signed byte : "+num);
    }
}
