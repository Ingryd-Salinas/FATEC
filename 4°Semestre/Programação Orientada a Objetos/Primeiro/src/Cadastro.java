/**
 * Classe para instanciar objetos do tipo Pessoa
 * @author Ingryd Salinas
 * @since Classe criada em 18/03/2026
 */
public class Cadastro {
    //static método que não precisa ser instanciado
    //nome de método sempre começa com minúscula
    //array sempre é declarado como string
    public static void main(String []fatec){
        Pessoa p, xis; //variável de referência, serve para referenciar o objeto em memória (é como um ponteiro)
        p = new Pessoa("Ingryd", 23, 1.64f, 62.0f, false); //f indica float, pois se colocar apenas o número, o java reconhece como double ao invés de float
        Pessoa x = new Pessoa("Mariana", 30, 1.62f, 49.0f, true); //criando e instanciando a variável ao mesmo tempo
        //Pessoa pessoa = new Pessoa("Sebastião", 48, 1.75f, true); 
        
        p.exibirDadosPessoa();
        //x.exibirDadosPessoa();
        //pessoa.exibirDadosPessoa();
        //p = pessoa;
        x.exibirDadosPessoa();
        Compara comparação = new Compara(p, x);
        
        /*comparação.compararPeso(p, x);
        comparação.compararAltura(p, x);
        comparação.compararIMC(p, x);
        comparação.compararIdade(p, x);*/
       
    }
}
