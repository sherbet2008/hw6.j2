package com.company;

public class CreateBook <T> implements Writable {

    private String Book;
    T year;
    private int rating;


    public CreateBook(String book, T year, int rating) {
        Book = book;
        this.year = year;
        this.rating = rating;
    }

    public String getBook() {
        return Book;
    }

    public void setBook(String book) {
        Book = book;
    }

    public T getYear() {
        return year;
    }

    public void setYear(T year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public T WritingYear() {
        return year;
    }

    @Override
    public Number rating() {
        return rating;
    }
}
