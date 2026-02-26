package com.kiq.cursoJava.módulo05.exerciciosDeFixação.exercicio_banco.entities;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Account {
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    // Constantes e variáveis estáticas para geração de números de conta únicos
    private static final Random RANDOM = new Random();
    private static final Set<Integer> USED_NUMBERS = new HashSet<>();
    private static final int MAX_NUMBERS = 100_000; // 0..99999

    public Account(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = generateAccountNumber();
        this.balance = 0.0;
    }

    public Account(String accountHolderName, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = generateAccountNumber();
        this.balance = initialDeposit;
    }

    private int generateAccountNumber() {
        if (USED_NUMBERS.size() >= MAX_NUMBERS) {
            throw new IllegalStateException("No more unique account numbers available.");
        }
        int number;
        do {
            number = RANDOM.nextInt(MAX_NUMBERS);
        } while (!USED_NUMBERS.add(number));
        return number;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        int tax = 5;
        if (amount > 0) {
            balance -= amount;
            balance -= tax;
        }
    }
}
