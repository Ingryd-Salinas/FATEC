/**
 * Classe para o tratamento personalizado para as exceções da classe Divisão
 * @author Ingryd Salinas
 * @since Classe criada em 06/05/2026 - 10:30:46
 */
public class DivisaoExcecao extends Exception {

    public DivisaoExcecao() {
        super("O valor de B não pode ser maior do que A");
    }
    
    public DivisaoExcecao(int x){
        super("O valor de A não pode ser maior que 500");
    }

}
