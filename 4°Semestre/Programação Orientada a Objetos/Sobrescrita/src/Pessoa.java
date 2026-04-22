/**
 * Construção da classe Pessoa
 * @author Ingryd Salinas
 * @since Classe criada em 22/04/2026
 */

public class Pessoa {
    
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
