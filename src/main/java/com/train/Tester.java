package com.train;

import java.util.Scanner;

public class Tester {
    final static String ASK_ONEWAY_NUM_MSG = "Please enter number of tickets:";
    final static String ASK_ROUND_TRIP_NUM_MSG = "How many round-trip tickets:";
    final static String IS_NOT_INT_ERR_MSG = "Input errors, please re-enter.";

    public static void main(String[] args) {
        int oneWayTicketsNum = inputIntCheck(ASK_ONEWAY_NUM_MSG);
        int roundTripTicketsNum = inputIntCheck(ASK_ROUND_TRIP_NUM_MSG);
        System.out.println(
                new Ticket(oneWayTicketsNum,roundTripTicketsNum)
                        .getTotal()
        );


    }

    private static int inputIntCheck(String Message) {
        boolean isNotInt = true;
        int TicketsNum = 0 ;

        Scanner sc = new Scanner(System.in);
        while (isNotInt) {
            try {
                System.out.print(Message);
                TicketsNum = sc.nextInt();
                isNotInt = false;
            } catch (Exception e) {
                System.out.println(IS_NOT_INT_ERR_MSG);
                sc.nextLine();
            }
        }
        return TicketsNum;
    }
}