/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiduciaryadvisor;

/**
 *
 * @author Todd
 */
public class Offshore implements Investment {

    private boolean risk = true;
    private final float interestRate = .01f;

    @Override
    public float calculate(float money, int years) {
        float gain = 0.00f;
        
        for (int i = 0; i < years; i++) {
            gain += (money+gain) * interestRate;
        }
        return (money + gain);
    }

    @Override
    public boolean getRisk() {
        return this.risk;
    }
    
    @Override
    public String toString() {
        return "-Offshore Account-";
    }
}
