package com.train;

public class Ticket {
    final String TOTAL_MSG = "Total tickets: %d Round-trip: %d Total: %.0f";
    final int ONE_WAY_PRICE = 1000;
    final int ROUND_TRIP_PRICE = 2000;
    final float ROUND_TRIP_DISC = 0.9f;

    int OneWayNum;
    int RoundTripNum;


    public Ticket(int oneWayNum, int roundTripNum) {
        OneWayNum = oneWayNum;
        RoundTripNum = roundTripNum;
    }

    public String getTotal(){
        return String.format(TOTAL_MSG,
                OneWayNum + RoundTripNum,
                RoundTripNum,
                OneWayNum* ONE_WAY_PRICE + RoundTripNum* ROUND_TRIP_PRICE * ROUND_TRIP_DISC);
    }

}