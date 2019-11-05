/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tescik;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author defrag
 */
public class TescikTest {
    
    public TescikTest() {
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

    @Test
    public void testVersion() {
	final boolean JAVA_7_OR_EARLIER = System.getProperty("java.specification.version").compareTo("1.8") < 0;
	System.out.println(System.getProperty("java.specification.version"));
	//assertTrue(JAVA_7_OR_EARLIER);
    }

    /**
     * Test of main method, of class Tescik.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
      //  Tescik.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Wygenerowano perfidny błąd!");
    }
    
}
