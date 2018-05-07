/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiduciaryadvisor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Todd
 */
public class FiduciaryAdvisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int selection = 0;
        int investment = 0;
        int duration = 0;
        int risk = -1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Which query would you like to use?\n"
                + "1) Which strategy should I use to maximize my money in a certain amount of time?\n"
                + "2) Given a certain amount of money, how much could I make for each investment in 5, 10, and 15 years?\n"
                + "3) Select an investment strategy and input time and money to determine how much I would make.");
        System.out.println("Please enter a number from the above list of options:");

        selection = scan.nextInt();
        while (selection != 1 && selection != 2 && selection != 3) {
            System.out.println("That value is invalid, please enter 1, 2, or 3:");
            selection = scan.nextInt();
        }

        if (selection == 1) {
            System.out.println("How much money do you want to invest?");
            investment = scan.nextInt();

            System.out.println("How many years will you invest?");
            duration = scan.nextInt();

            System.out.println("Are you okay with risk? Use 0 for yes and 1 for no");
            risk = scan.nextInt();

            while (risk != 0 && risk != 1) {
                System.out.println("Invalid response. Please use 0 or 1");
                risk = scan.nextInt();
            }

            if (risk == 0) {
                float[] investmentReturns = new float[6];
                float maxValue = 0;

                Investment bond = new Bonds();
                float earnedBonds = bond.calculate(investment, duration);
                investmentReturns[0] = earnedBonds;

                Investment cd = new CD();
                float earnedCD = cd.calculate(investment, duration);
                investmentReturns[1] = earnedCD;

                Investment stocks = new Stocks();
                float earnedStock = stocks.calculate(investment, duration);
                investmentReturns[2] = earnedStock;

                Investment savings = new Savings();
                float earnedSavings = savings.calculate(investment, duration);
                investmentReturns[3] = earnedSavings;

                Investment checking = new Checking();
                float earnedChecking = checking.calculate(investment, duration);
                investmentReturns[4] = earnedChecking;

                Investment offshore = new Offshore();
                float earnedOffshore = offshore.calculate(investment, duration);
                investmentReturns[5] = earnedOffshore;

                for (int i = 0; i < investmentReturns.length; i++) {
                    if (investmentReturns[i] > maxValue) {
                        maxValue = investmentReturns[i];
                    }
                }

                System.out.println("The maximum value of your investment is: " + maxValue);
                if (maxValue == earnedBonds) {
                    System.out.println("Given your preferred strategy: you should invest in Bonds");
                }
                if (maxValue == earnedCD) {
                    System.out.println("Given your preferred strategy: you should invest in Certificates of Deposit");
                }
                if (maxValue == earnedStock) {
                    System.out.println("Given your preferred strategy: you should invest in Stocks");
                }
                if (maxValue == earnedSavings) {
                    System.out.println("Given your preferred strategy: you should invest in Saving Accounts");
                }
                if (maxValue == earnedChecking) {
                    System.out.println("Given your preferred strategy: you should invest in Checking Accounts");
                }
                if (maxValue == earnedOffshore) {
                    System.out.println("Given your preferred strategy: you should invest in Offshore Accounts");
                }
            } else {
                float[] investmentReturns = new float[4];
                float maxValue = 0;

                Investment bond = new Bonds();
                float earnedBonds = bond.calculate(investment, duration);
                investmentReturns[0] = earnedBonds;

                Investment cd = new CD();
                float earnedCD = cd.calculate(investment, duration);
                investmentReturns[1] = earnedCD;

                Investment savings = new Savings();
                float earnedSavings = savings.calculate(investment, duration);
                investmentReturns[2] = earnedSavings;

                Investment checking = new Checking();
                float earnedChecking = checking.calculate(investment, duration);
                investmentReturns[3] = earnedChecking;

                for (int i = 0; i < investmentReturns.length; i++) {
                    if (investmentReturns[i] > maxValue) {
                        maxValue = investmentReturns[i];
                    }
                }

                System.out.println("The maximum value of your investment is: " + maxValue);
                if (maxValue == earnedBonds) {
                    System.out.println("Given your preferred strategy: you should invest in Bonds");
                }
                if (maxValue == earnedCD) {
                    System.out.println("Given your preferred strategy: you should invest in Certificates of Deposit");
                }
                if (maxValue == earnedSavings) {
                    System.out.println("Given your preferred strategy: you should invest in Saving Accounts");
                }
                if (maxValue == earnedChecking) {
                    System.out.println("Given your preferred strategy: you should invest in Checking Accounts");
                }
            }
        }

        if (selection == 2) {
            System.out.println("How much money do you want to invest?");
            investment = scan.nextInt();

            Investment bond = new Bonds();
            float fiveYearBonds = bond.calculate(investment, 5);
            float tenYearBonds = bond.calculate(investment, 10);
            float fifteenYearBonds = bond.calculate(investment, 15);

            System.out.println("Bond Returns:");
            System.out.println("    Five Years: " + fiveYearBonds);
            System.out.println("    Ten Years: " + tenYearBonds);
            System.out.println("    Fifteen Years: " + fifteenYearBonds);

            Investment cd = new CD();
            float fiveYearCd = cd.calculate(investment, 5);
            float tenYearCd = cd.calculate(investment, 10);
            float fifteenYearCd = cd.calculate(investment, 15);

            System.out.println("CD Returns:");
            System.out.println("    Five Years: " + fiveYearCd);
            System.out.println("    Ten Years: " + tenYearCd);
            System.out.println("    Fifteen Years: " + fifteenYearCd);

            Investment stocks = new Stocks();
            float fiveYearStockFund = stocks.calculate(investment, 5);
            float tenYearStockFund = stocks.calculate(investment, 10);
            float fifteenYearStockFund = stocks.calculate(investment, 15);

            System.out.println("Stock Returns:");
            System.out.println("    Five Years: " + fiveYearStockFund);
            System.out.println("    Ten Years: " + tenYearStockFund);
            System.out.println("    Fifteen Years: " + fifteenYearStockFund);

            Investment savings = new Savings();
            float fiveYearSavingsFund = savings.calculate(investment, 5);
            float tenYearSavingsFund = savings.calculate(investment, 10);
            float fifteenYearSavingsFund = savings.calculate(investment, 15);

            System.out.println("Savings Returns:");
            System.out.println("    Five Years: " + fiveYearSavingsFund);
            System.out.println("    Ten Years: " + tenYearSavingsFund);
            System.out.println("    Fifteen Years: " + fifteenYearSavingsFund);

            Investment checking = new Checking();
            float fiveYearCheckingFund = checking.calculate(investment, 5);
            float tenYearCheckingFund = checking.calculate(investment, 10);
            float fifteenYearCheckingFund = checking.calculate(investment, 15);

            System.out.println("Checking Returns:");
            System.out.println("    Five Years: " + fiveYearCheckingFund);
            System.out.println("    Ten Years: " + tenYearCheckingFund);
            System.out.println("    Fifteen Years: " + fifteenYearCheckingFund);

            Investment offshore = new Offshore();
            float fiveYearOffshoreFund = offshore.calculate(investment, 5);
            float tenYearOffshoreFund = offshore.calculate(investment, 10);
            float fifteenYearOffshoreFund = offshore.calculate(investment, 15);

            System.out.println("Offshore Returns:");
            System.out.println("    Five Years: " + fiveYearOffshoreFund);
            System.out.println("    Ten Years: " + tenYearOffshoreFund);
            System.out.println("    Fifteen Years: " + fifteenYearOffshoreFund);

        }
        if (selection == 3) {
            int strategy = 0;

            System.out.println("Please pick an investent option:");
            System.out.println("    Press 0 for Bonds");
            System.out.println("    Press 1 for Certificate of Deposit");
            System.out.println("    Press 2 for Checking Accounts");
            System.out.println("    Press 3 for Offshore Accounts");
            System.out.println("    Press 4 for Savings Accounts");
            System.out.println("    Press 5 for Stock Fund");
            strategy = scan.nextInt();

            System.out.println("How much capital would you like to invest?");
            investment = scan.nextInt();

            System.out.println("How many years would you like to invest?");
            duration = scan.nextInt();

            if (strategy == 0) {
                Investment bond = new Bonds();
                float result = bond.calculate(investment, duration);
                System.out.println("Investing in bonds will increase the investment too: " + result);
            }
            if (strategy == 1) {
                Investment cd = new CD();
                float result = cd.calculate(investment, duration);
                System.out.println("Investing in a Certificate of Deposit will increase the investment too: " + result);
            }
            if (strategy == 2) {
                Investment checking = new Checking();
                float result = checking.calculate(investment, duration);
                System.out.println("Investing in a checking account will increase the investment too: " + result);
            }
            if (strategy == 3) {
                Investment offshore = new Offshore();
                float result = offshore.calculate(investment, duration);
                System.out.println("Investing in an offshore account will increase the investment too: " + result);
            }
            if (strategy == 4) {
                Investment savings = new Savings();
                float result = savings.calculate(investment, duration);
                System.out.println("Investing in a savings account will increase the investment too: " + result);           
            }
            if (strategy == 5) {
                Investment stocks = new Stocks();
                float result = stocks.calculate(investment, duration);
                System.out.println("Investing in a Stock Fund will increase the investment too: " + result);                
            }
        }
    }
}
