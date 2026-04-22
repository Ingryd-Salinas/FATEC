/**
 * Construção da classe filha (Juridica) de Pessoa
 * @author Ingryd Salinas
 * @since Classe criada em 22/04/2026
 */

import java.text.DecimalFormat;

public class Juridica extends Pessoa{
    int cnpj;
    String nomeFantasia;
    String porte;
    float faturamento;

    public Juridica(String nome, int idade, int cnpj, String nomeFantasia, float faturamento) {
        super(nome, idade);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.faturamento = faturamento;
        this.porte = analisarFaturamento();
    }
    
    @Override
    public void exibirDados(){
        System.out.println(super.nome + " possui o nome Fantasia " + this.nomeFantasia + " de CNPJ " + this.cnpj + ".");
    }
    
    //Método para analisar e retornar o porte da Empresa
    public String analisarFaturamento(){
        if(faturamento <= 81000)
            return "MEI";
        else if(faturamento <= 360000)
            return "ME";
        else if(faturamento <= 4800000)
            return "EPP";
        else
            return "Média ou Grande empresa";
    }
    
    
    public void exibirDados(int n){
        DecimalFormat formatador = new DecimalFormat("###,##0.00");
        
        System.out.println("Atualmente se enquadra como " + porte + ", com faturamento de " + formatador.format(faturamento) + " por ano!");
    }
}
