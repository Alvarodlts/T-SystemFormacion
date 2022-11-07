/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author alvdelat
 */
public class Triangle extends Shapes{
    
    public Triangle(int wide, int height) {
        super(wide, height);
    }
    
    
    @Override
    public double area(){
        area = wide*height/2;
        return area;
    }
    
}
