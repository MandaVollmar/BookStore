package com.company;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class BookStore {
    List<Book> inventory = new ArrayList<>();
    List<Customer> memberships = new ArrayList<>();
    List<Book> soldBooks = new ArrayList<>();
    double memberDiscount;

    public BookStore(List<Book> inventory, double memberDiscount){
        this.inventory = inventory;
        this.memberDiscount = memberDiscount;
    }

    public double getMemberDiscount() {
        return memberDiscount;
    }

    public void setMemberDiscount(double memberDiscount) {
        this.memberDiscount = memberDiscount;
    }

    public void addInventory(Book newBook){
        inventory.add(newBook);
    }

    public void addMemberships(Customer newCustomer){
        memberships.add(newCustomer);
    }

    public void removeInventory(Book book){
        String bookTitle = book.getTitle();

        for(Book currentBook : inventory){
            if (currentBook.getTitle() == bookTitle){
                 inventory.remove(currentBook);
                 soldBooks.add(currentBook);
                 break;
            }
        }
    }

    public void viewBooks(){
        System.out.println(" The following books are in our inventory");
        for (Book book : inventory){
            System.out.println(
                    "Title: " + book.getTitle()
                    + " Author: " + book.getAuthor()
                    + " Cost: " + book.getCost()
                    + " Member Cost: "+ book.getCost() * (1-memberDiscount));
        }
    }




}


