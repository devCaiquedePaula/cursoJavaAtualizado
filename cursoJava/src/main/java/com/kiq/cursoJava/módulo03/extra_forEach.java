package com.kiq.cursoJava.módulo03;

// O laço for-each em Java é uma maneira simplificada de iterar sobre arrays e coleções.

public class extra_forEach {
    public static void main(String[] args) {
        String[] lang = {"Java", "Python", "JavaScript", "C#", "Ruby"};

        for (String languages : lang) {
            System.out.println("Programming Languages: " + languages);
        }
    }
}
