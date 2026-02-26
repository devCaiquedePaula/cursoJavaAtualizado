package com.kiq.cursoJava.módulo05.construtores_THIS_sobrecarga_encapsulamento.aula01_construtores;

/* Construtor é uma função especial utilizado para inicializar objetos.
 * Ele é chamado automaticamente quando um objeto da classe é criado.
 * Ele permite ou obriga que o objeto receba valores iniciais para seus atributos.
 * O construtor tem o mesmo nome da classe e não possui um tipo de retorno.
 * */

public class construtor {
    String nome;
    int idade;

    // Construtor padrão (sem parâmetros)
    public construtor() {
    }

    // Construtor que obriga a passagem de nome e idade ao criar o objeto
    public construtor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Sobrecarga de construtor com apenas o nome
    public construtor(String nome) {
        this.nome = nome;
        this.idade = 0; // idade padrão 
    }
}
