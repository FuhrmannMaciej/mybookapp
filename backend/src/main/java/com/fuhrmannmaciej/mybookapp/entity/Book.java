package com.fuhrmannmaciej.mybookapp.entity;

import com.opencsv.bean.CsvBindByName;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "Book")
@Table(name = "book")
public class Book extends Item implements Serializable {

    @CsvBindByName
    @Column(name = "book_author")
    private String author;

    public Book() {
    }

    public Book(Integer id, String title, Integer yearOfRelease, Double rating, String author) {
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
