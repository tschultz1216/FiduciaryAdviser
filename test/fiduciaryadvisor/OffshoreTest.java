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
public class OffshoreTest {
    
    public OffshoreTest() {
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
     * Test of calculate method, of class Offshore.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        float money = 7000F;
        int years = 40;
        Offshore instance = new Offshore();
        float expResult = 10422.046875F;
        float result = instance.calculate(money, years);
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of getRisk method, of class Offshore.
     */
    @Test
    public void testGetRisk() {
        System.out.println("getRisk");
        Offshore instance = new Offshore();
        boolean expResult = true;
        boolean result = instance.getRisk();
        assertEquals(expResult, result);
    }
    
}
