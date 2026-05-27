/**
 * Classe para implementar TODOS os métodos da interface pizza
 * @author Ingryd Salinas
 * @since Classe criada em 27/05/2026 - 10:26:55
 */
public class QuatroQueijos implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza Quatro Queijos");
        System.out.println("Mussarela, catupiry, provolone, parmesão, azeitonas");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 15 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Preço: R$ 60,00");
    }
    
    
}
