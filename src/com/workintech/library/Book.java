package com.workintech.library;

import java.util.ArrayList;

public class Book {

    private String name;
    private String author;
    private String publisher;
    private String adress;
    private String status;
    private int salecopies;
    private double price;
    private int brwcopies;

    public Book() {

    }

    public Book(String name, String author, String publisher, String adress,
                String status, int salecopies, double price, int brwcopies) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.adress = adress;
        this.status = status;
        this.salecopies = salecopies;
        this.price = price;
        this.brwcopies = brwcopies;
    }

    public String toString(){
        String text = "Book Name: " + name +
                "Book Author: " +author +
                "Book Publisher: " + publisher+
                "Book Collection Adress: " + adress+
                "Copies To Sale: " + String.valueOf(salecopies) +
                "Value: " + String.valueOf(price) +
                "Borrowing Copies: " + String.valueOf(brwcopies);
        return text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSalecopies(int salecopies) {
        this.salecopies = salecopies;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrwcopies(int brwcopies) {
        this.brwcopies = brwcopies;
    }
}
