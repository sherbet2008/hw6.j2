package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Main {

    public static void main(String[] args) {
       CreateBook createBook = new CreateBook("Думай как миллионер ", 2010, 2);
       CreateBook createBook2 = new CreateBook("Hero ", 2000, 10);
        printBook(createBook);
        printBook(createBook2);

    }
    public static <T extends Number> void printBook(CreateBook <T> createBook){
        System.out.println(createBook.getBook()+ " Year: "+ createBook.WritingYear());
        System.out.println(createBook.getBook()+ " rating "+ createBook.rating());

    }
}
