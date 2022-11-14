/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ticketgabias;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author alvdelat
 */
public class TicketsPerDay {
    private int price;
    private String date;
    private int quanty = MAX_QUANTY;
    private static final int MAX_QUANTY = 10;
    private static  final int MAX_PRICE = 4;

    public TicketsPerDay() {
        this.price = MAX_PRICE;
        //this.quanty = MAX_QUANTY;
    }

    public TicketsPerDay(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQuanty() {
        return this.quanty;
    }

    public void setQuanty(int quanty) {
        this.quanty = quanty;
    }

    public int getPrice() {
        return this.price;
    }

    public static int getMAX_QUANTY() {
        return MAX_QUANTY;
    }

    public static int getMAX_PRICE() {
        return MAX_PRICE;
    }
    
  
}
