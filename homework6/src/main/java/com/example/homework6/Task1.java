package com.example.homework6;

import java.net.ServerSocket;

public class Task1 {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        CreditCard creditCard1 = new CreditCard();
        CreditCard creditCard2 = new CreditCard();
        creditCard.setDepositMoney(7, "12541");
        creditCard1.setDepositMoney(10, "54125");
        //creditCard2.setDepositMoney(16, "34785");
        creditCard.accrual();
        creditCard1.accrual();
        creditCard2.setWithdrawSum(105, "34785");
        creditCard2.withdraw();
        System.out.println("info about card 1: " + creditCard.getCurrentSum() + " " + creditCard.getAccountNumber());
        System.out.println("info about card 2: " + creditCard1.getCurrentSum() + " " + creditCard1.getAccountNumber());
        System.out.println("info about card 3: " + creditCard2.getCurrentSum() + " " + creditCard2.getAccountNumber());

    }
}

class CreditCard {
    private String accountNumber;
    private int currentSum;
    private  int withdraw;


    public void setDepositMoney(int depositMoney, String accountNumber) {
        if (depositMoney > 5 && accountNumber.length() == 5) {
            this.currentSum = depositMoney;
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Data entered incorrectly");
        }
    }

    public int getCurrentSum() {
        return currentSum;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    void accrual() {
        if (currentSum > 0 && accountNumber.length() != 0) {
            System.out.println("You deposit that amount: " + currentSum);
        } else {
            System.out.println("failed to make a deposit");
        }
    }

    public void setWithdrawSum(int currentSum, String accountNumber) {
        if (currentSum > 15 && accountNumber.length() == 5) {
            this.withdraw = currentSum;
            this.accountNumber = accountNumber;
            this.currentSum = currentSum - currentSum;
        } else {
            System.out.println("insufficient funds to withdraw or invalid card number");
        }
    }

    void withdraw() {
        if (withdraw > 15 && accountNumber.length() != 0) {
            System.out.println("you withdraw " + withdraw + " dollars");
        }
        else{
            System.out.println("insufficient funds to withdraw");
        }
    }

}
