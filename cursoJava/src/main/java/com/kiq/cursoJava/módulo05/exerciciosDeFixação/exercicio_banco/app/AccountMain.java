package com.kiq.cursoJava.módulo05.exerciciosDeFixação.exercicio_banco.app;

import com.kiq.cursoJava.módulo05.exerciciosDeFixação.exercicio_banco.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Do you want to make a initial deposit amount ? (y/n): ");
        char initialDepositChoice = scanner.next().charAt(0);

        Account account;
        if (initialDepositChoice == 'y' || initialDepositChoice == 'Y') {
            System.out.print("Enter initial deposit amount: ");
            double initialDeposit = scanner.nextDouble();
            account = new Account(accountHolderName, initialDeposit);
            System.out.println("Account created for " + accountHolderName +
                    " with account number " + account.getAccountNumber() +
                    " and initial deposit of $" + String.format("%.2f", account.getBalance()));
        } else {
            account = new Account(accountHolderName);
            System.out.println("Account created for " + accountHolderName +
                    " with account number " + account.getAccountNumber() +
                    " and no initial deposit.");
        }

        System.out.println("----------------------------------");
        System.out.println("Account Data:");
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: $" + String.format("%.2f", account.getBalance()));
        System.out.println("----------------------------------");

        System.out.print("Would you like to make any new operation? (y/n): ");
        char operationChoice = scanner.next().charAt(0);
        if (operationChoice == 'y' || operationChoice == 'Y') {
            int choice;
            do {
                System.out.println("Select operation: ");
                System.out.println("1 - Change Account Holder Name");
                System.out.println("2 - Make a Deposit");
                System.out.println("3 - Make a Withdrawal");
                System.out.println("4 - View Account Data");
                System.out.println("5 - Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        scanner.nextLine(); // consume newline from nextInt()
                        System.out.print("Enter new account holder name: ");
                        String newName = scanner.nextLine();
                        account.setAccountHolderName(newName);
                        System.out.println("Updated Account Holder Name: " + account.getAccountHolderName());
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        System.out.println("Updated Balance: $" + String.format("%.2f", account.getBalance()));
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount = scanner.nextDouble();
                        if (withdrawalAmount > account.getBalance()){
                            System.out.println("Insufficient funds for this withdrawal.");
                            break;
                        }
                        account.withdraw(withdrawalAmount);
                        System.out.println("Updated Balance: $" + String.format("%.2f", account.getBalance()));
                        break;
                    case 4:
                        System.out.println("----------------------------------");
                        System.out.println("Account Data:");
                        System.out.println("Account Holder: " + account.getAccountHolderName());
                        System.out.println("Account Number: " + account.getAccountNumber());
                        System.out.println("Balance: $" + String.format("%.2f", account.getBalance()));
                        System.out.println("----------------------------------");
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                System.out.println();
            } while (choice != 5);
        } else {
            System.out.println("Thank you for using our banking system. Goodbye & have a nice day!");
        }

        scanner.close();
    }
}