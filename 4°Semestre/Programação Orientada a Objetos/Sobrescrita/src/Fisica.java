/**
 * Construção da classe filha (Fisica) de Pessoa
 * @author Ingryd Salinas
 * @since Classe criada em 22/04/2026
 */

public class Fisica extends Pessoa{
    
    int cpf;
    String tipoSanguineo;
    String nomeMae;
    float altura;

    public Fisica(String nome, int idade, int cpf, String tipoSanguineo, String nomeMae, float altura) {
        super(nome, idade);
        this.cpf = cpf;
        this.tipoSanguineo = tipoSanguineo;
        this.nomeMae = nomeMae;
        this.altura = altura;
    }
    
    //Método sobrescrito da superclasse Pessoa
    @Override
    public void exibirDados(){
        System.out.println(super.nome + " tem tipo sanguíneo " + this.tipoSanguineo);
    }
    
    public void exibirDados(String x){
        super.exibirDados();
        System.out.println("Nome da mãe: " + this.nomeMae);
        System.out.println("CPF: " + this.cpf);
    }
}
