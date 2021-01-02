package com.train.kotlin

import java.util.*

fun main() {
    val ASK_ONEWAY_NUM_MSG = "Please enter number of tickets:"
    val ASK_ROUND_TRIP_NUM_MSG = "How many round-trip tickets:";

    var oneWayTicketsNum = inputIntCheck(ASK_ONEWAY_NUM_MSG);
    var roundTripTicketsNum = inputIntCheck(ASK_ROUND_TRIP_NUM_MSG);

    Ticket(oneWayTicketsNum,roundTripTicketsNum).getTotal()
}

private fun inputIntCheck(msg : String): Int {
    val IS_NOT_INT_ERR_MSG = "Input errors, please re-enter."

    val sc = Scanner(System.`in`)
    var num: Int?
    do {
        print(msg)
        num = if (sc.hasNextInt()) sc.next().toInt() else {
            println(IS_NOT_INT_ERR_MSG)
            sc.nextLine()
            null
        }
    } while (num == null)
    return num
}

class Ticket(var OneWayTicketsNum: Int, var RoundTripTicketsNum: Int) {
    val ONE_WAY_PRICE = 1000
    val ROUND_TRIP_PRICE = 2000
    val ROUND_TRIP_DISC = 0.9

    fun getTotal() {
        println(
            "Total tickets: ${OneWayTicketsNum + RoundTripTicketsNum} " +
                    "Round-trip: $RoundTripTicketsNum " +
                    "Total: ${(OneWayTicketsNum*ONE_WAY_PRICE + RoundTripTicketsNum*ROUND_TRIP_PRICE*ROUND_TRIP_DISC).toInt()}"
        )
    }
}