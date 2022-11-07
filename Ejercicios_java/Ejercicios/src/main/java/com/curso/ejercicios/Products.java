/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejercicios;

/**
 *
 * @author alvdelat
 * @param <T>
 */
public class Products <T>{
    
    private String productName;
    private int productPrice;
    
    public Products(){
        productName = "";
        productPrice = 0;
    }
    public Products(String productName, int productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
    

    
}
