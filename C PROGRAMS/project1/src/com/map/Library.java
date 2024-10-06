package com.map;

import java.util.*;

public class Library {
    private Set<book> books;
    public Library(){
        books = new HashSet<>();
    }
    public void addbook(book book1){
        books.add(book1);
    }
    public void displayBooks(){
        Iterator iterator = books.iterator();
        while(iterator.hasNext()){
            book book1 =(book) iterator.next();
            System.out.println(book1);
        }
    }
}
