/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Classe para...
 * @author Ingryd Salinas
 * @since Classe criada em 12 de mai. de 2026 - 14:54:41
 */
public class CalculoIMCExcecao extends Exception{
    
    public CalculoIMCExcecao(){
        super("Você está abaixo do peso!!!");
    }
    public CalculoIMCExcecao(int a){
        super("Você está eutrofica(o)!");
    }
    public CalculoIMCExcecao(String b){
        super("Você está com sobrepeso!");
    }
    public CalculoIMCExcecao(float c){
        super("Você está com obesidade grau I!!");
    }
    public CalculoIMCExcecao(double d){
        super("Você está com obesidade grau II!!!");
    }
    
    public CalculoIMCExcecao(int e, float f){
        super("Você está com obesidade grau III!!!!");
    }
}
