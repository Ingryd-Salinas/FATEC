/**
 * Classe para implementar TODOS os métodos da interface pizza
 * @author Ingryd Salinas
 * @since Classe criada em 27/05/2026 - 10:57:13
 */
public class Sensação implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza Sensação");
        System.out.println("Morango picado com chocolate amargo derretido e leite condensado");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 9 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Preço: R$ 65,00");
    }
    
}
