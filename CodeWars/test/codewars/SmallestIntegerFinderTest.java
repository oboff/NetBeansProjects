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
public class SmallestIntegerFinderTest {
    
    public SmallestIntegerFinderTest() {
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
     * Test of findSmallestInt method, of class SmallestIntegerFinder.
     */
    @Test
    public void testFindSmallestInt() {
        System.out.println("findSmallestInt");
        assertEquals(0, SmallestIntegerFinder.findSmallestInt(new int[]{1,2,0,3}));
        assertEquals(-3, SmallestIntegerFinder.findSmallestInt(new int[]{-1, -2, 0, -3}));
        assertEquals(-2, SmallestIntegerFinder.findSmallestInt(new int[]{1, -2, 0, 3}));
    }

    /**
     * Test of findSmallestInt2 method, of class SmallestIntegerFinder.
     */
    @Test
    public void testFindSmallestInt2() {
        System.out.println("findSmallestInt2");
        assertEquals(0, SmallestIntegerFinder.findSmallestInt2(new int[]{1, 2, 0, 3}));
        assertEquals(-3, SmallestIntegerFinder.findSmallestInt2(new int[]{-1, -2, 0, -3}));
        assertEquals(-2, SmallestIntegerFinder.findSmallestInt2(new int[]{1, -2, 0, 3}));
    }
    
}
