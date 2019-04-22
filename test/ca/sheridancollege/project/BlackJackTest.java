/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shiva
 */
public class BlackJackTest {
    
    public BlackJackTest() {
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
     * Test of main method, of class BlackJack.
     */
    @Test
    public void testValidateDealerHandGood() {
        System.out.println("validateDealerHandGood");
        int hand = 21;
        handValidator instance = new handValidator();
        boolean expResult = true;
        boolean result = instance.validateDealerHand(hand);
        assertEquals(expResult, result);
     }
   
   
    
    @Test
    public void testValidateDealerHandBad() {
        System.out.println("validateDealerHandBad");
        int hand = 12;
        handValidator instance = new handValidator();
        boolean expResult = false;
        boolean result = instance.validateDealerHand(hand);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testValidateDealerHandBoundary() {
        System.out.println("validateDealerHandBoundary");
        int hand = 16;
        handValidator instance = new handValidator();
        boolean expResult = true;
        boolean result = instance.validateDealerHand(hand);
        assertEquals(expResult, result);
      
    }
    
}
