/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2830482421025
 */
public class Calculadora {
    
    //Método para somar
    public double somar(double a, double b) {
        return a + b;
    }
    
    //Método para subtrair
    public double subtrair(double a, double b) {
        return a - b;
    }
    
    //Método para multiplicar
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    //Método para dividir
    public double dividir(double a, double b) {
        if (b == 0) {
            return 0; //Evita erro de divisão por zero
        }
        return a / b;
    }
}
