/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.curso.vending;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alvdelat
 */
public class ProductIT {
    
    public ProductIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getQuanty method, of class Product.
     */
    @Test
    public void testGetQuanty() {
        System.out.println("getQuanty");
        Product instance = new Product(2, "", 2);
        int expResult = 2;
        int result = instance.getQuanty();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuanty method, of class Product.
     */
    @Test
    public void testSetQuanty() {
        System.out.println("setQuanty");
        int quanty = 3;
        Product instance = new Product(2, "", 2);
        instance.setQuanty(quanty);
        int expResult = 3;
        int result = instance.getQuanty();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrice method, of class Product.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Product instance = new Product(2.0, "", 2);
        double expResult = 2.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getName method, of class Product.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Product instance = new Product(2, "MeatDog", 2);
        String expResult = "MeatDog";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

}
