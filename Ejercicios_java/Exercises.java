/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejercicios;

import java.util.ArrayList;

/**
 *
 * @author alvdelat
 */
public class Exercises {

    public boolean isNumPalindrome(int num) {
        String number = String.valueOf(num);
        char[] digits = number.toCharArray();
        boolean pal = true;

        for (int i = 0, j = digits.length - 1; i <= j; i++, j--) {
            if (digits[i] != digits[j]) {
                pal = false;
                break;
            }
        }
        return pal;
    }

    public boolean isPalindrome(String cadena) {

        boolean pal = true;
        for (int i = 0, j = cadena.length() - 1; i <= j; i++, j--) {
            if (cadena.charAt(i) != cadena.charAt(j)) {
                pal = false;
                break;
            }
        }

        return pal;
    }

    public String reverse(String cadena) {
        String reverse = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            reverse += cadena.charAt(i);
        }
        return reverse;
    }
    
    
    public int numFactorial(int num) {
        int factorial = 1;

        for (int i = 1; i < num; i++) {
            factorial += i * factorial;
        }
        return factorial;
    }

    public int comunDivisor(int num1, int num2) throws IllegalArgumentException {
        if (num1 == 2) {
            throw new IllegalArgumentException("valor no valido");
        } else {

            int temporal;
            while (num2 != 0) {
                temporal = num2;
                num2 = num1 % num2;
                num1 = temporal;
            }

            return num1;
        }
    }

    public boolean amstrong(int num) {
        int temp = 0;
        int sum = 0;
        int amstrong = num;

        while (num != 0) {
            temp = num % 10;
            sum = sum + temp * temp * temp;
            num /= 10;
        }

        return sum == amstrong;
    }

    public ArrayList<Integer> arroz(int peso) {
        ArrayList<Integer> cantidad_usados = new ArrayList();
        ArrayList<Integer> paquetes = new ArrayList();
        int peso_actual = 0;
        paquetes.add(1);
        paquetes.add(3);
        paquetes.add(5);
        cantidad_usados.add(0);
        cantidad_usados.add(0);
        cantidad_usados.add(0);
        int arroz1 = 0;
        int arroz2 = 0;
        int arroz3 = 0;
        int paquetes_totales = 0;
        int peso_objetivo = peso;

        while (peso_actual < peso_objetivo) {

            if (peso_objetivo > peso_actual && peso >= 5) {
                peso_actual += 5;
                peso -= 5;
                arroz3++;
                paquetes_totales++;
                cantidad_usados.set(2, arroz3);
            }

            if (peso_objetivo > peso_actual && peso >= 3 && peso < 5) {
                peso_actual += 3;
                peso -= 3;
                arroz2++;
                paquetes_totales++;
                cantidad_usados.set(1, arroz2);
            }

            if (peso_objetivo > peso_actual && peso >= 1 && peso < 3) {
                peso_actual += 1;
                peso -= 1;
                arroz1++;
                paquetes_totales++;
                cantidad_usados.set(0, arroz1);
            }
        }
        return cantidad_usados;
    }    

}
