package com.kiq.cursoJava.módulo05.exerciciosDeFixação.exercicio_exemplo_construtores.entities;

public class Product_Constructor {
    String name;
    double price;
    int quantity;

    // Construtor que inicializa os atributos do produto
    public Product_Constructor(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
