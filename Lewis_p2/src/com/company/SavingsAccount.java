/* COP3330 Programming Assignment 3 - Problem 2
   Written by: Melissa Lewis */


package com.company;

public class SavingsAccount {

    static double annualInterestRate = 0;
    private double savingsBalance = 0;

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    public void calculateMonthlyInterest() {
        double interest = (savingsBalance*annualInterestRate)/12;
        modifySavingsBalance(interest);
    }

    public void setSavingsBalance(double newBalance) {
        savingsBalance = newBalance;
    }

    public void modifySavingsBalance(double balanceChange) {
        savingsBalance += balanceChange;
    }

    public double getBalance() {
        return savingsBalance;
    }
}
