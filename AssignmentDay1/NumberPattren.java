package com.AssignmentdayDay1;

public class NumberPattren {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
