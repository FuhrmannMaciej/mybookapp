package com.fuhrmannmaciej.mybookapp.entity;

import com.opencsv.bean.CsvBindByName;

import javax.persistence.*;

@MappedSuperclass
public abstract class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @CsvBindByName
    @Column(name = "item_id")
    private Integer id;

    @CsvBindByName
    @Column(name = "item_title")
    private String title;

    @CsvBindByName
    @Column(name = "item_year_of_release")
    private Integer yearOfRelease;

    @CsvBindByName
    @Column(name = "item_rating")
    private Double rating;


    public Item() {
    }

    public Item(Integer id, String title, Integer yearOfRelease, Double rating) {
        this.id = id;
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(Integer yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
