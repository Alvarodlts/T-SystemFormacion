/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author alvdelat
 */
public class Rectangle extends Shapes {
    
    public Rectangle(int wide, int height) {
        super(wide, height);
    }
    
    @Override
    public double area() {
       area = height * wide;
       return area;
    }
}
