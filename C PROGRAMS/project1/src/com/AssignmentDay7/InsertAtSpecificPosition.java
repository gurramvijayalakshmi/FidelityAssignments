package com.AssignmentDay7;

import java.util.Scanner;


public class InsertAtSpecificPosition {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list size: ");
        int n=scanner.nextInt();
        System.out.println("Enter 3 elements to the linked list:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            list.insertAtPosition(value, i + 1);
        }


        list.insertAtPosition(1, 3);


        System.out.println("The linked list after insertion is:");
        list.display();

        scanner.close();
    }
}