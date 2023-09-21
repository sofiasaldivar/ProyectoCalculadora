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
 * Clase de prueba para "PostFij" para asegurar su correcta funcionalidad.
 * @author <pre> Natalia Islas,
 * Daniela Pacheco, 
 * Sofía Saldívar 
 * y Sofía Zavala 
 * </pre>
 * 
 */
public class PostFijTest {
    
    public PostFijTest() {
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
     * Prueba del método prioridadSigno.
     */
    @Test
    public void testPrioridadSigno() {
        System.out.println("prioridadSigno");
        char operator = '$';
        int expResult = 1;
        int result = PostFij.prioridadSigno(operator);
        assertEquals(expResult, result);
        
    }

    /**
     * Prueba del método esOperador.
     */
    @Test
    public void testEsOperador() {
        System.out.println("esOperador");
        char character = '+';
        boolean expResult = true;
        boolean result = PostFij.esOperador(character);
        assertEquals(expResult, result);
 
    }

    /**
     * Prueba del método esNumero method.
     */
    @Test
    public void testEsNumero() {
        System.out.println("esNumero");
        char character = '-';
        boolean expResult = false;
        boolean result = PostFij.esNumero(character);
        assertEquals(expResult, result);

    }

    /**
     * Prueba del método postFija.
     */
    @Test
    public void testPostFija() {
        System.out.println("postFija");
        String cadena = "8 + 7";
        String expResult = "8 7 + ";
        String result = PostFij.postFija(cadena);
        assertEquals(expResult, result);

    }
    
}
