/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe para instanciar os clientes
 * @author Ingryd Salinas
 * @since Classe criada em 29/04/2026 - 10:06:07
 */
public class Banco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Ana Maria", 12345, 1000f, 224466);
        cc.menu();
        //cc.realizarDeposito(300);
        //cc.realizarSaque();
        //cc.exibirDadosContaCorrente();
    }
}
