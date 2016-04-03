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
public class PaginationHelperTest {
    
    public PaginationHelperTest() {
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
     * Test of itemCount method, of class PaginationHelper.
     */
    @Test
    public void testItemCount() {
        System.out.println("itemCount");
        PaginationHelper instance = null;
        int expResult = 0;
        int result = instance.itemCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pageCount method, of class PaginationHelper.
     */
    @Test
    public void testPageCount() {
        System.out.println("pageCount");
        PaginationHelper instance = null;
        int expResult = 0;
        int result = instance.pageCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pageItemCount method, of class PaginationHelper.
     */
    @Test
    public void testPageItemCount() {
        System.out.println("pageItemCount");
        int pageIndex = 0;
        PaginationHelper instance = null;
        int expResult = 0;
        int result = instance.pageItemCount(pageIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pageIndex method, of class PaginationHelper.
     */
    @Test
    public void testPageIndex() {
        System.out.println("pageIndex");
        int itemIndex = 0;
        PaginationHelper instance = null;
        int expResult = 0;
        int result = instance.pageIndex(itemIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
