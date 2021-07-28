package com.company;

import entities.Teste;

import java.util.Locale;
import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Teste account;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial Deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Teste(accountNumber, holder, initialDeposit);
        }
        else {
            account = new Teste(accountNumber, holder);
        }

        System.out.println();
        System.out.println("Account Data:");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a deposit Value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println("Updated account data: ");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("Updated account data: ");
        System.out.println(account);


        sc.close();
    }
}