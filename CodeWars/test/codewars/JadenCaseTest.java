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
public class JadenCaseTest {
    
    public JadenCaseTest() {
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
     * Test of toJadenCase method, of class JadenCase.
     */
    @Test
    public void testToJadenCase() {
    }
    
    @Test
    public void test() {
        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", JadenCase.toJadenCase("most trees are blue"), "Most Trees Are Blue");
    }

    @Test
    public void testNullArg() {
        assertNull("Must return null when the arg is null", JadenCase.toJadenCase(null));
    }

    @Test
    public void testEmptyArg() {
        assertNull("Must return null when the arg is null", JadenCase.toJadenCase(""));
    }

    /**
     * Test of toJadenCase2 method, of class JadenCase.
     */
    @Test
    public void testToJadenCase2() {
        System.out.println("toJadenCase2");
        String phrase = "";
        JadenCase instance = new JadenCase();
        String expResult = "";
        String result = instance.toJadenCase2(phrase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
