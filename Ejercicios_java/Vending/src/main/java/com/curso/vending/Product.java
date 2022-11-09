/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.vending;

/**
 *
 * @author alvdelat
 */
public class Product {

    private double price;
    private String name;
    private int quanty;

    public int getQuanty() {
        return quanty;
    }

    public void setQuanty(int quanty) {
        this.quanty = quanty;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Product(double price, String name, int quanty) {
        this.price = price;
        this.name = name;
        this.quanty = quanty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

}
