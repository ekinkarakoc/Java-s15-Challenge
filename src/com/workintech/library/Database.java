package com.workintech.library;

import com.workintech.library.user.User;

import java.util.ArrayList;

public class Database {

    private ArrayList<User> users = new ArrayList<User>();
    private ArrayList<String> usernames = new ArrayList<String>();
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<String> booknames = new ArrayList<String>();


    public void addUser(User s){
        users.add(s);
        usernames.add(s.getName());
    }

    public int login(String phonenumber, String email){
        int n = -1;
        for(User s: users){
            if (s.getPhoneNumber().matches(phonenumber) && s.getEmail().matches(email)){
                n = users.indexOf(s);
                break;
            }
        }
        return n;
    }

    public User getUser(int n){
        return users.get(n);
    }

    public void AddBook(Book book){
        books.add(book);

    }
}
