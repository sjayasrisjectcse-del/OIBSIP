package com.reservation.servlet;
import java.util.Random;

public class ReservationServlet {

    public static void main(String[] args) {

        String name = "User";
        String from = "Chennai";
        String to = "Coimbatore";

        Random r = new Random();
        int pnr = r.nextInt(999999);

        System.out.println("Ticket Booked Successfully");
        System.out.println("Passenger: " + name);
        System.out.println("Route: " + from + " -> " + to);
        System.out.println("PNR Number: " + pnr);
    }
}
