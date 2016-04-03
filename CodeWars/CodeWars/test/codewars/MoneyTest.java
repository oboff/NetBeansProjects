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
public class MoneyTest {
    
    public MoneyTest() {
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
     * Test of calculateYears method, of class Money.
     */
    @Test
    public void testCalculateYears() {
        System.out.println("Fixed Tests calculateYears");
        assertEquals(3, Money.calculateYears(1000, 0.05, 0.18, 1100));
        assertEquals(14, Money.calculateYears(1000, 0.01625, 0.18, 1200));
        assertEquals(0, Money.calculateYears(1000, 0.05, 0.18, 1000));
    }
    
}
