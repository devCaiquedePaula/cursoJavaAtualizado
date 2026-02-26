package com.kiq.cursoJava.módulo05.construtores_THIS_sobrecarga_encapsulamento.aula03_encapsulamento;

/* Encapsulamento é um dos pilares da programação orientada a objetos (POO),
 * e refere-se à prática de restringir o acesso direto aos dados de um objeto,
 * permitindo que esses dados sejam acessados e modificados apenas através de métodos específicos (getters e setters).
 * Isso ajuda a proteger a integridade dos dados e a manter o controle sobre como os dados são manipulados.
 *
 * REGRA DE OURO DO ENCAPSULAMENTO:
 * Sempre que possível, torne os atributos de uma classe privados (private)
 * e forneça métodos públicos (public) para acessar e modificar esses atributos.
 * Além disso, o objeto deve sempre estar num estado consistente, e a própria classe deve garantir isso.
 * */
public class encapsulamentoExemplo {
    private String nome;
    private int idade;
    private double salario;

    // Getters e Setters
    public String getNome() {
        // é possível adicionar lógica adicional nos getters e setters
        if (nome == null || nome.isEmpty()) {
            return "Nome não definido";
        } else {
            return nome;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
