package com.kiq.cursoJava.módulo06.comportamento_de_memoria_arrays_listas.aula03_vetores;

import java.util.Locale;
import java.util.Scanner;

public class exemplo_array {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas alturas serão digitadas?");
        int n = scanner.nextInt();
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite a altura " + (i + 1) + ":");
            alturas[i] = scanner.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += alturas[i];
        }

        double media = soma / n;
        System.out.printf("Altura média: %.2f%n", media);

        scanner.close();
    }
}
