package com.map;

public class LibraryProgramMain {
    public static void main(String[]  args){
        Library library = new Library();

        book book1= new book("afshdfhgd","aydgegfd","dfsgdf");
        book book2= new book("hgd","rfvbv","143243546");
        book book3= new book("afshdfhgd","aydgegfd","dfsgdf");
        library.addbook(book1);
        library.addbook(book2);
        library.addbook(book3);

        library.displayBooks();
    }
}
