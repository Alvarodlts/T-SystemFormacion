/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejercicios;

/**
 *
 * @author alvdelat
 */
public class Patient implements Comparable<Patient>{
    String name;
    String sick;
    int risk;
    
    public Patient(int risk, String name, String sick){
        this.name=name;
        this.sick =sick;
        this.risk = risk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSick() {
        return sick;
    }

    public void setSick(String sick) {
        this.sick = sick;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    @Override
    public int compareTo(Patient o) {
        if(this.equals(o)){
           return 0;
        }
        else if (this.risk > o.getRisk()){
           return 1; //Lo ponemos al principio 
       }

       else return -1;
    }


    
    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", sick=" + sick + ", risk=" + risk + '}';
    }
    
    
}
