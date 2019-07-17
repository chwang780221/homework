package com.train.homework.java;

import java.util.Scanner;

public class Terster {
    public static void main(String[] args) {
        int mTickets;
        int mRoundTripTickets;
        Scanner mScanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets:");
        mTickets = mScanner.nextInt();
        System.out.print("How many round trip- tickets:");
        mRoundTripTickets = mScanner.nextInt();
        Tickets mTotalTickets = new Tickets(mTickets, mRoundTripTickets);
        mTotalTickets.getAnswer();
    }
}