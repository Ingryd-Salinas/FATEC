/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ingryd Salinas
 */

public class Funcionario {
    private int id;
    protected String nome;
    protected double salarioBase;
    protected String cargo;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario(String nome, double salarioBase, String cargo) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }
    
    
}
