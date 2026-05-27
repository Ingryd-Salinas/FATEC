/**
 * Classe para implementar TODOS os métodos da interface pizza
 * @author Ingryd Salinas
 * @since Classe criada em 27/05/2026 - 10:39:22
 */
public class Pistache implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza de Pistache");
        System.out.println("Pistache, sorvete de pistache e calda de chocolate branco");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 11 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Preço: R$ 80,00");
    }

}
