package com.kiq.cursoJava.módulo06.exerciciosDeFixação;

import java.util.Locale;
import java.util.Scanner;

public class array_exercicio_negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] numbers = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextDouble();
        }

        System.out.println("NÚMEROS NEGATIVOS:");
        for (int i = 0; i < n; i++) {
            if (numbers[i] < 0) {
                System.out.printf("%.1f%n", numbers[i]);
            }
        }
    }
}
