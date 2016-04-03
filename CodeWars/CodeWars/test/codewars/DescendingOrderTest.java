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
public class DescendingOrderTest {

    public DescendingOrderTest() {
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
     * Test of sortDesc method, of class DescendingOrder.
     */
    @Test
    public void testSortDesc() {

        assertEquals(0, DescendingOrder.sortDesc(0));

        assertEquals(51, DescendingOrder.sortDesc(15));

        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }

    /**
     * Test of sortDesc2 method, of class DescendingOrder.
     */
    @Test
    public void testSortDesc2() {
        assertEquals(0, DescendingOrder.sortDesc2(0));

        assertEquals(51, DescendingOrder.sortDesc2(15));

        assertEquals(987654321, DescendingOrder.sortDesc2(123456789));
    }

}
