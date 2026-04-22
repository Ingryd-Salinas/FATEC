/**
 * Classe para instanciar objetos do tipo carro
 * @author Ingryd Salinas
 * @since 01/04/2026 
 */
public class Concessionaria {
    public static void main(String[] args){
        Carro car = new Carro("Volkswagen", "Gol", 2022, 75000f, "Rosa", true, 145, (float)1.6);
        car.exibirDadosCarro();
        System.out.println();
        
        Caminhao cam = new Caminhao("Volkswagen", "Constellation 24.280", 2022, 500000f, "Verde neon", true, 3, 34, (float)325.6);
        cam.exibirDadosCaminhao();
        System.out.println();
        
        Proprietario p = new Proprietario();
        p.exibirDadosProprietario();
        Venda v = new Venda(12345, "01/04/2026", car, p);
        v.exibirVenda();
        System.out.println();
        
        Proprietario q = new Proprietario();
        q.exibirDadosProprietario();
        Venda e = new Venda(23465, "01/04/2026", cam, q);
        e.exibirVenda();
    }//fim main
}//fim classe
