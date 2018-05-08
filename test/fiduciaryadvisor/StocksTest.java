package fiduciaryadvisor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Leng Ghuy, Deborah Lawrence, Todd Schultz
 * @class CSCI-338 Software Engineering 
 * @assignment Team Project - FiduciaryInvestmentAdviser
 * @date May 8th, 2018
 */
public class StocksTest {
    
    public StocksTest() {
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
     * Test of calculate method, of class Stocks.
     * Above 15 years
     */
    @Test
    public void testCalculate_above15Years() {
        System.out.println("calculate_below15Years");
        float money = 5000F;
        int years = 19;
        Stocks instance = new Stocks();
        float expResult = 5000F;
        float result = instance.calculate(money, years);
        assertEquals(expResult, result, 0.0001);
    }
    
    /**
     * Test of calculate method, of class Stocks.
     * Below 12 years
     */
    @Test
    public void testCalculate_below12Years() {
        System.out.println("calculate_below12Years");
        float money = 5000F;
        int years = 10;
        Stocks instance = new Stocks();
        float expResult = 5180F;
        float result = instance.calculate(money, years);
        assertEquals(expResult, result, 0.0001);
    }
    
    /**
     * Test of calculate method, of class Stocks.
     * Below 15 years but above 12
     */
    @Test
    public void testCalculate_between12and15Years() {
        System.out.println("calculate_between12and15Years");
        float money = 5000F;
        int years = 15;
        Stocks instance = new Stocks();
        float expResult = 5586.332F;
        float result = instance.calculate(money, years);
        assertEquals(expResult, result, 0.0001);
    }
    
    /**
     * Test of calculate method, of class Stocks.
     * A case of negative gain
     */
    @Test
    public void testCalculate_negativeGain() {
        System.out.println("calculate_negativeGain");
        float money = 5000F;
        int years = 4;
        Stocks instance = new Stocks();
        float expResult = 4668.52F;
        float result = instance.calculate(money, years);
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of getRisk method, of class Stocks.
     */
    @Test
    public void testGetRisk() {
        System.out.println("getRisk");
        Stocks instance = new Stocks();
        boolean expResult = true;
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
        float gains = 100.00F;
        Stocks instance = new Stocks();
        float expResult = 90.00F;
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
        float gains = 10000F;
        Stocks instance = new Stocks();
        float expResult = 8500F;
        float result = instance.capGains(gains);
        assertEquals(expResult, result, 0.0001);
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
        float gains = 418400.30F;
        Stocks instance = new Stocks();
        float expResult = 252713.7812F;
        float result = instance.capGains(gains);
        assertEquals(expResult, result, 0.0001);
    }

}
