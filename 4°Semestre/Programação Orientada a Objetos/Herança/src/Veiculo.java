/**
 * Classe para demonstrar o conceito de Herança dentro da linguagem Java
 * @author Ingryd Salinas
 * @since 01/04/2026
 */
import java.text.DecimalFormat;

public class Veiculo {
    String marca;
    String modelo;
    int ano;
    float valor;
    
    //construtor
    public Veiculo(String marca, String modelo, int ano, float valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }
    
    //método para exibir dados do veículo
    public void exibirDadosVeiculo(){
        DecimalFormat formatador = new DecimalFormat("###,##0.00");
        
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + ano);
        System.out.println("Valor em R$: " + formatador.format(valor));
    }
}
