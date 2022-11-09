/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.curso.vending;

import java.util.ArrayList;
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
public class VendingMachineIT {

    public VendingMachineIT() {
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
     * Test of addProduct method, of class VendingMachine.
     */
    @Test
    public void testAddProduct() {
        System.out.println("addProduct");
        Product product = new Product(1, "MeatDog", 2);
        VendingMachine instance = new VendingMachine();
        instance.addProduct(product);
        ArrayList<Product> products = new ArrayList();
        products.add(product);
        Product expResult = products.get(0);
        Product result = instance.getProductIndex(0);
        assertEquals(expResult, result);
    }

    /**
     * Test of getProductIndex method, of class VendingMachine.
     */
    @Test
    public void testGetProductIndex() {
        System.out.println("getProductIndex");
        int n = 0;
        VendingMachine instance = new VendingMachine();
        Product expResult = new Product(1, "MeatDog", 2);

        instance.addProduct(expResult);

        Product result = instance.getProductIndex(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of generateProducts method, of class VendingMachine.
     */
    @Test
    public void testGenerateProducts() {
        System.out.println("generateProducts");
        VendingMachine instance = new VendingMachine();
        instance.generateProducts();
        int expResult = 4;
        int result = instance.getProduct().size();
        assertEquals(expResult, result);
    }

}
