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
public class VowelCountTest {
    
    public VowelCountTest() {
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
     * Test of getCount method, of class VowelCount.
     */
    @Test
    public void testGetCount() {
        assertEquals("Nope!", 5, VowelCount.getCount("abracadabra"));
    }

    /**
     * Test of getCount2 method, of class VowelCount.
     */
    @Test
    public void testGetCount2() {
        System.out.println("getCount2");
        String str = "";
        int expResult = 0;
        int result = VowelCount.getCount2(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
