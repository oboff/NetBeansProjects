/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oboff
 */
public class FormatDecimalPlacesTest {
    
    public FormatDecimalPlacesTest() {
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
     * Test of TwoDecimalPlaces method, of class FormatDecimalPlaces.
     */
    @Test
    public void testTwoDecimalPlaces() {
        System.out.println("TwoDecimalPlaces");
        double number = 0.0;
        double expResult = 0.0;
        double result = FormatDecimalPlaces.TwoDecimalPlaces(number);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TwoDecimalPlaces2 method, of class FormatDecimalPlaces.
     */
    @Test
    public void testTwoDecimalPlaces2() {
        System.out.println("TwoDecimalPlaces2");
        double number = 0.0;
        double expResult = 0.0;
        double result = FormatDecimalPlaces.TwoDecimalPlaces2(number);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
