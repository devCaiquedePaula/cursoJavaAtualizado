package com.kiq.cursoJava.módulo06.exerciciosDeFixação;

import java.util.Locale;
import java.util.Scanner;

public class desafio_pensionato_array {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline after the int

        String[] rooms = new String[10];

        for (int i = 0; i < n; i++) {
            System.out.println("Aluguel #" + (i + 1) + ":");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();

            int roomNumber;
            while (true) {
                System.out.print("Quarto (0-9): ");
                if (!sc.hasNextInt()) {
                    System.out.println("Entrada inválida. Digite um número entre 0 e " + (rooms.length - 1) + ".");
                    sc.next();
                    continue;
                }
                roomNumber = sc.nextInt();
                sc.nextLine();

                if (roomNumber < 0 || roomNumber >= rooms.length) {
                    System.out.println("Número de quarto inválido. Tente novamente.");
                } else if (rooms[roomNumber] != null) {
                    System.out.println("Quarto já ocupado. Tente novamente.");
                } else {
                    break;
                }
            }

            rooms[roomNumber] = name + ", " + email;
        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }
        }

        sc.close();
    }
}
