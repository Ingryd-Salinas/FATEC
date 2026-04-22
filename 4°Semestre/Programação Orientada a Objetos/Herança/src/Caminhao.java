/**
 * Classe filha que herda todos os atributos e métodos da super classe veiculo
 * @author Ingryd Salinas
 * @since 01/04/2026 
 */
public class Caminhao extends Veiculo{
    String cor;
    boolean arCondicionado;
    int numeroCaçambas;
    int numeroRodas;
    float potencia;
    
    public Caminhao(String marca, String modelo, int ano, float valor, String cor, boolean arCondicionado, int numeroCaçambas, int numeroRodas, float potencia){
        super(marca, modelo, ano, valor);
        this.cor = cor;
        this.arCondicionado = arCondicionado;
        this.numeroCaçambas = numeroCaçambas;
        this.numeroRodas = numeroRodas;
        this.potencia = potencia;
    }
    
    public void exibirDadosCaminhao(){
        super.exibirDadosVeiculo();
        System.out.println("Cor: " + cor);
        System.out.println("Possui Ar-condicionado: " + arCondicionado);
        System.out.println("Quantidade de Caçambas: " + numeroCaçambas);
        System.out.println("Potencia do Motor: " + potencia);
        System.out.println("Quantidade de rodas: " + numeroRodas);
    }
}
