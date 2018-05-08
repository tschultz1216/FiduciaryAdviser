package fiduciaryadvisor;

/**
 *
 * @author Todd
 */
public interface Investment {
    
    public float calculate(float money, int years);
    public boolean getRisk();
    
}
