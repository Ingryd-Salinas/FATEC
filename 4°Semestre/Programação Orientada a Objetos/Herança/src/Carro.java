/**
 * Classe filha que herda todos os atributos e métodos da super classe veiculo
 * @author Ingryd Salinas
 * @since 01/04/2026 
 */
public class Carro extends Veiculo{
    String cor;
    boolean arCondicionado;
    int volPortaMalas;
    float potencia;
    
    //construtor
    public Carro(String marca, String modelo, int ano, float valor, String cor, boolean arCondicionado, int volPortaMalas, float potencia){
        super(marca, modelo, ano, valor);
        this.cor = cor;
        this.arCondicionado = arCondicionado;
        this.volPortaMalas = volPortaMalas;
        this.potencia = potencia;
    }
    
    public void exibirDadosCarro(){
        super.exibirDadosVeiculo();
        System.out.println("Cor: " + cor);
        System.out.println("Possui ar condicionado: " + arCondicionado);
        System.out.println("Volume do Porta Malas: " + volPortaMalas);
        System.out.println("Potência do motor: " + cor);
    }
}
