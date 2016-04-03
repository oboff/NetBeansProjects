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
public class CalculateRotationTest {

    public CalculateRotationTest() {
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
     * Test of shiftedDiff method, of class CalculateRotation.
     */
    @Test
    public void testShiftedDiff() {
        assertEquals(-1, CalculateRotation.shiftedDiff("hoop", "pooh"));
        assertEquals(2, CalculateRotation.shiftedDiff("coffee", "eecoff"));
        assertEquals(4, CalculateRotation.shiftedDiff("eecoff", "coffee"));
    }

}
