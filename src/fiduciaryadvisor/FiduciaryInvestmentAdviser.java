/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiduciaryadvisor;

import java.util.Scanner;

/**
 *
 * @author Todd
 */
public class FiduciaryInvestmentAdviser extends InvestmentAdviser {

    private final Investment[] allInvestmentStrategies = {
        new Bonds(),
        new CD(),
        new Checking(),
        new Offshore(),
        new Savings(),
        new Stocks()};
    private final Investment[] nonRiskyInvestmentStrategies = {
        new Bonds(),
        new CD(),
        new Checking(),
        new Savings()};
    private final Scanner scan;

    public FiduciaryInvestmentAdviser() {
        scan = new Scanner(System.in);
    }

    @Override
    public void selectQuery(int option) {
        float investment;
        int years;
        int risk;
        
        if (option == 1) {
            System.out.println("How much money do you want to invest?");
            investment = scan.nextFloat();

            System.out.println("How many years will you invest? (Please enter in whole years - Must be greater than one year)");
            years = scan.nextInt();
            while(years <= 1) {
                System.out.println("Duration must be greater than one year. Please try again");
                years = scan.nextInt();
            }

            System.out.println("Are you okay with risk? Use 0 for no and 1 for yes");
            risk = scan.nextInt();
            while (risk != 0 && risk != 1) {
                System.out.println("Invalid response. Please use 0 or 1");
                risk = scan.nextInt();
            }

            moneyMax(investment, years, risk);
            
        } else if (option == 2) {
            System.out.println("How much money do you want to invest?");
            investment = scan.nextFloat();
            
            compareInvestments(investment);
            
        } else {
            System.out.println("Please pick an investent option:");
            System.out.println("    Press 0 for Bonds");
            System.out.println("    Press 1 for Certificate of Deposit");
            System.out.println("    Press 2 for Checking Accounts");
            System.out.println("    Press 3 for Offshore Accounts*");
            System.out.println("    Press 4 for Savings Accounts");
            System.out.println("    Press 5 for Stock Fund*");
            System.out.println("*-risky investments");
            int strategy = scan.nextInt();
            
            System.out.println("How much money do you want to invest?");
            investment = scan.nextFloat();

            System.out.println("How many years will you invest? (Please enter in whole years - Must be greater than one year)");
            years = scan.nextInt();
            while(years <= 1) {
                System.out.println("Duration must be greater than one year. Please try again");
                years = scan.nextInt();
            }

            calculateGain(investment, years, allInvestmentStrategies[strategy]);
        }
    }

    private void moneyMax(float money, int years, int risk) {
        float maxValue = 0.00f;
        float value;
        Investment maxInvestmentStrategy = null;

        if (risk == 0) {
            for (int i = 0; i < nonRiskyInvestmentStrategies.length; i++) {
                value = nonRiskyInvestmentStrategies[i].calculate(money, years);
                if (value > maxValue) {
                    maxValue = value;
                    maxInvestmentStrategy = nonRiskyInvestmentStrategies[i];
                }
            }
            System.out.printf("The maximum return of your investment in %d years is: $%1.2f" 
                    + "\nIf you invest in: %s", years, maxValue, maxInvestmentStrategy.toString());
        } 
        if (risk == 1) {
            for (int i = 0; i < allInvestmentStrategies.length; i++) {
                value = allInvestmentStrategies[i].calculate(money, years);
                if (value > maxValue) {
                    maxValue = value;
                    maxInvestmentStrategy = allInvestmentStrategies[i];
                }
            }
            if(maxInvestmentStrategy.getRisk()) System.out.println("**Risky Investment**");
            System.out.printf("The maximum return of your investment in %d years is: $%1.2f"
                    + "\nIf you invest in: %s", years, maxValue, maxInvestmentStrategy.toString());
        }
    }

    private void compareInvestments(float money) {
        Investment investment;
        System.out.println("*-risky investments");
        for (int i = 0; i<allInvestmentStrategies.length; i++) {
            investment = allInvestmentStrategies[i];
            if(investment.getRisk()) System.out.print("*");
            System.out.println(investment.toString() + " Returns:");
            System.out.printf("    Five Years: $%1.2f\n", investment.calculate(money,5));
            System.out.printf("    Ten Years: $%1.2f\n", investment.calculate(money, 10));
            System.out.printf("    Fifteen Years: $%1.2f\n", investment.calculate(money, 15));
        }
    }

    private void calculateGain(float money, int years, Investment investment) {
        float value = investment.calculate(money, years);
        System.out.printf("Investing in %s for %d years will have a return value of: $%1.2f",
                investment.toString(), years, value);
    }

}
