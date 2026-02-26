package com.kiq.cursoJava.módulo06.comportamento_de_memoria_arrays_listas.aula06_matrizes;

public class Matriz_demo {
    public static void main(String[] args) {

        String[][] nomes = new String[2][3];
        nomes[0][0] = "João";
        nomes[0][1] = "Maria";
        nomes[0][2] = "José";
        nomes[1][0] = "Ana";
        nomes[1][1] = "Pedro";
        nomes[1][2] = "Carla";

        for (int i = 0; i < nomes.length; i++) {
            for (int j = 0; j < nomes[i].length; j++) {
                System.out.println("Elemento na posição [" + i + "][" + j + "]: " + nomes[i][j]);
            }
        }
    }
}