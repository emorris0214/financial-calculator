package com.pluralsight;
import java.util.Scanner;

public class FinancialCalculators {
    public static void main(String[] args) {
        // calling scanner
        Scanner keyboard = new Scanner(System.in);

        // introduction and call for input
        System.out.println("Welcome to E's Calc-ies!");
        System.out.print("Which calculator would you like to use? (1, 2, or 3) ");
        int calc = keyboard.nextInt();

        // printing a statement when app is given an option
        if (calc == 1){
            System.out.println("Thanks for using our Mortgage Calculator");
        } else if (calc == 2){
            System.out.println("Thanks for using our CD Future Worth Calculator");
        } else if (calc == 3){
            System.out.println("Thanks for using our Present Value Annuity Calculator");
        } else {
            System.out.println("The option you've chosen is invalid. Restart application.");
        }
        System.out.println("What is your ...");



    }
}

