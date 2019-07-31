package com.fuhrmannmaciej.mybookapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "Movie")
@Table(name = "movie")
public class Movie extends Item implements Serializable {

    @Column(name = "movie_director")
    private String director;

    @Column(name = "movie_length")
    private int length;

    public Movie(String title, int yearOfRelease, int rating, String genre, String director, int length) {
        super(title, yearOfRelease, rating, genre);
        this.director = director;
        this.length = length;
    }

    public Movie() {

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
