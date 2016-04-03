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
public class NumberToReverseArrayTest {
    
    public NumberToReverseArrayTest() {
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
     * Test of digitize method, of class NumberToReverseArray.
     */
    @Test
    public void testDigitize() {
        System.out.println("digitize");
        long n = 0L;
        int[] expResult = null;
        int[] result = NumberToReverseArray.digitize(n);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of digitize2 method, of class NumberToReverseArray.
     */
    @Test
    public void testDigitize2() {
        System.out.println("digitize2");
        long n = 0L;
        int[] expResult = null;
        int[] result = NumberToReverseArray.digitize2(n);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
