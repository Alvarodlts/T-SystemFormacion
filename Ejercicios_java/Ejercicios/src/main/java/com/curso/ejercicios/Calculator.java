/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejercicios;

/**
 *
 * @author alvdelat
 */
public class Calculator {

    public Calculator(){}
    
    
    
    private double sum(int num1, int num2){
        return num1 + num2;
    }
    private double substraction(int num1, int num2){
        return num1 - num2;
    }
    private double multiplication(int num1, int num2){
        return num1 * num2;
    }
    private double division(int num1, int num2){
        double result = 0;
        try{
            result = num1/num2;
        }
        catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
        /*finally{
            System.out.println(result);
        }*/
        return result;
    }
    
    public double operator(int num1, String operator, int num2){
        double result = 0;
        if ("+".equals(operator)){
            result = sum(num1,num2);
        } else {
        }
        if ("-".equals(operator)){
            result = substraction(num1,num2);
        }
        if ("*".equals(operator)){
            result = multiplication(num1,num2);
        }
        if ("/".equals(operator)){
            result = division(num1,num2);
        }
    return result;
    }
    
    
}
