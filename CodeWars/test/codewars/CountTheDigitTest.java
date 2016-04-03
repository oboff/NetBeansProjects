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
public class CountTheDigitTest {
    
    public CountTheDigitTest() {
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
     * Test of nbDig method, of class CountTheDigit.
     */
    @Test
    public void testNbDig() {
        System.out.println("Fixed Tests nbDig");
        assertEquals(CountTheDigit.nbDig(5750, 0), 4700);
        assertEquals(CountTheDigit.nbDig(11011, 2), 9481);
        assertEquals(CountTheDigit.nbDig(12224, 8), 7733);
        assertEquals(CountTheDigit.nbDig(11549, 1), 11905);
    }

    /**
     * Test of nbDig2 method, of class CountTheDigit.
     */
    @Test
    public void testNbDig2() {
        System.out.println("Fixed Tests nbDig");
        assertEquals(CountTheDigit.nbDig(5750, 0), 4700);
        assertEquals(CountTheDigit.nbDig(11011, 2), 9481);
        assertEquals(CountTheDigit.nbDig(12224, 8), 7733);
        assertEquals(CountTheDigit.nbDig(11549, 1), 11905);
    }
    
}
