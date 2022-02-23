package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        Book book1 = new Book("non-fiction", "Head first java", "Sierra, Cathy", 22);
        Book book2 = new Book("Horror", "The Tommyknockers", "Stephen king", 6.99);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        BookStore bookStore = new BookStore(books, .25);
        Customer customer = new Customer(false, 100);

        System.out.println("Welcome to our bookstore, you are a new member please signup");
        System.out.println("What is your name?");
        String name = userInput.nextLine();
        customer.setName(name);
        System.out.println("What is your age?");
        int age = userInput.nextInt();
        customer.setAge(age);


        System.out.println("Thank you for signing up. We offer the following services: " +
                "1) View bookstore inventory 2) Buy membership, 3) Buy book (enter 1/2/3)");

        int userSelection = userInput.nextInt();

        if (userSelection == 1) {
            bookStore.viewBooks();
        } else if (userSelection == 2) {
            if (customer.buyMembership() == true) {
                bookStore.addMemberships(customer);
                System.out.println("Congrats your a member now");
            } else {
                System.out.println("Sorry card declined");
            }
        } else if (userSelection == 3){
            System.out.println("What book do you want to buy");
            String bookname = userInput.nextLine();
            //customer.buyBook( ,bookStore);
        }


    }
}
