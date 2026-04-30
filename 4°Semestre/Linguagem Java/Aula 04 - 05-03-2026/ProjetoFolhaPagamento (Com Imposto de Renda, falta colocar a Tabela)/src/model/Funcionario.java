/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ingryd Salinas
 */
public class Funcionario {
    // Atributos Protected: Para que os Filhos (Gerente) possam ver
    protected String nome;
    protected double salarioBase;
    
    //Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        // O 'this' diferencia o atributo do parametro
        this.salarioBase = salario;
    }
    
    // Regra: INSS de 11% (fixo para exemplo)
    public double calcularINSS() {
        return this.salarioBase * 0.11;
    }
    
    //Calculo do líquido
    public double calcularLiquido(){
        return this.salarioBase - calcularINSS();
    }
    
    public double calcularIRRF() {
        if (this.salarioBase < 2000.01) {
            return 0.0;
        }
        else if (this.salarioBase > 2000.00 && this.salarioBase < 5000.01) {
            return (this.salarioBase - calcularINSS()) * 0.1;
        }
        else {
            return (this.salarioBase - calcularINSS()) * 0.2;
        }
    }
    
    // Getters (para a tela pegar os valores)
    public String getNome(){ return nome; }
    public double getSalarioBase(){ return salarioBase; }
}
