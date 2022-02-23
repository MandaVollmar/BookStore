package com.company;

public class Book {
    String genre;
    String title;
    String author;
    double cost;

    public Book(String genre, String title, String author, double cost) {
        this.genre = genre;
        this.title = title;
        this.author = author;
        this.cost = cost;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
