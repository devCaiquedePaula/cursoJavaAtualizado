package com.kiq.cursoJava.módulo06.comportamento_de_memoria_arrays_listas.aula03_vetores;

import java.util.Locale;
import java.util.Scanner;

public class exemplo_array2 {

    public String name;
    public double price;

    public exemplo_array2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos produtos serão digitados?");
        int n = scanner.nextInt();
        exemplo_array2[] vect = new exemplo_array2[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite o nome do produto " + (i + 1) + ":");
            scanner.nextLine(); // Consumir a quebra de linha
            String name = scanner.nextLine();
            System.out.println("Digite o preço do produto " + (i + 1) + ":");
            double price = scanner.nextDouble();
            vect[i] = new exemplo_array2(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double average = sum / vect.length;
        System.out.printf("Preço médio: %.2f%n", average);

        scanner.close();
    }
}
