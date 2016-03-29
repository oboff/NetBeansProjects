/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oboff
 */
public class VectorsTest {
    
    public VectorsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of equal method, of class Vectors.
     */
    @Test
    public void testEqual() {
        System.out.println("equal");
        assertTrue(Vectors.equal(new int[]{0}, new int[]{0}));
    }

    /**
     * Test of scalarMultiplication method, of class Vectors.
     */
    @Test
    public void testScalarMultiplication() {
        System.out.println("scalarMultiplication");
        //assertEquals(0, Vectors.scalarMultiplication(new int[]{0, 0}, new int[]{0, 0}));
        //assertEquals(1, Vectors.scalarMultiplication(new int[]{0, 0}, new int[]{0, 0}));
        int[] a = new int[] {1,1};
        int[] b = new int[] {1,1};
        int expResult = 0;
        int result = Vectors.scalarMultiplication(a, b);
        assertEquals(expResult, result);
    }
    
}
