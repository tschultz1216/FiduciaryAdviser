
package fiduciaryadvisor;

/**
 *
 * @author Todd
 */
public class CD implements Investment {

    private boolean risk = false;
    private float interestRate;
    private final int LEVELONE = 9325;
    private final int LEVELTWO = 37950;
    private final int LEVELTHREE = 91900;
    private final int LEVELFOUR = 191650;
    private final int LEVELFIVE = 416700;
    private final int LEVELSIX = 418400;

    @Override
    public float calculate(float money, int years) {
        if (years < 1) {
            return money;
        }
        if (years >= 1 && years < 3) {
            interestRate = .022f;
        }
        if (years >= 3 && years < 5) {
            interestRate = .0235f;
        }
        if (years >= 5) {
            interestRate = .028f;
        }
        float gain = 0.00f;
        for (int i = 0; i < years; i++) {
            gain += (money+gain) * interestRate;//certificate of deposits are compounded
        }
        return (money + capGains(gain));
    }

    @Override
    public boolean getRisk() {
        return this.risk;
    }

    public float capGains(float gains) {
        float retVal = gains;
        if (gains <= LEVELONE) {
            retVal = (float) (gains - (gains * .1));
        } else if (gains > LEVELONE && gains <= LEVELTWO) {
            retVal = (float) (gains - (gains * .15));
        } else if (gains > LEVELTWO && gains <= LEVELTHREE) {
            retVal = (float) (gains - (gains * .25));
        } else if (gains > LEVELTHREE && gains <= LEVELFOUR) {
            retVal = (float) (gains - (gains * .28));
        } else if (gains > LEVELFOUR && gains <= LEVELFIVE) {
            retVal = (float) (gains - (gains * .33));
        } else if (gains > LEVELFIVE && gains <= LEVELSIX) {
            retVal = (float) (gains - (gains * .35));
        } else if (gains > LEVELSIX) {
            retVal = (float) (gains - (gains * .396));
        }
        return retVal;
    }
    
    @Override
    public String toString() {
        return "-Certificate of Deposit-";
    }

}
