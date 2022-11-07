/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author alvdelat
 */
public class Circle extends Shapes{
    public Circle(int wide, int height) {
        super(wide, height);
    }
    
    @Override
    public double area() {
       area =  (Math.PI * wide/2 * wide/2);
       return area;
    }    
}
