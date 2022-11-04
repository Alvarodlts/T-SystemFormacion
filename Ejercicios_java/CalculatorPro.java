/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejercicios;

import static java.lang.Math.*;

/**
 *
 * @author alvdelat
 */
public class CalculatorPro extends Calculator {

    public CalculatorPro() {

    }

    private double methodPow(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    private int numFactorial(int num) {
        int factorial = 1;

        for (int i = 1; i < num; i++) {
            factorial += i * factorial;
        }
        return factorial;
    }

    @Override
    public double operator(int num1, String operator, int num2) {
        double result;
        if (null == operator) result = super.operator(num1, operator, num2);
        else result = switch (operator) {
            case "^" -> methodPow(num1, num2);
            case "!" -> numFactorial(num1);
            default -> super.operator(num1, operator, num2);
        };
        return result;
    }

}
