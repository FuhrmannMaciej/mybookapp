package com.fuhrmannmaciej.mybookapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "Book")
@Table(name = "book")
public class Book extends Item implements Serializable {

    @Column(name = "book_author")
    private String author;

    public Book() {

    }

    public Book(int id, String title, int yearOfRelease, double rating, String author) {
        super(id, title, yearOfRelease, rating);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
