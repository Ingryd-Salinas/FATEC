/**
 * Classe para implementar TODOS os métodos da interface pizza
 * @author Ingryd Salinas
 * @since Classe criada em 27/05/2026 - 10:35:56
 */
public class Portuguesa implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza Portuguesa");
        System.out.println("Molho de tomate, queijo, presunto, ervilha, ovo cozido, milho, cebola e azeitonas");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 13 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Preço: R$ 56,00");
    }
    
}
