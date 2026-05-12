
/**
 * Classe para o tratamento personalizado para as exceções da classe Divisão
 * @author Ingryd Salinas
 * @since Classe criada em 06/05/2026 - 10:51:27
 */
public class AnaliseNumerosExcecao extends Exception {

    // 1) Criar exceção para quando os números forem negativos
    public AnaliseNumerosExcecao() {
        super("Números não podem ser negativos!!");
    }
    
    // 2) Criar exceção para quando os números forem iguais
    public AnaliseNumerosExcecao(int v){
        super("Números são iguais!");
    }
    
    // 3) Criar exceção para quando b for maior que 100
    public AnaliseNumerosExcecao(float x){
        super("B é maior que 100");
    }

    /*Task for home:
    
    1)Escreva uma classe para tratar as exceções de peso calculando o IMC das pessoas.
    As exceções devem ser tratadas em uma classe separada, indicada pela cláusula Throws.*/
}
