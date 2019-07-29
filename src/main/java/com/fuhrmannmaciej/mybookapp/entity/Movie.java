package com.fuhrmannmaciej.mybookapp.entity;

import java.time.LocalDate;

public class Movie extends Item {

    private String director;

    private int length;

    public Movie(String title, LocalDate yearOfRelease, int rating, String genre, String director, int length) {
        super(title, yearOfRelease, rating, genre);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
