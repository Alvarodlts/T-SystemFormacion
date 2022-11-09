/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.vending;

import java.util.ArrayList;

/**
 *
 * @author alvdelat
 */
public class VendingMachine {
    private ArrayList <Product> product = new ArrayList();

    public ArrayList<Product> getProduct() {
        return product;
    }
    
    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }
    
    public void addProduct(Product product){
        this.product.add(product);
    }
    
    public void generateProducts(){
        Product product1 = new Product(2.5,"Cheetos",4);
        Product product2 = new Product(1.70,"Kit-Kat",1);
        Product product3 = new Product(1,"Gum",3);
        Product product4 = new Product(2.2,"Cookies",8);
        this.product.add(product1);
        this.product.add(product2);
        this.product.add(product3);
        this.product.add(product4);  
    }

    public void getNameProducts(){
        for(int i=0; i < product.size(); i++){
            System.out.println( i + " - " + product.get(i).getName() +" quanty: " + 
                    product.get(i).getQuanty()+ "       "); 
        }
    }
    
    public Product getProductIndex(int n){  
        return product.get(n);
    }
       
}
