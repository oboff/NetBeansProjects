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
public class DubstepTest {
    
    public DubstepTest() {
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
     * Test of SongDecoder method, of class Dubstep.
     */
    @Test
    public void testSongDecoder() {
        assertEquals("ABC", new Dubstep().SongDecoder("WUBWUBABCWUB"));
        assertEquals("R L", new Dubstep().SongDecoder("RWUBWUBWUBLWUB"));
    }

    /**
     * Test of SongDecoder2 method, of class Dubstep.
     */
    @Test
    public void testSongDecoder2() {
        assertEquals("ABC", new Dubstep().SongDecoder2("WUBWUBABCWUB"));
        assertEquals("R L", new Dubstep().SongDecoder2("RWUBWUBWUBLWUB"));
    }
    
}
