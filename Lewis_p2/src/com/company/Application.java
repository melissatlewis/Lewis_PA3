package com.company;

public class Application {

    public static void main(String[] args) {
        //Declare new SavingsAccount objects
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        //Set savings balance
        saver1.setSavingsBalance(2000);
        saver2.setSavingsBalance(3000);

        //Set the interest rate
        SavingsAccount.modifyInterestRate(.04);
        System.out.println("Interest rate is " + SavingsAccount.annualInterestRate*100 + "%");

        //Calculate interest over one year
        for (int i = 0; i < 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        System.out.println("saver1's Balance after 12 months is $" + saver1.getBalance());
        System.out.println("saver2's Balance after 12 months is $" + saver2.getBalance());

        //Change the interest rate
        SavingsAccount.modifyInterestRate(.05);
        System.out.println("Interest rate has been changed to " + SavingsAccount.annualInterestRate*100 + "%");

        //Calculate one month interest at new rate
        saver1.calculateMonthlyInterest();
        System.out.println("saver1's Balance is $" + saver1.getBalance());
        saver2.calculateMonthlyInterest();
        System.out.println("saver2's Balance is $" + saver2.getBalance());
    }
}
