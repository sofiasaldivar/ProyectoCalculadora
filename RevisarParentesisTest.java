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
 * @author sofiasaldivar
 */
public class RevisarParentesisTest {
    
    public RevisarParentesisTest() {
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
     * Test of revisaCad method, of class RevisarParentesis.
     */
    @Test
    public void testRevisaCad() {
        System.out.println("revisaCad");
        String cad = "(8+9)(9+8-5*6)";
        boolean expResult = true;
        boolean result = RevisarParentesis.revisaCad(cad);
        assertEquals(expResult, result);
    }
    
}
