/**
 * Classe para implementar TODOS os métodos da interface pizza
 * @author Ingryd Salinas
 * @since Classe criada em 27/05/2026 - 11:01:27
 */
public class RomeuJulieta implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza Romeu e Julieta");
        System.out.println("Mussarela, goiabada e requeijão cremoso");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 9 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Preço: 70,00");
    }

}
