/**
 * Classe para...
 * Polimorfismo: Objeto que comporta-se de acordo com o parãmetro de entrada
 * Forno mostra o conceito polimórfico
 * @author Ingryd Salinas
 * @since Classe criada em 27/05/2026 - 10:43:37
 */
public class Forno {

    public void preparar(Pizza pizza){
        pizza.montar();
        pizza.assar();
        pizza.cobrar();
    }
    
}
