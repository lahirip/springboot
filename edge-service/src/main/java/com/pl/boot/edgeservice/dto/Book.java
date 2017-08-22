package com.pl.boot.edgeservice.dto;

public class Book {


    String isbn;
    String author;
    String title;
    int pubYear;
    String type;



    public Book(String isbn, String author, String title, int pubYear, String type) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.pubYear = pubYear;
        this.type = type;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPubYear() {
        return pubYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pubYear=" + pubYear +
                '}';
    }

}
