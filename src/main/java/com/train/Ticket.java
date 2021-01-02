package com.train;

public class Ticket {
    static String TotalMsg = "Total tickets: %d Round-trip: %d Total: %.0f";
    int OneWayTicketsNum;
    int RoundTripTicketsNum;

    public Ticket(int oneWayTicketsNum, int roundTripTicketsNum) {
        OneWayTicketsNum = oneWayTicketsNum;
        RoundTripTicketsNum = roundTripTicketsNum;
    }

    public String getTotal(){
        return String.format(TotalMsg,
                OneWayTicketsNum+RoundTripTicketsNum,
                RoundTripTicketsNum,
                OneWayTicketsNum*1000+RoundTripTicketsNum*2000*0.9);
    }

}