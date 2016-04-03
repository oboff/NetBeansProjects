/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.util.Random;
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
public class SquareTest {

    public SquareTest() {
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
     * Test of isSquare method, of class Square.
     */
    @Test
    public void testIsSquare() {
        assertEquals("negative numbers aren't square numbers", false, Square.isSquare(-1));
        assertEquals("3 isn't a square number", false, Square.isSquare(3));
        assertEquals("4 is a square number", true, Square.isSquare(4));
        assertEquals("25 is a square number", true, Square.isSquare(25));
        assertEquals("26 isn't a square number", false, Square.isSquare(26));
    }

    /**
     * Test of isSquare2 method, of class Square.
     */
    @Test
    public void testIsSquare2() {
        assertEquals("negative numbers aren't square numbers", false, Square.isSquare(-1));
        assertEquals("3 isn't a square number", false, Square.isSquare(3));
        assertEquals("4 is a square number", true, Square.isSquare(4));
        assertEquals("25 is a square number", true, Square.isSquare(25));
        assertEquals("26 isn't a square number", false, Square.isSquare(26));
    }
}
