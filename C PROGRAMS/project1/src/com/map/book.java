package com.map;

public class book {
    private String title;
    private String author;
    private String isbn;

    book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    // Override equals() and hashCode() to ensure uniqueness based on ISBN
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof book)) return false;
        book other = (book) obj;
        return this.isbn.equals(other.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

}
   