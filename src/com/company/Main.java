package com.company;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {


        ArrayList<Book> books = new ArrayList<Book>();

        //create a book from our object
        Book book1 = new Book();
        book1.author = "Author 1";
        book1.title = "Title of Book 1";
        books.add(book1);

        Book book2 = new Book();
        book2.author = "Author 2";
        book2.title = "Title of Book 2";
        books.add(book2);

        System.out.println(book1.author);
        System.out.println(book1.title);

        System.out.println(book2.author);
        System.out.println(book2.title);


        //print all book in the array list
        for(Book book:books)
        {
            System.out.print(book.title);
            System.out.print("");
            System.out.print(book.author);
            System.out.println();

        }

    }


}