/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ingryd Salinas
 */
//extends indica Herança
public class Gerente extends Funcionario {
    private double bonus;
    
    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario); //chama o construtor do Pai (Funcionario)
        this.bonus = bonus;
    }
    
    //Polimorfismo: sobrescrevemos o metodo calcularLiquido
    @Override
    public double calcularLiquido(){
        //Liquido do Gerente = (Salario + Bonus) = INSS
        //Usamos super.calcularINSS() para arantir o calculo base
        return (this.salarioBase + this.bonus) - super.calcularINSS() - super.calcularIRRF();
    }
}
