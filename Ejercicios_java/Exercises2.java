package com.curso.ejercicios;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author alvdelat
 */
public class Exercises2 {

    //ArrayList<String> romans = new ArrayList();

    public Exercises2() {
        /*this.romans.add("I"); // 1
        this.romans.add("V"); // 5
        this.romans.add("X"); // 10
        this.romans.add("L"); // 50
        this.romans.add("C"); // 100
        this.romans.add("D"); // 500
        this.romans.add("M"); // 1000*/

    }

    public int romanToDecimal(String roman_num) {

        int result = 0;
        roman_num = roman_num+' ';
        int length = roman_num.length()-1;
        for (int i = 0; i < length; i++) {

            int j = i+1;
            char next = roman_num.charAt(j);
            char current = roman_num.charAt(i);
                    
            // Si el caracter empieza por M, no se puede substraer (1000)
            if (current == 'M') {
                result += 1000;
            } // Si el caracter empieza por C
            else if (current == 'C') {
                //Si el caracte empieza por C y el siguiente es M CM=900 
                if (next == 'M') {
                    result += 900;
                    i++;
                } // Si el caracter siguiente es D CD= 400
                else if (next == 'D') {
                    result += 500;
                    i++;
                } //Si es C = 100
                else {
                    result += 100;
                    System.out.println("result: " + result);
                }
            } //Si empieza por D no se puede substraer 
            else if (current == 'D') {
                result += 500;
            } //Si empieza por X es substractivo
            else if (current == 'X') {

                if (next == 'C') {
                    result += 90;
                    i++;
                } else if (next == 'L') {
                    result += 40;
                    i++;
                } else {
                    result += 10;
                }
            } //Si empieza por L no se puede substraer 
            else if (current == 'L') {
                result += 50;
            } //Si empieza por V no se puede substraer
            else if (current == 'V') {
                result += 5;
            } else if (current == 'I') {
                if (next == 'X') {
                    result += 9;
                    i++;
                } else if (next == 'V') {
                    result += 4;
                    i++;
                } else {
                    result += 1;
                }
            }
        }
        return result;
    }// Fin del metodo
    
    
    
    public int days(String date1, String date2){
        //dd/MM/aaaa 
        
        String days1[] , days2[];
        int days;
        int years;
        int months;
        days1 = date1.split("/");
        days2 = date2.split("/");
        years = (Integer.parseInt(days2[2]) - Integer.parseInt(days1[2])) * 365;
        months = (Integer.parseInt(days2[1]) - Integer.parseInt(days1[1])) * 31 - Integer.parseInt(days2[0]);
        days = 31 - Integer.parseInt(days1[0]) + Integer.parseInt(days2[0]) + years + months;
        System.out.println("No considero ni años bisiestos ni meses con menos de 31 días");
        return days;
        
    }
    
    public int fibonacciRecursive(int n){
        if (n < 2){
            return n;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }
    
    public int fibonacciDinamic(int n) {
        int next = 1, current = 0, temp = 0;
        if(n == 0 || n == 1){
            return 1;
        }
        for (long x = 1; x <= n; x++) {
                temp = current;
                current = next;
                next = next + temp;
        }
        return current;
    }
    
    
    
  
}
