/**
 * Classe para implementar TODOS os métodos da interface pizza
 * @author Ingryd Salinas
 * @since Classe criada em 27/05/2026 - 11:00:43
 */
public class Banoffee implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza Banoffee");
        System.out.println("Doce de leite, rodelas de banana, chantilly e uma pitada generosa de canela");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 9 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Preço: R$ 70,00");
    }

}
