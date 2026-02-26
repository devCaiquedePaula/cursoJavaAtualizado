package com.kiq.cursoJava.módulo06.exerciciosDeFixação;

import java.util.Locale;
import java.util.Scanner;

public class lista_empregados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos empregados serão registrados? ");
        int n = sc.nextInt();
        String[] empregados = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Empregado #" + (i + 1) + ":");
            System.out.print("Nome: ");
            sc.nextLine(); // Consumir a quebra de linha
            String nome = sc.nextLine();

            int id;
            while (true) {
                System.out.print("ID: ");
                id = sc.nextInt();
                if (idExists(empregados, id)) {
                    System.out.println("ID já existe. Informe outro ID.");
                } else {
                    break;
                }
            }

            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            empregados[i] = nome + ", " + id + ", " + String.format("%.2f", salario);
        }

        System.out.println("------------");
        System.out.println("Qual ID de empregado terá aumento de salário? ");
        int idAumento = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            String[] partes = empregados[i].split(", ");
            int idAtual = Integer.parseInt(partes[1]);
            if (idAtual == idAumento) {
                System.out.print("Qual é a porcentagem de aumento? ");
                double porcentagem = sc.nextDouble();
                double salarioAtual = Double.parseDouble(partes[2]);
                double novoSalario = salarioAtual + (salarioAtual * porcentagem / 100);
                empregados[i] = partes[0] + ", " + partes[1] + ", " + String.format("%.2f", novoSalario);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Este ID não existe!");
        }

        System.out.println("Lista atualizada de empregados:");
        for (String empregado : empregados) {
            System.out.println(empregado);
        }
        sc.close();
    }

    private static boolean idExists(String[] empregados, int id) {
        for (String rec : empregados) {
            if (rec == null) continue;
            String[] parts = rec.split(", ");
            int existingId = Integer.parseInt(parts[1]);
            if (existingId == id) return true;
        }
        return false;
    }
}
