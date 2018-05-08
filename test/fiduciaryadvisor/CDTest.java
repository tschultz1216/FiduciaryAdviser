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
public class CDTest {
    
    public CDTest() {
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
     * Test of calculate method, of class CD.
     * Between 1 and 3 years
     */
    @Test
    public void testCalculate_between1and3Years() {
        System.out.println("calculate_between1and3Years");
        float money = 50000F;
        int years = 2;
        CD instance = new CD();
        float expResult = 52001.78F;
        float result = instance.calculate(money, years);
        assertEquals(expResult, result, 0.0001);
    }
    
    /**
     * Test of calculate method, of class CD.
     * Between 3 and 5 years
     */
    @Test
    public void testCalculate_between3and5Years() {
        System.out.println("calculate_between3and5Years");
        float money = 2500F;
        int years = 3;
        CD instance = new CD();
        float expResult = 2662.38183F;
        float result = instance.calculate(money, years);
        assertEquals(expResult, result, 0.0001);
    }
    
    /**
     * Test of calculate method, of class CD.
     * Above 5 years
     */
    @Test
    public void testCalculate_Above5Years() {
        System.out.println("calculate_above5Years");
        float money = 45000F;
        int years = 6;
        CD instance = new CD();
        float expResult = 52298.4387252F;
        float result = instance.calculate(money, years);
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of getRisk method, of class CD.
     */
    @Test
    public void testGetRisk() {
        System.out.println("getRisk");
        CD instance = new CD();
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
        float gains = 37951F;
        Stocks instance = new Stocks();
        float expResult = 28463.25F;
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
        float gains = 191650F;
        Stocks instance = new Stocks();
        float expResult = 137988F;
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
