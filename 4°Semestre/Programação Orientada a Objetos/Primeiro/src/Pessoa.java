/**
 *
 * Classe modelo para gerar um objeto do tipo Pessoa
 * @author Ingryd Salinas
 * @since Classe criada em 18/03/2026
 */

public class Pessoa {
    String nome;
    int idade;
    float altura;
    float peso;
    boolean casado;
    
    //Constructor, método mais importante da classe, valores de referência devem ser passados na ordem que foram declarados
    public Pessoa(String nome, int idade, float altura, float peso, boolean casado){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.casado = casado;
    }
    
    //Método comum para exibir os dados de uma pessoa
    //Sempre nomear com verbos no infinitivo indicando ação
    public void exibirDadosPessoa(){
        System.out.println(); //mostra mensagem
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso + "kg");
        System.out.println("IMC: " + calcularIMC());
        System.out.println("Você é " + classificarIMC());
        System.out.println("Casado: " + (casado?"Sim":"Não")); //if ternário -> (condição)?(ação se for true):(ação se for false)
    }
    
    //Método comum para calcular o IMC de uma Pessoa
    public float calcularIMC(){
        return peso/(altura*altura);
    }
    
    //Método comum para classificar o IMC da Pessoa
    public String classificarIMC(){
        
        if(calcularIMC() < 16.0){
            return "magro(a) grau III";
        } 
        else if(calcularIMC() < 17.0){
            return "magro(a) grau II";
        } 
        else if (calcularIMC() < 18.5){
            return "magro(a) grau I";
        } 
        else if (calcularIMC() < 25.0){
            return "é Eutrófico(a)";
        }
        else if (calcularIMC() < 30.0){
            return "Pré-obeso(a)";
        }
        else if (calcularIMC() < 35.0){
            return "Obeso(a) moderado(a) (grau I)";
        }
        else if (calcularIMC() < 40.0){
            return "Obeso(a) severo(a) (grau II)";
        }
        else{
            return "Obeso(a) muito severo(a) (grau III)";
        }
    }
}
