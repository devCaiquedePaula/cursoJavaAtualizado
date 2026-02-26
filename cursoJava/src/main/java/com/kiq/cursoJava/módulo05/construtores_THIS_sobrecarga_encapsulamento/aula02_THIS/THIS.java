package com.kiq.cursoJava.módulo05.construtores_THIS_sobrecarga_encapsulamento.aula02_THIS;

/* A palavra reservada THIS em Java é uma referência ao objeto atual da classe.
 * Ela é usada para diferenciar entre atributos da classe e parâmetros do função(method) ou construtor quando eles têm o mesmo nome.
 * Também pode ser usada para chamar outros construtores da mesma classe.
 * */

public class THIS {
    String nome;
    int idade;

    // Construtor que utiliza THIS para diferenciar entre atributos e parâmetros
    public THIS(String nome, int idade) {
        this.nome = nome; // 'this.nome' refere-se ao atributo da classe, 'nome' refere-se ao parâmetro do construtor
        this.idade = idade;
    }

    // Função que exibe as informações do objeto
    public void exibirInfo() {
        System.out.println("Nome: " + this.nome + ", Idade: " + this.idade);
    }
}
