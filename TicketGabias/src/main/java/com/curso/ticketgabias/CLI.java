/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ticketgabias;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alvdelat
 */
public class CLI {

    public void start() {
        Scanner soption = new Scanner(System.in);
        Scanner sdate = new Scanner(System.in);
        Scanner squanty = new Scanner(System.in);
        Scanner smoney = new Scanner(System.in);
        SellSystem system = new SellSystem();
        system.generateTickets();

        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to the Users Management\n"
                    + "Press 1 to start       Press 2 to exit\n");
            int option = soption.nextInt();

            // Check date 
            if (option == 1) {

                ArrayList<TicketsPerDay> tickets_with_quanty = new ArrayList();

                System.out.println("Introduce Tickets quanty");
                int quanty = squanty.nextInt();

                tickets_with_quanty = system.showDates(quanty);
                system.showDatesToString(tickets_with_quanty);

                int date = sdate.nextInt();

                int total = system.totalPrice(quanty);
                System.out.println("The value of your tickets is: "
                        + "" + total);

                System.out.println("Introduce the money");
                int money = smoney.nextInt();

                System.out.println("Calculating your change ");

                if (system.changeMoney(money, total) <= 0) {
                    System.out.println("Your change is: " + system.changeMoney(money, total)
                            + "Thanks for buy on TicketGabias.\n");
                    system.buyTickets(quanty, date);
                }
            }

            //exit from the program
            if (option == 2) {
                System.out.println("EXIT  ...");
                exit = true;

            }
        }
    }
}
