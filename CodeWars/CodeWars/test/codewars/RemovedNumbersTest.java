/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.util.ArrayList;
import java.util.List;
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
public class RemovedNumbersTest {

    public RemovedNumbersTest() {
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
     * Test of removNb method, of class RemovedNumbers.
     */
    @Test
    public void testRemovNb() {

    }

    @Test
    public void test12() {
        List<long[]> res = new ArrayList<long[]>();
        res.add(new long[]{15, 21});
        res.add(new long[]{21, 15});
        List<long[]> a = RemovedNumbers.removNb(26);
        assertArrayEquals(res.get(0), a.get(0));
        assertArrayEquals(res.get(1), a.get(1));
    }

    @Test
    public void test14() {
        List<long[]> res = new ArrayList<long[]>();
        List<long[]> a = RemovedNumbers.removNb(100);
        assertTrue(res.size() == a.size());
    }

}
