/**
 * Classe para  implementar os métodos da interface pizza
 * @author Ingryd Salinas
 * @since Classe criada em 27/05/2026 - 11:48:26
 */
public class PãoCaseiro implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pão caseiro");
        System.out.println("Farinha de trigo, ovos, leite, sal, açúcar e fermento");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 45 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Preço: R$ 10,00");
    }

}
