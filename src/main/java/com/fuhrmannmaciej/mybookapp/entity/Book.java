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

    @Column(name = "book_number_of_pages")
    private int numberOfPages;

    public Book(String title, int yearOfRelease, int rating, String genre, String author, int numberOfPages) {
        super(title, yearOfRelease, rating, genre);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public Book() {

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
