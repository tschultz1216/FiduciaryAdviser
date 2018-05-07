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
    private double interestRate = .01;

    @Override
    public float calculate(int money, int years) {
        double dMoney = money;
        for (int i = 0; i < years; i++) {
            dMoney += dMoney * interestRate;
        }
        return (float) dMoney;
    }

    @Override
    public boolean getRisk() {
        return this.risk;
    }
}
