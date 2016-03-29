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
public class CreatePhoneNumberTest {
    
    public CreatePhoneNumberTest() {
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
     * Test of createPhoneNumber method, of class CreatePhoneNumber.
     */
    @Test
    public void testCreatePhoneNumber() {
        assertEquals("(123) 456-7890", CreatePhoneNumber.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    /**
     * Test of createPhoneNumber2 method, of class CreatePhoneNumber.
     */
    @Test
    public void testCreatePhoneNumber2() {
        assertEquals("(123) 456-7890", CreatePhoneNumber.createPhoneNumber2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
    
}
