/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ingryd Salinas
 */
public class Horista extends Funcionario{
    // Atributos Protected: Para que o Pai possa ver
    protected int horasTrabalhadas;
    protected double valorHora;
    
    //Construtor
    public Horista(String nome, int horasTrabalhadas, double valorHora) {
        super(nome, 0); //chama o construtor do Pai (Funcionario)
        this.horasTrabalhadas = horasTrabalhadas;
        // O 'this' diferencia o atributo do parametro
        this.valorHora = valorHora;
    }
    
    @Override
    public double calcularLiquido(){
        //Liquido do Gerente = (Salario + Bonus) = INSS
        //Usamos super.calcularINSS() para arantir o calculo base
        return (this.horasTrabalhadas * this.valorHora) - super.calcularINSS();
    }
}
