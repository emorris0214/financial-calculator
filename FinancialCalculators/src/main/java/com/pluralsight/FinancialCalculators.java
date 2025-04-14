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
            System.out.printf("\nYour total interest paid is: %.2f%n", totalInterest);


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
            System.out.printf("\nThe total interest on the CD is: $%.2f ", totalInterest);

/*• Calculator 3: A calculator that determines the present value of an
ordinary annuity. (Note: this is difficult)
a. It would accept the monthly payout, expected interest rate,
and years to pay out from the user
b. It would display the present value of that annuity
Example: To fund an annuity that pays $3,000 monthly for 20
years and earns an expected 2.5% interest, you would need to
invest $566,141.46 today.
NOTE: If your results on any of these calculators are off by a
few pennies (not dollars!), don't worry. The difference is likely
attributable to rounding and we aren't that concerned about it
in this academy.

PV = P x 1 - (1 + r)^n/ r
*/

        } else if (calc == 3){
            System.out.println("Thanks for using our Present Value Annuity Calculator.");
            System.out.print("What is your monthly payout? Enter it here: ");
            double monthlyPayout = keyboard.nextDouble();
            System.out.print("What is your expected interest rate (in %)? Enter it here: ");
            double eIntRate = keyboard.nextDouble();
            System.out.print("What is your years to pay out? Enter it here: ");
            int yrs = keyboard.nextInt();

            double r = (eIntRate / 100) / 12; //r
            int months = yrs * 12; //n
            double PV = monthlyPayout * (1 - Math.pow(1 + r, -months)) / r;

            System.out.printf("\nThe present value of your annuity is: $%.2f" , PV);



        } else {
            System.out.println("The option you've chosen is invalid. Restart application.");
        }



    }
}

