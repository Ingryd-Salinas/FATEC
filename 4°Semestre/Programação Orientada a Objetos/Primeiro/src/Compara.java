/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe para fazer comparações entre dois objetos Pessoa
 * @author Ingryd Salinas
 * @since Classe criada em 18/03/2026
 */
public class Compara {
    public Compara(Pessoa a, Pessoa b) {
        compararPeso(a, b);
        compararAltura(a, b);
        compararIMC(a, b);
        compararIdade(a, b);
    }; //constructor vazio
    
    //Método para comparar peso entre duas Pessoas
    private void compararPeso(Pessoa a, Pessoa b) {
        if(a.peso > b.peso)
            System.out.println(b.nome + " é mais magra que " + a.nome);
        else if(a.peso < b.peso)
            System.out.println(a.nome + " é mais magra que " + b.nome);
        else
            System.out.println(a.peso + " e " + b.peso + " tem pesos iguais");
    }
    
    //Método para comparar a altura de duas Pessoas
    private void compararAltura(Pessoa a, Pessoa b) {
        if(a.altura > b.altura)
            System.out.println(a.nome + " é mais alta que " + b.nome);
        else if(a.altura < b.altura)
            System.out.println(a.nome + " é mais baixa que " + b.nome);
        else
            System.out.println(a.altura + " e " + b.altura + " tem a mesma altura");
    }
    
    //Método para comparar o IMC de duas Pessoas
    private void compararIMC(Pessoa a, Pessoa b) {
        if(a.calcularIMC() > b.calcularIMC())
            System.out.println(b.nome + " tem o IMC menor que " + a.nome);
        else if(a.calcularIMC() < b.calcularIMC())
            System.out.println(a.nome + " tem o IMC menor que " + b.nome);
        else
            System.out.println(a.calcularIMC() + " e " + b.calcularIMC() + " tem IMC iguais");
    }
    
    /*private garante o encapsulamento, pois só pode ser acessado pela própria classe, 
      então outras classes acessam somente a classe compara, 
      declarando dessa forma: Compara comparação = new Compara(p, x); */
    
    //Método para determinar quem é a pessoa mais velha
    private void compararIdade(Pessoa a, Pessoa b) {
        if(a.idade > b.idade)
            System.out.println(b.nome + " é mais velha que " + a.nome);
        else if(a.idade < b.idade)
            System.out.println(a.nome + " é mais nova que " + b.nome);
        else
            System.out.println(a.idade + " e " + b.idade + " tem mesma idade");
    }
    
}
