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

    public int getRicesPackages(double weigth) throws IllegalArgumentException, Exception {
        boolean bool = true;
        if (weigth < 0) {
            throw new IllegalArgumentException("Invalid weight");
        } else {

            int current_weigth = 0;
            int total_packages = 0;
            double weigth_objetive = weigth;
            while (current_weigth < weigth_objetive && bool) {
                try {
                    if (weigth_objetive > current_weigth && weigth >= 5) {
                        current_weigth += 5;
                        weigth -= 5;
                        total_packages++;
                    } else if (weigth_objetive > current_weigth && weigth >= 3 && weigth < 5) {
                        current_weigth += 3;
                        weigth -= 3;
                        total_packages++;
                    } else if (weigth_objetive > current_weigth && weigth >= 1 && weigth < 3) {
                        current_weigth += 1;
                        weigth -= 1;
                        total_packages++;
                    } else if (weigth < 1) {
                        throw new Exception();
                    }
                } catch (Exception ex) {
                    System.out.println("Error: No se puede llegar a la solucion");
                    bool = false;
                    total_packages = -1;
                }

            }
            return total_packages;
        }
    }

}
