/**
 * Classe para implementar TODOS os métodos da interface pizza
 * @author Ingryd Salinas
 * @since Classe criada em 27/05/2026 - 10:54:46
 */
public class FrangoCatupiry implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza Frango com Catupiry");
        System.out.println("Frango, catupiry, molho de tomate");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 14 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Preço: R$ 50,00");
    }

}
