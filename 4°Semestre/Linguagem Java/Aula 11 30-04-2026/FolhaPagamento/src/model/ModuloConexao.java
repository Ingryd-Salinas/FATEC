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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ModuloConexao {
    // O final da URL tem o nome do nosso banco e os novos parâmetros de segurança
    private static final String URL = "jdbc:mysql://localhost:3306/folha_pagamento?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USUARIO = "root";
    private static final String SENHA = "root"; // Coloque aqui a senha do seu MySQL

    public static Connection conectar() {
        try {
            // Opcional, mas boa prática: Força o carregamento do novo driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            return conexao;
            
        } catch (ClassNotFoundException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Driver JDBC não encontrado! Verifique as Bibliotecas.");
            return null;
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Erro ao conectar com o Banco:\n" + e.getMessage());
            return null;
        }
    }
}
