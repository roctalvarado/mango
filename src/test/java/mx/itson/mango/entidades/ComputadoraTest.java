/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.mango.entidades;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rocta
 */
public class ComputadoraTest {
    
    public ComputadoraTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
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
     * Test of descargarArchivo method, of class Computadora.
     */
    @Test
    public void testDescargarArchivo() {
        System.out.println("descargarArchivo");
        int cantidad = 500;
        Computadora pc = new Computadora("Asus", "Ninja2000", "Blanca", 128, 1024);
        int expResult = 524;
        int result = pc.descargarArchivo(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of ajustarMemoria method, of class Computadora.
     */
    @org.junit.jupiter.api.Test
    public void testAjustarMemoria() {
        System.out.println("ajustarMemoria");
        int cantidad = 500;
        Computadora pc = new Computadora("Asus", "Ninja2000", "Blanca", 128, 1024);
        int expResult = 524;
        int result = pc.ajustarMemoria(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
