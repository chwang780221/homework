package com.train.homework.java;

public class Tickets {
    private int mTickets;
    private int mRoundTripTickets;
    private double mOneWayPrice;
    private double mRoundTripPrice;

    public Tickets(int Tickets, int RoundTripTickets) {
        this.mTickets = Tickets;
        this.mRoundTripTickets = RoundTripTickets;
        this.mOneWayPrice = 1000;
        this.mRoundTripPrice = (mOneWayPrice * 2 * 0.9);
    }

    public void getAnswer() {
        if (check()) {
            double Total = getTotal();
            System.out.println("Total tickets:" + mTickets);
            System.out.println("Round-trip:" + mRoundTripTickets);
            System.out.println("Total:" + Math.round(Total));
        } else {
            System.out.println("Error");
        }
    }

    private double getTotal() {
        return (mTickets - mRoundTripTickets) * mOneWayPrice + mRoundTripTickets * mRoundTripPrice;
    }

    private boolean check() {
        if ((mTickets >= mRoundTripTickets) && (mTickets > 0) && (mRoundTripTickets >= 0)) {
            return true;
        } else {
            return false;
        }
    }
}
