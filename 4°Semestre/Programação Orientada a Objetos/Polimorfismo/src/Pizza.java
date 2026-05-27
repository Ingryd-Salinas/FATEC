/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Interface para apontar as funcionalidades básicas no preparo de Pizzas
 * @author Ingryd Salinas
 * @since Interface criada em 27/05/2026 - 10:25:05
 */
public interface Pizza {
    
    //Montar a pizza com os ingredientes
    public void montar();
    
    //Tempo de forno para assar a pizza
    public void assar();
    
    //Valor que será cobrado pela pizza
    public void cobrar();
}
