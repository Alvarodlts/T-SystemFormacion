/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.curso.ejercicios;


import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;
import Shapes.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Stack;
import java.util.TimeZone;


/**
 *
 * @author alvdelat
 */
public class Ejercicios {

    public static void main(String[] args) {
        
        System.out.println("----- EJERCICIOS 1 -------");
        Exercises ejercicio = new Exercises();
        System.out.println("¿Es abba palindromo? " + ejercicio.isPalindrome("abba"));
        System.out.println("Es aabc palabra Palindromo?: " + ejercicio.isPalindrome("aabc"));
        System.out.println("Es 1231 Num Palindromo?: " + ejercicio.isNumPalindrome(1231));
        System.out.println("Es 1221 Num Palindromo?: " + ejercicio.isNumPalindrome(1221));
        System.out.println("El factorial de 5 es: " + ejercicio.numFactorial(5));
        System.out.println(" MCD de 20 y 14 es " + ejercicio.comunDivisor(20, 14));
        System.out.println(" ¿El número 370 es Amstrong y el 502? " + ejercicio.amstrong(370) + 
                " " + ejercicio.amstrong(502));
        System.out.println("Palabra al reves: hola: " + ejercicio.reverse("hola"));
        System.out.println("Problema de arroz con peso 29Kg: " + ejercicio.arroz(29));
        System.out.println();
       

        // ---------------------------- EJERCICIOS 2 ---------------------//
        // ---------------------------- EJERCICIOS 2 ---------------------//
        System.out.println("----- EJERCICIOS 2 -------");
        //DE ROMANO A DECIMAL
        Exercises2 exercises2 = new Exercises2();
        System.out.println("Calculamos la cifra MDCCXLIII --> 1743 ");
        System.out.println(exercises2.romanToDecimal("MDCCXLIII"));
        
        //DATES
        System.out.println("La diferencia de días es de: " +
                exercises2.days("23/09/1994", "25/11/1996"));
        
        //FIBONACCI
        System.out.println("La sucesion recursiva de fibonacci de 25: " + 
                exercises2.fibonacciRecursive(25));
        System.out.println("La sucesion PD de fibonacci de 25: " + 
                exercises2.fibonacciDinamic(25));
        
        //AREAS OF SHAPES
        Shapes square = new Square(5,5);
        Shapes rectangle = new Rectangle(5,5);
        Shapes triangle = new Triangle(5,5);
        Shapes circle = new Circle(5,5);

        System.out.println("Square area: " + square.area());
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Circle area: " + circle.area());
        System.out.println("Triangle area: " + triangle.area());
        

        
        //CALCULADORA
        Calculator calculator = new Calculator();
        Calculator calculatorPro = new CalculatorPro();
        
        System.out.println("10 + 2 = "
                + calculator.operator(10, "+", 2));
        System.out.println("10 - 2 = " + 
                calculator.operator(10, "-", 2));
        System.out.println("10 * 2 = "+
                calculator.operator(10, "*", 2));
        System.out.println("10 / 2 = " + 
                calculator.operator(10, "/", 2));
        System.out.println("10 / 0 = "+
                calculator.operator(10, "/", 0));
        System.out.println("2^3 = "+
                calculatorPro.operator(2, "^", 3));
        System.out.println("3! = " + 
                calculatorPro.operator(3, "!", 0));
        

        Products <PhoneBook> producto = new Products("agenda", 23);
        // -------------- EXCECPCIONES --------------------//
        /*System.out.println("-- EXCEPCIONES --");
        int resultado = 10;
        int dividendo = 2;
        int divisor = 0 ;
                
        try{
            resultado = dividendo/divisor;
        }
        catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
        finally{
            System.out.println(resultado);
        }
        
        
        
        System.out.println("CAPTURAR ERROR DE ILLEGAL ARGUMENT MCD de 2 y 14");
        //System.out.println(factorial.ComunDivisor(2, 14));*/
        // Sacanner sc = new Scanner(System.in);
        // String opcion = sc.nextLine(I);
        //Math.random();
        /*Random numeroAleatorio = new Random();
        int opcion = numeroAleatorio.nextInt(3);
        System.out.println(opcion);*/
        
        // ------------ JUEGO DE PIEDRA PAPEL TIJERA ------------------ //    
        //System.out.println(factorial.PiedraPapelTijera()); 
        // Tipos de listas
        /*
        LinkedList <String> lista = new LinkedList();
        lista.add("Primera posicion");
        lista.addFirst("Ahora soy yo la primera");
        lista.add("soy una cadena");
        lista.poll(); //Quita la primera posicion
        lista.peek(); //Muestra la primera posicion pero no la elimina
 
        
        for(String cadena: lista){
            System.out.println(cadena);
        
        }*/
        /*Patient paciente1 = new Patient(10,"Gerardo", "Lepra");
        Patient paciente2 = new Patient(4,"Manuel", "Gastronteritis");
        Patient paciente3 = new Patient(1,"Lucia", "Jaqueca");
        Patient paciente4 = new Patient(8,"Juan", "Jaqueca");

        PriorityQueue<Patient> pacientes = new PriorityQueue<>();

        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);
        
        for(Patient p: pacientes){
            System.out.println(p);
        }*/

        
        
        
        
        
        
        //HASHSET
        //HashSet <Patient> conjunto = new HasSet();
        //PhoneBook agenda = new PhoneBook();
        //System.out.println(agenda.getPhone("Juanjo"));
        
        /*
        HashSet<String> cadena = new HashSet<String>();
        cadena.add("Las manualidades de manuel son de carton");
        System.out.println(cadena);
        
        Iterator<String> i = cadena.iterator();
        Iterator<String> j = cadena.iterator();
        
        
        String actual = "";
        String anterior ="";
        boolean unica = true;
        
        while(i.hasNext()){
            anterior = i.next();
            unica = true;
            while(j.hasNext()){
                actual = j.next();
                System.out.println("Valro actual: " + actual + "valor anterior: " + anterior);
                
                
                if(anterior==actual){
                    unica = false;
                    
                }
            }
            
            if(unica==true){
                System.out.println(anterior+" Es única");
            }
            
        }*/
        
        
        
        
      /*
        GregorianCalendar calendar = new GregorianCalendar(new Locale("Es","es"));
        GregorianCalendar calendar2 = new GregorianCalendar(new Locale("En","LA"));
        System.out.println(calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE));
        System.out.println(calendar2.get(Calendar.HOUR) + ":" + calendar2.get(Calendar.MINUTE));
        System.out.println(calendar2.getTime());
        
        GregorianCalendar calendar3 = new GregorianCalendar(TimeZone.getTimeZone("America/Los_Angeles"));
        System.out.println(calendar3.get(Calendar.HOUR) + ":" + calendar3.get(Calendar.MINUTE));*/
        
      
        
      
        
    }

}
