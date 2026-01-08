package com.reservation.servlet;

public class LoginServlet {

    public static void main(String[] args) {

        String username = "admin";
        String password = "1234";

        if(username.equals("admin") && password.equals("1234")) {
            System.out.println("Login Successful");
            System.out.println("Redirecting to Reservation Page...");
        } else {
            System.out.println("Invalid Credentials");
        }
    }
}
