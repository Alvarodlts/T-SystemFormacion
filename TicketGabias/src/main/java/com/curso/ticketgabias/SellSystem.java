/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ticketgabias;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author alvdelat
 */
public class SellSystem {

    TicketsPerDay ticket;
    ArrayList<TicketsPerDay> tickets;

    public SellSystem() {
        this.ticket = new TicketsPerDay();
        this.tickets = new ArrayList();
    }

    public void generateTickets() {
        TicketsPerDay ticket1 = new TicketsPerDay("1-01-2022");
        TicketsPerDay ticket2 = new TicketsPerDay("2-01-2022");
        TicketsPerDay ticket3 = new TicketsPerDay("3-01-2022");
        TicketsPerDay ticket4 = new TicketsPerDay("4-01-2022");
        TicketsPerDay ticket5 = new TicketsPerDay("5-01-2022");
        TicketsPerDay ticket6 = new TicketsPerDay("6-01-2022");
        TicketsPerDay ticket7 = new TicketsPerDay("7-01-2022");
        TicketsPerDay ticket8 = new TicketsPerDay("8-01-2022");
        TicketsPerDay ticket9 = new TicketsPerDay("9-01-2022");
        TicketsPerDay ticket10 = new TicketsPerDay("10-01-2022");
        TicketsPerDay ticket11 = new TicketsPerDay("11-01-2022");
        TicketsPerDay ticket12 = new TicketsPerDay("12-01-2022");
        TicketsPerDay ticket13 = new TicketsPerDay("13-01-2022");
        TicketsPerDay ticket14 = new TicketsPerDay("14-01-2022");
        TicketsPerDay ticket15 = new TicketsPerDay("15-01-2022");
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);
        tickets.add(ticket6);
        tickets.add(ticket7);
        tickets.add(ticket8);
        tickets.add(ticket9);
        tickets.add(ticket10);
        tickets.add(ticket11);
        tickets.add(ticket12);
        tickets.add(ticket13);
        tickets.add(ticket14);
        tickets.add(ticket15);
    }

    public ArrayList<TicketsPerDay> showDates(int quanty) {

        ArrayList<TicketsPerDay> tickets_per_day = new ArrayList();
        try {
            for (TicketsPerDay ticket : tickets) {
                if (quanty <= ticket.getQuanty()) {
                    tickets_per_day.add(ticket);
                }
            }
        } catch (Exception e) {
            System.out.println("We dont have dates for this quanty\n");
        }

        return tickets_per_day;
    }

    public void showDatesToString(ArrayList<TicketsPerDay> dates) {
        for (int i = 0; i < dates.size(); i++) {
            System.out.println("Press " + i + " to buy on: " + dates.get(i).getDate()
                    + "--> quanty: " + dates.get(i).getQuanty());
        }

    }

    public void buyTickets(int quanty, int date) {
        if (tickets.get(date).getQuanty() >= quanty) {
            int new_quanty = tickets.get(date).getQuanty() - quanty;
            tickets.get(date).setQuanty(new_quanty);
        }
    }

    public int totalPrice(int quanty) {
        return quanty * this.ticket.getPrice();
    }

    public int changeMoney(int money, int total) {
        int change = -1;
        try {
            if (money >= total) {
                change = total - money;
                //System.out.println("Your change is: " + change);
            }

        } catch (Exception e) {
            System.out.println("The money is insufficient");
        }
        return change;
    }

    @Override
    public String toString() {
        return "SellSystem{" + "ticket=" + ticket + ", tickets=" + tickets + '}';
    }

}
