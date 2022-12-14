package com.github.gr33nowl.springproject1.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Book {

    private int id;

    @NotEmpty(message = "Book title should not be empty")
    @Size(min = 2, max = 50, message = "Book title length should be between 2 and 50 chars")
    private String title;

    @NotEmpty(message = "Author should not be empty")
    @Size(min = 2, max = 50, message = "Authors name should be between 2 and 50 chars")
    private String author;

    @NotNull
    private int year;

    public Book() {
    }

    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
