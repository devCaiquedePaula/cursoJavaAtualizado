package com.kiq.cursoJava.módulo05.exerciciosDeFixação.exercicio_exemplo_construtores.app;

import com.kiq.cursoJava.módulo05.exerciciosDeFixação.exercicio_exemplo_construtores.entities.Product_Constructor;

import java.util.Scanner;

public class Product_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();


        Product_Constructor product = new Product_Constructor(name, price, quantity);
        product.addProducts(10);
        System.out.printf("Total value in stock: $ %.2f%n", product.totalValueInStock());

        System.out.println("Do you want to remove products? (y/n)");
        char response = sc.next().charAt(0);
        if (response == 'y' || response == 'Y') {
            System.out.print("Enter the number of products to remove: ");
            int removeQuantity = sc.nextInt();
            product.removeProducts(removeQuantity);
            System.out.printf("Updated total value in stock: $ %.2f%n", product.totalValueInStock());
        }
    }
}
