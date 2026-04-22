
import javax.swing.JOptionPane;

/**
 * Classe para gerar o objeto Proprietário que adquirirá um veículo
 * @author Ingryd Salinas
 * @since 01/04/2026
 */

public class Proprietario {
    String nome;
    String CPF;
    String telefone;
    
    //construtor do objeto Proprietário em memória
    //para gerar de forma automatica, clica com botão direito no espaço em branco -> inserir código -> construtor
    public Proprietario(){
        this.nome = JOptionPane.showInputDialog("Nome: "); //serve para o usuário inserir os dados
        this.CPF = JOptionPane.showInputDialog("CPF: ");
        this.telefone = JOptionPane.showInputDialog("Telefone: ");
    }
    
    //Método comum para gerar um objeto do tipo Proprietário
    public void exibirDadosProprietario(){
        System.out.println("Proprietário: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Contato: " + telefone);
    }
}
