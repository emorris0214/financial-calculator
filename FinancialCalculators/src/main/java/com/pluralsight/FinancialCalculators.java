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
            System.out.print("What is your mortgage loan principal? Enter it here: ");
            double principal = keyboard.nextDouble(); // P
            System.out.print("What is your interest rate? Enter it here: ");
            double interest_Rate = keyboard.nextDouble() / 100; // math makes it decimal (Float) R
            System.out.print("Finally, what is your loan length? Enter it here in months: ");
            double loanLength = keyboard.nextDouble() / 12; // y
            double numOfPayN = 12 * loanLength; // n (Number of monthly payments)
            double i = interest_Rate / 12;
            double monthlyPay = principal * (i * Math.pow(1+i, numOfPayN) / (Math.pow(1+i, numOfPayN)-1));
            double totalInterest = (monthlyPay * numOfPayN) - principal;

            // We Need: expected monthly payment & total interest Paid
            // Formula: M=P×(i*(1+i)^n / ((1+i)^n)-1) | Principal x Interest Rate of Loan = total of the loan | TotalLoan / NumOfMonths
            // Our i var would be (Let's go with months)
            // i = interest_Rate / 12;

            System.out.printf("Your expected monthly payment is: %.2f%n", monthlyPay);
            System.out.printf("Your total interest paid is: %.2f%n", totalInterest);


        } else if (calc == 2){

            System.out.println("Thanks for using our CD Future Worth Calculator.");
            System.out.print("Enter your one-time deposit: ");
            double P = keyboard.nextDouble();
            System.out.print("Enter your interest rate: ");
            double interestRate = keyboard.nextDouble();
            double r = interestRate / 100;
            System.out.print("Enter the number of Years: ");
            int numOfYrs = keyboard.nextInt();

            double futureValue = P * Math.pow(1 + ((r / 365)), (365 * numOfYrs));
            double totalInterest = futureValue - P;

            System.out.printf("The future value of this CD is: $%.2f ", futureValue);
            System.out.printf("The total interest on the CD is: $%.2f ", totalInterest);



        } else if (calc == 3){
            System.out.println("Thanks for using our Present Value Annuity Calculator.");
        } else {
            System.out.println("The option you've chosen is invalid. Restart application.");
        }



    }
}

