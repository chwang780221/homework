package com.train.homework.java;

import java.util.Scanner;

public class Terster {
    public static void main(String[] args) {
        int tickets = 0;
        int roundTripTickets = 0;
        final int TICKETS_STOP = 1;
        Scanner mScanner = new Scanner(System.in);

        while (tickets != TICKETS_STOP) {
            System.out.print("Please enter number of tickets:");
            tickets = mScanner.nextInt();
            if (tickets == TICKETS_STOP) {
                break;
            }
            System.out.print("How many round trip- tickets:");
            roundTripTickets = mScanner.nextInt();
            if (roundTripTickets == TICKETS_STOP) {
                break;
            }
            Tickets mTotalTickets = new Tickets(tickets, roundTripTickets);
            mTotalTickets.getAnswer();
        }

    }
}