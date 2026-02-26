package com.kiq.cursoJava.módulo05.construtores_THIS_sobrecarga_encapsulamento.aula03_encapsulamento;

public class encapsulamentoMain {
    public static void main(String[] args) {
        encapsulamentoExemplo pessoa = new encapsulamentoExemplo();

        // Usando os setters para definir os valores
        pessoa.setNome("João");
        pessoa.setIdade(30);
        pessoa.setSalario(5000.00);

        // Usando os getters para obter os valores
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Salário: " + pessoa.getSalario());
    }
}
