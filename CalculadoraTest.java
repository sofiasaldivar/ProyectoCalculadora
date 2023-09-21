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
 * Clase de prueba para "Calculadora"  para asegurar su correcta funcionalidad.
 * @author <pre> Natalia Islas,
 * Daniela Pacheco, 
 * Sofía Saldívar 
 * y Sofía Zavala 
 * </pre>
 * 
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Prueba del método testSignoNumParentesis
     */
    @Test
    public void testSignoNumParentesis() {
        System.out.println("signoNumParentesis");
        char car = '(';
        int expResult = 2;
        int result = Calculadora.signoNumParentesis(car);
        assertEquals(expResult, result);
    }

    /**
     * Prueba del método "testSintaxis".
     */
    @Test
    public void testSintaxis() {
        System.out.println("sintaxis");
        String dato = "+7-8";
        boolean expResult = false;
        boolean result = Calculadora.sintaxis(dato);
        assertEquals(expResult, result);
    }
    
    

    
}
