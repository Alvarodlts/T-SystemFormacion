/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.vending;

import java.util.Scanner;

/**
 *
 * @author alvdelat
 */
public class IU {
    
    
    public void start() throws Exception{
        
        
        Scanner scoin = new Scanner(System.in);
        Scanner sproduct = new Scanner(System.in);
        Scanner soption = new Scanner(System.in);
        Scanner smorecoins = new Scanner(System.in);
        VendingMachine machine = new VendingMachine();
        machine.generateProducts();
        boolean exit = false;
        
        while(!exit){
            
            System.out.println("Press 1 to start    Press 2 to exit");
            int option = soption.nextInt();
            double total_coins = 0;
            if(option == 1){
                boolean morecoins = true;
                while(morecoins){
                    System.out.println("Introduce a coin: ");
                    total_coins += scoin.nextDouble();
                    
                    System.out.println("¿More coins? 1 yes  2 no");
                    int optioncoins = smorecoins.nextInt();
                    
                    if(optioncoins == 2){
                        morecoins = false;
                    }
                    
                }
                
               

                System.out.println("Choose the number of the product: \n");
                machine.getNameProducts();
                int product = sproduct.nextInt();

                try{
                    if(machine.getProductIndex(product).getQuanty() == 0){
                            throw new Exception("The quanty of the product is 0");
                    }
                }
                catch(Exception e){
                    System.out.println(e.toString());
                }


                if(total_coins >= machine.getProductIndex(product).getPrice()){


                System.out.println(" ... (the product is falling) ... ");
                int current_quanty = machine.getProductIndex(product).getQuanty() - 1;
                machine.getProductIndex(product).setQuanty(current_quanty);
                System.out.println("Thank you for choose VendingMachine\n");

                }
                else{
                    System.out.println("The balance is insufficient, take your coin and try again");
                }
            }
            if(option == 2){
                System.out.println("Exit...");
                exit = true;
            }
        }
    }
}
