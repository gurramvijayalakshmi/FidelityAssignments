package com.AssigmentDay5;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a string :");
        String str= sc.nextLine();

        String[] word=str.split(" ");
        System.out.println("The Reverse String is: ");
        for (int i=word.length-1;i>=0;i--){
            System.out.print(word[i]+" ");
        }
    }
}
