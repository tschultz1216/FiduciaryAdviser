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
            System.out.println("That value is invalid, please enter 1, 2, or 3: ");
            selection = scan.nextInt();
        }

        FiduciaryInvestmentAdviser adviser = new FiduciaryInvestmentAdviser();
        adviser.selectQuery(selection);
    }
}
