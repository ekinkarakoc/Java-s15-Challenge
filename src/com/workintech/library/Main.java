package com.workintech.library;

import com.workintech.library.user.Admin;
import com.workintech.library.user.NormalUser;
import com.workintech.library.user.User;

import java.util.Scanner;


public class Main {

    static Scanner s;
    static Database database;


    public static void main(String[] args) {

        database = new Database();

        System.out.println("Welcome to Library!");

        int num;
        do {
            System.out.println(
                    "0. Exit\n1. Login\n2. New User ");

            s = new Scanner(System.in);
            num = s.nextInt();

            switch (num) {
                case 1:
                    login();

                case 2:
                    newUser();

            }
        } while (num != 0);
    }

    private static void login() {
        System.out.println("Enter Phone Number:");
        String phoneNumber = s.next();
        System.out.println("Enter Email:");
        String email = s.next();
        int n = database.login(phoneNumber, email);
        if (n != -1) {
            User user = database.getUser(n);
            user.menu(database, user);
        } else {
            System.out.println("user doesn't exist!");
        }
    }

    private static void newUser() {
        System.out.println("Enter Name:");
        String name = s.next();
        System.out.println("Enter Phone Number");
        String phoneNumber = s.next();
        System.out.println("Enter Email:");
        String email = s.next();
        System.out.println("1. Admin \n2. Normal User");
        int n2 = s.nextInt();
        User user;
        if (n2 == 1) {
            user = new Admin(name, email, phoneNumber);
        } else {
            user = new NormalUser(name, email, phoneNumber);
        }
        database.addUser(user);
        user.menu(database,user);
    }

}