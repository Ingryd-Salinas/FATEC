
import static java.lang.System.exit;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Classe para gerar objetos do tipo Conta Corrente de clientes
 * @author Ingryd Salinas
 * @since Classe criada em 29/04/2026
 */
public class ContaCorrente {
    private String cliente;
    private int numeroConta;
    private float saldo;
    private int senha;
    private boolean contaBloqueada = false;
    int cont = 0;
    /*
    Modificadores de visibilidade: (4 P's):
        public - default - Dado prostituído (todos tem acesso)
        private - de acesso privado à classe que ele pertence
        protected - proteger atributos dentro de uma estrutura de Herança
        package - dados com acesso dentro de todos os programas do pacote
    
    Para acessá-los é através dos métodos assessores (setters) e modificadores (getters):
        Set - Insere dados no atributo, guarda o valor e recebe parâmetros. Void, pois não retorna nada
        Get - Obtém o dado do atributo, retorna o valor então nunca será void. Não recebe parâmetros
    */

    //Construtor do objeto Conta do cliente
    public ContaCorrente(String cliente, int numeroConta, float saldo, int senha) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.senha = senha;
    }
    
    public void menu(){
        int option;
        option = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das opções: \n1 - Saque \n2 - Alterar Senha \n3 - Exibir Saldo \n4 - Exibir Dados \n5 - Depositar \n0 - Sair"));
        switch(option){
            case 1:
                realizarSaque();
                break;
                
            case 2:
                mudarSenha();
                break;
                
            case 3:
                exibirSaldo();
                break;
                
            case 4:
                exibirDadosContaCorrente();
                break;
                
            case 5:
                realizarDeposito(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor do depósito")));
                break;
                
            case 0:
                exit(0);
        }
    }
    
    //Método comum para exibir os dados da conta
    public void exibirDadosContaCorrente(){
        System.out.println("Cliente: " + getCliente());
        System.out.println("Conta Corrente: " + getNumeroConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Senha: " + getSenha());
    }
    
    public void exibirSaldo(){
        System.out.println("Saldo: " + getSaldo());
    }
    
    //Método para realizar o depósito alterando o saldo da conta do cliente
    public void realizarDeposito(float valorDeposito){
        setSaldo(getSaldo() + valorDeposito); //simplificado
        
        /* Passo-a-Passo:
            float saldoAnterior = getSaldo();
            float novoSaldo = saldoAnterior + valorDeposito;
            setSaldo(novoSaldo);
        */
    }
    
    //Método para realizar o saque de valores em uma Conta Corrente alterando o saldo da conta do cliente
    public void realizarSaque(){
        if(solicitarSenha() == false)
            JOptionPane.showMessageDialog(null, "Senha inválida - saque NÃO realizado!!");
        else{
            float valorSaque = Float.parseFloat(JOptionPane.showInputDialog("Valor a sacar: "));
            setSaldo(getSaldo() - valorSaque);
        }
        exibirSaldo();
        
    }
    
    //Método para receber a senha
    public boolean solicitarSenha(){
        
        while(true){
            
            int senhaDigitada = Integer.parseInt(JOptionPane.showInputDialog("Senha: "));
        
            if(verificarSenha(senhaDigitada)){
                return true;
            }
            
            cont++;
                
            if(cont >= 3){
                JOptionPane.showMessageDialog(null, "Conta Bloqueada!!");
                cont = 0;
                this.contaBloqueada = true;
                return false;
            }
            
        }
      
    }
    
    //Método para verificar a senha
    public boolean verificarSenha(int senhaDigitada){
        
        return senhaDigitada == getSenha();
        
        /* Passo-a-Passo
        if(senhaDigitada == getSenha())
            return true;
        else
            return false;
        */
    }
    
    //Método para modificar a senha
    public void mudarSenha(){
        JOptionPane.showMessageDialog(null, "Mudando senha...");
        int senhaAntiga;
        senhaAntiga = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha antiga: "));
        
        if(senhaAntiga == getSenha())
            confNovaSenha();    
        else{
            JOptionPane.showMessageDialog(null, "Senha antiga incorreta!");
            mudarSenha();
        }
            
    }
    
    //Método para conferir a nova senha
    public void confNovaSenha(){
        int novaSenha;
        novaSenha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nova senha: "));
        int confSenha;
        confSenha = Integer.parseInt(JOptionPane.showInputDialog(null, "Confirme a nova senha: "));
            
        if(novaSenha == confSenha){
            setSenha(novaSenha);
        }
        else{
            JOptionPane.showMessageDialog(null, "As senhas não coincidem!!");
            confNovaSenha();
        }
    }
    
    //Métodos acessores setters
    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    private void setSenha(int senha) {
        this.senha = senha;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setContaBloqueada(boolean contaBloqueada) {
        this.contaBloqueada = contaBloqueada;
    }
    
    //Métodos modificadores getters
    private float getSaldo() {
        return this.saldo;
    }

    private int getSenha() {
        return this.senha;
    }

    public String getCliente() {
        return cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public boolean isContaBloqueada() {
        return contaBloqueada;
    }
    
}
