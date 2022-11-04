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
    
    private T productName;
    private T productPrice;
    
    public Products(){
        productName = null;
        productPrice = null;
    }

    public T getProductType() {
        return productName;
    }

    public void setProductType(T productType) {
        this.productName = productType;
    }

    public T getProductName() {
        return productName;
    }

    public void setProductName(T productName) {
        this.productName = productName;
    }

    public T getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(T productPrice) {
        this.productPrice = productPrice;
    }
    
    
}
