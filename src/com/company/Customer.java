package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    String name;
    int age;
    boolean isMember;
    double budget;
    List<Book> boughtBooks = new ArrayList<>();

    public Customer(boolean isMember, double budget) {
        this.isMember = isMember;
        this.budget = budget;
    }

    public Customer(String name, int age, boolean isMember, double budget) {
        this.name = name;
        this.age = age;
        this.isMember = isMember;
        this.budget = budget;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setIsMember(boolean isMember) {
        this.isMember = isMember;
    }

    public boolean getIsMember() {
        return isMember;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public boolean buyMembership() {
        if (budget >= 10) {
            isMember = true;
            return true;

        }else{
            return false;
        }
    }

    public void buyBook(Book myBook, BookStore myBookstore) {
        if (isMember == true) {
            if (budget >= (myBook.getCost() * (1 - myBookstore.getMemberDiscount()))) {
                myBookstore.removeInventory(myBook);
                boughtBooks.add(myBook);
            } else {
                System.out.println("Sorry not funds");
            }
        } else {
            if (budget >= (myBook.getCost())) {
                myBookstore.removeInventory(myBook);
                boughtBooks.add(myBook);
            } else {
                System.out.println("Sorry not funds");
            }
        }
    }
}
