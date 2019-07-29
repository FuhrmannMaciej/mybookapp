package com.fuhrmannmaciej.mybookapp.entity;

import java.time.LocalDate;

public class Book extends Item {

    private String author;

    private int numberOfPages;

    public Book(String title, LocalDate yearOfRelease, int rating, String genre, String author, int numberOfPages) {
        super(title, yearOfRelease, rating, genre);
        this.author = author;
        this.numberOfPages = numberOfPages;
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
