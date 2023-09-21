/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * Clase de prueba para "MétodosIniciales" para asegurar su correcta funcionalidad.
 * @author <pre> Natalia Islas,
 * Daniela Pacheco, 
 * Sofía Saldívar 
 * y Sofía Zavala 
 * </pre>
 * 
 */
public class MetodosInicialesTest {
    
    public MetodosInicialesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of signoPrioridad method, of class MetodosIniciales.
     */
    @Test
    public void testSignoPrioridad() {
        System.out.println("signoPrioridad");
        char operador = '$';
        int expResult = 1;
        int result = MetodosIniciales.signoPrioridad(operador);
        assertEquals(expResult, result);
    }

    /**
     * Test of queSignoPrioridad method, of class MetodosIniciales.
     */
    @Test
    public void testQueSignoPrioridad() {
        System.out.println("queSignoPrioridad");
        char car1 = '$';
        char car2 = '/';
        int expResult = 1;
        int result = MetodosIniciales.queSignoPrioridad(car1, car2);
        assertEquals(expResult, result);
    }

    /**
     * Test of signoONum method, of class MetodosIniciales.
     */
    @Test
    public void testSignoONum() {
        System.out.println("signoONum");
        char car = '*';
        int expResult = 0;
        int result = MetodosIniciales.signoONum(car);
        assertEquals(expResult, result);
    }

    /**
     * Test of signoONumNeg method, of class MetodosIniciales.
     */
    @Test
    public void testSignoONumNeg() {
        System.out.println("signoONumNeg");
        char car = '_';
        int expResult = 1;
        int result = MetodosIniciales.signoONumNeg(car);
        assertEquals(expResult, result);
    }
    
}
