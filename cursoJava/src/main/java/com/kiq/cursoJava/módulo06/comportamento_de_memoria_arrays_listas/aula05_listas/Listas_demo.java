package com.kiq.cursoJava.módulo06.comportamento_de_memoria_arrays_listas.aula05_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas_demo {
    public static void main(String[] args) {

        List<Integer> listInt = new ArrayList<>();
        listInt.add(10);
        listInt.add(20);
        listInt.add(30);

        listInt.add(1,15);

        for (Integer i : listInt) {
            System.out.println(i);
        }

        System.out.println("-------------------");

        List<String> listStr = new ArrayList<>();
        listStr.add("Java");
        listStr.add("Python");
        listStr.add("JavaScript");

        listStr.add(1,"C#");

        // Usando lambda expression para imprimir os elementos da lista
        listStr.forEach(System.out::println);

        listStr.removeIf(str -> str.length() > 5);

        System.out.println("-------------------");

        listStr.forEach(System.out::println);

        System.out.println("Index of Java: " + listStr.indexOf("Java"));

        System.out.println("-----------------------------");

        List<String> listPessoas = new ArrayList<>();
        listPessoas.add("Maria");
        listPessoas.add("João");
        listPessoas.add("Ana");
        listPessoas.add("Carlos");
        listPessoas.add("Beatriz");

        listPessoas.forEach(System.out::println);

        // .stream() = cria um fluxo de dados a partir da lista
        // .filter() = filtra os elementos com base em uma condição
        // .toList() = coleta os elementos filtrados em uma nova lista
        List<String> resultado = listPessoas.stream().filter(nome -> nome.charAt(0) == 'A').toList();
        System.out.println("Nomes que começam com a letra A:");
        resultado.forEach(System.out::println);

        System.out.println("-----------------------------");
        String nomeEncontrado = listPessoas.stream().filter(nome -> nome.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println("Primeiro nome que começa com a letra J: " + nomeEncontrado);

    }
}
