package com.pl.boot.bookcatalogservice.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue
    Long id;

    String isbn;
    String author;
    String title;
    int pubYear;
    String type;

    public Book() {

    }

    public Book(String isbn, String author, String title, int pubYear, String type) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.pubYear = pubYear;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pubYear=" + pubYear +
                ", type='" + type + '\'' +
                '}';
    }
}
