package com.practice.bookshop.dto;

public class Book {
    private String name;
    private int ID;
    private String author;
    private int ISBN;
    private int price;
    private int page;

    public Book(String name, int ID, String author, int ISBN, int price, int page) {
        this.name = name;
        this.ID = ID;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
        this.page = page;
    }
    public Book( ) {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
