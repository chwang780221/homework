package com.train.homework.kotlin

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var mTickets = 0
    var mRoundTripTickets = 0

    print("Please enter nmber of tickets:")
    mTickets = scanner.nextInt()
    print("Please enter round-trip tickets:")
    mRoundTripTickets = scanner.nextInt()

    val ticket = TicketKotlin(tickets = mTickets, roundTripTicket = mRoundTripTickets)
    ticket.print()
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