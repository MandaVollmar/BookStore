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

    public Customer (String name, int age, boolean isMember, double budget) {
        this.name=name;
        this.age=age;
        this.isMember=isMember;
        this.budget=budget;
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
    public boolean getIsMember(){
        return isMember;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
    // When book is bought it is added to customer inventory and taken from bookstore inventory.
    public void buyBook(){}
}
