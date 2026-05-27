/**
 * Classe para implementar TODOS os métodos da interface Pizza
 * @author Ingryd Salinas
 * @since Classe criada em 27/05/2026 - 10:32:40
 */
public class Marguerita implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza Marguerita");
        System.out.println("Molho de tomate, mussarela, tomate seco, manjericão e azeitonas pretas");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 12 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Preço: R$ 50,00");
    }

}
