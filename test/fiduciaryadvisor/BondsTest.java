/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiduciaryadvisor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leng
 */
public class BondsTest {
    
    public BondsTest() {
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
     * Test of calculate method, of class Bonds.
     * Greater Than Bond Length
     */
    @Test
    public void testCalculate_GreaterThanBondLength() {
        System.out.println("calculate_greaterThanBondLength");
        float money = 720000F;
        int years = 20;
        Bonds instance = new Bonds();
        float expResult = 1240200F;
        float result = instance.calculate(money, years);
        assertEquals(expResult, result, 0.0001);
    }
    
    /**
     * Test of calculate method, of class Bonds.
     * Less Than Bond Length
     */
    @Test
    public void testCalculate_LessThanBondLength() {
        System.out.println("calculate_lessThanBondLength");
        float money = 50000F;
        int years = 5;
        Bonds instance = new Bonds();
        float expResult = 9562.50F;
        float result = instance.calculate(money, years);
        assertEquals(expResult, result, 0.0001);
    }
    
    /**
     * Test of calculate method, of class Bonds.
     * Equal To Bond Length
     */
    @Test
    public void testCalculate_EqualToBondLength() {
        System.out.println("calculate_equalToBondLength");
        float money = 100000F;
        int years = 10;
        Bonds instance = new Bonds();
        float expResult = 138250F;
        float result = instance.calculate(money, years);
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of getRisk method, of class Bonds.
     */
    @Test
    public void testGetRisk() {
        System.out.println("getRisk");
        Bonds instance = new Bonds();
        boolean expResult = false;
        boolean result = instance.getRisk();
        assertEquals(expResult, result);
    }

    /**
     * Test of capGains method, of class Stocks.
     * Path Testing - Below LEVELONE
     */
    @Test
    public void testCapGains_belowLEVELONE() {
        System.out.println("capGains_belowLEVELONE");
        float gains = 9325F;
        Stocks instance = new Stocks();
        float expResult = 8392.50F;
        float result = instance.capGains(gains);
        assertEquals(expResult, result, 0.0001);
    }
    
    /**
     * Test of capGains method, of class Stocks.
     * Path Testing - Below LEVELTWO
     */
    @Test
    public void testCapGains_belowLEVETWO() {
        System.out.println("capGains_belowLEVELTWO");
        float gains = 37949F;
        Stocks instance = new Stocks();
        float expResult = 32256.65F;
        float result = instance.capGains(gains);
        assertEquals(expResult, result, 0.001);
    }
    
    /**
     * Test of capGains method, of class Stocks.
     * Path Testing - Below LEVELTHREE
     */
    @Test
    public void testCapGains_belowLEVELTHREE() {
        System.out.println("capGains_belowLEVELTHREE");
        float gains = 50000F;
        Stocks instance = new Stocks();
        float expResult = 37500F;
        float result = instance.capGains(gains);
        assertEquals(expResult, result, 0.0001);
    }
    
    /**
     * Test of capGains method, of class Stocks.
     * Path Testing - Below LEVELFOUR
     */
    @Test
    public void testCapGains_belowLEVELFOUR() {
        System.out.println("capGains_belowLEVELFOUR");
        float gains = 95000F;
        Stocks instance = new Stocks();
        float expResult = 68400F;
        float result = instance.capGains(gains);
        assertEquals(expResult, result, 0.0001);
    }
    
    /**
     * Test of capGains method, of class Stocks.
     * Path Testing - Below LEVELFIVE
     */
    @Test
    public void testCapGains_belowLEVELFIVE() {
        System.out.println("capGains_belowLEVELFIVE");
        float gains = 250000F;
        Stocks instance = new Stocks();
        float expResult = 167500F;
        float result = instance.capGains(gains);
        assertEquals(expResult, result, 0.0001);
    }
    
    /**
     * Test of capGains method, of class Stocks.
     * Path Testing - Below LEVELSIX
     */
    @Test
    public void testCapGains_belowLEVELSIX() {
        System.out.println("capGains_belowLEVELSIX");
        float gains = 417000F;
        Stocks instance = new Stocks();
        float expResult = 271050F;
        float result = instance.capGains(gains);
        assertEquals(expResult, result, 0.0001);
    }
    
    /**
     * Test of capGains method, of class Stocks.
     * Path Testing - Above LEVELSIX
     */
    @Test
    public void testCapGains_aboveLEVELSIX() {
        System.out.println("capGains_belowLEVELSIX");
        float gains = 500000F;
        Stocks instance = new Stocks();
        float expResult = 302000F;
        float result = instance.capGains(gains);
        assertEquals(expResult, result, 0.0001);
    }
    
}
