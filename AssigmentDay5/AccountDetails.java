package com.AssigmentDay5;

import java.util.Scanner;

class Account {

    private int id;
    private String accountType;
    private double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account() {
    }

    public Account(int id, String accountType, double balance) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;
    }

    public boolean Withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public String GetDetails() {
        return "Account Id: " + id + "\nAccount Type: " + accountType + "\nBalance: " + balance;
    }
}

public class AccountDetails {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter account type: ");
        String accountType = scanner.nextLine();

        System.out.print("Enter account balance: ");
        double balance = scanner.nextDouble();


        Account account = new Account(id, accountType, balance);


        System.out.println("\n" + account.GetDetails());

        System.out.print("\nEnter amount to withdraw: ");
        double amountToWithdraw = scanner.nextDouble();

        boolean success = account.Withdraw(amountToWithdraw);

        if (success) {

            System.out.println("New Balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient Balance");
        }

        scanner.close();
    }
}
