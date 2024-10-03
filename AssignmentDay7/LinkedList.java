package com.AssignmentDay7;

public class LinkedList {

    Node head;
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);


        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;


        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }


        if (current == null) {
            System.out.println("Position is out of bounds.");
            return;
        }


        newNode.next = current.next;
        current.next = newNode;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }


    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data+"  ");
            current = current.next;
        }
    }
}