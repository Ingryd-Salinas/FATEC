/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author Ingryd Salinas
 */
public class RepositorioDados {
    // classe estática, não permite que seja feito outras instâncias de classe
    public static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
    
    private RepositorioDados(){
    }
    
   // Método para iniciar o sistema com 10 dados visíveis para testes
    public static void iniciarDadosTeste() {
        if(listaFuncionarios.isEmpty()) {
            // Funcionários Comuns (Nome, Salário Base)
            listaFuncionarios.add(new Funcionario("Ana Silva", 3500.00));
            listaFuncionarios.add(new Funcionario("Daniel Costa", 2800.00));
            listaFuncionarios.add(new Funcionario("Gabriela Mendes", 4100.00));
            listaFuncionarios.add(new Funcionario("Isabela Castro", 3200.00));
            
            // Gerentes (Nome, Salário Base, Bônus)
            listaFuncionarios.add(new Gerente("Carlos Oliveira", 8000.00, 2500.00));
            listaFuncionarios.add(new Gerente("Eduarda Lima", 9500.00, 3000.00));
            listaFuncionarios.add(new Gerente("João Pereira", 10500.00, 4000.00));
            
            // Horistas (Nome, Horas Trabalhadas, Valor da Hora)
            listaFuncionarios.add(new Horista("Beatriz Souza", 160, 45.00));
            listaFuncionarios.add(new Horista("Fábio Rocha", 120, 50.00));
            listaFuncionarios.add(new Horista("Henrique Alves", 100, 40.00));
        }
    }
}
