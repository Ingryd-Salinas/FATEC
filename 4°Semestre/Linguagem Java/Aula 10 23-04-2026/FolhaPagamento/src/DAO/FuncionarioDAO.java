/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Ingryd Salinas
 */

import model.Funcionario; // Assumindo que o senhor já tem a classe Funcionario com os Getters/Setters
import model.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FuncionarioDAO {
    
    public void cadastrarFuncionario(Funcionario obj) {
        
        String sql = "INSERT INTO funcionario (nome, cargo, salario_base) VALUES (?, ?, ?)";
        
        try (Connection con = ModuloConexao.conectar();
             PreparedStatement stmt = con.prepareStatement(sql)) {
            
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCargo());
            stmt.setDouble(3, obj.getSalarioBase());
            
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso na base de dados!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar cadastrar: " + e.getMessage());
        }
    }
    
    public void alterarFuncionario(Funcionario obj) {

        String sql = "UPDATE funcionario SET nome = ?, cargo = ?, salario_base = ? WHERE id = ?";
        
        try (Connection con = ModuloConexao.conectar();
             PreparedStatement stmt = con.prepareStatement(sql)) {
            
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCargo());
            stmt.setDouble(3, obj.getSalarioBase());
            stmt.setInt(4, obj.getId()); // O ID garante que só este funcionário será alterado
            
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Funcionário alterado com sucesso!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar: " + e.getMessage());
        }
    }

        public ArrayList<Funcionario> listarTodos() {
        ArrayList<Funcionario> lista = new ArrayList<>();
        String sql = "SELECT * FROM funcionario";
        
        try (Connection con = ModuloConexao.conectar();
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            // O ResultSet funciona como um cursor que lê linha a linha do banco
            while (rs.next()) {
                // Usamos o seu construtor que pede nome e salário base
                Funcionario f = new Funcionario(
                    rs.getString("nome"),  
                    rs.getDouble("salario_base"),
                    rs.getString("cargo")
                );
                
                // Preenchemos os restantes dados
                f.setId(rs.getInt("id"));
                f.setCargo(rs.getString("cargo"));
                
                // Adicionamos o funcionário montado à nossa lista
                lista.add(f);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar funcionários no banco: " + e.getMessage());
        }
        
        return lista;
    }
    
    
}
