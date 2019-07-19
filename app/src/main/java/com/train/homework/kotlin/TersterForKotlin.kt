package com.train.homework.kotlin

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val TICKETS_STOP = -1
    var tickets = 0
    var roundTripTickets = 0

    while (tickets != TICKETS_STOP) {
        print("Please enter nmber of tickets:")
        tickets = scanner.nextInt()
        if (tickets == TICKETS_STOP) break
        print("Please enter round-trip tickets:")
        roundTripTickets = scanner.nextInt()
        if (tickets == TICKETS_STOP) break
        val ticket = TicketKotlin(tickets = tickets, roundTripTicket = roundTripTickets)
        ticket.print()
    }
}

class TicketKotlin(var tickets: Int, var roundTripTicket: Int) {
    fun print() {
        val mOneWayPrice = 1000
        val mRoundTripPrice = (mOneWayPrice * 2 * 0.9)
        var total = (tickets - roundTripTicket) * mOneWayPrice + (roundTripTicket * mRoundTripPrice)
        println("Total tickets: " + tickets)
        println("Round-trip: " + roundTripTicket)
        println("Total: " + total.toInt())
    }
}