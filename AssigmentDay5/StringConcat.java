package com.AssigmentDay5;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name :");
        String firstname=sc.nextLine();
        System.out.println("Enter Last Name :");
        String lastname=sc.nextLine();

        String fullName= firstname+" "+lastname;

        System.out.println("Full Name : "+fullName);
    }
}
