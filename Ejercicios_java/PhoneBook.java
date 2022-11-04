/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejercicios;

import java.util.HashMap;

/**
 *
 * @author alvdelat
 */
public class PhoneBook {
    private HashMap <String, Integer> agenda = new HashMap();
    
    public PhoneBook(){
        agenda.put("Juanjo", 111111111);
        agenda.put("Marta", 222222222);
        agenda.put("Lucia", 333333333);
        agenda.put("Manuel", 444444444);
    }
    
    public int getPhone(String name){
        int n ;
        n  = agenda.get(name);
     
        return n;
    }
    
    
    
}
