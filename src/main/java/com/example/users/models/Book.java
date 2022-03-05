package com.example.users.models;

public class Book {
    private String ID;
    private String name;
    private String authorName;
    private String genre;
    private Double price;

    public Book(String ID, String name, String authorName, String genre, Double price) {
        this.ID = ID;
        this.name = name;
        this.authorName = authorName;
        this.genre = genre;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
