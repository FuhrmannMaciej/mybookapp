package com.fuhrmannmaciej.mybookapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.text.SimpleDateFormat;
import java.util.Date;

@JsonIgnoreProperties
public class News {

    private String list;

    private String pattern = "YYYY-MM-DD";
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    private String bestsellersDate = simpleDateFormat.format(new Date());

    private String publishedDate = simpleDateFormat.format(new Date());

    private int offset;

    private String apiKey = "BfGf8fBDHb7XldyENlrAH4rumiKOo1P6";

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public String getBestsellersDate() {
        return bestsellersDate;
    }

    public void setBestsellersDate(String bestsellersDate) {
        this.bestsellersDate = bestsellersDate;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "News{" +
                "list='" + list + '\'' +
                ", bestsellersDate='" + bestsellersDate + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                ", offset=" + offset +
                '}';
    }
}
