/**
 *
 * @author Ingryd Salinas
 * @since 
 */
public class Cliente {
    String nome;
    String cpf;
    String nascimento;
    String estado;
    String sexo;
    String observações;
    boolean esportes;
    boolean videogame;
    boolean leitura;
    boolean dança;
    boolean marcenaria;
    
    //Construtor vazio
    public Cliente(){
        
    }

    //Construtor do objeto Cliente em memória
    public Cliente(String nome, String cpf, String nascimento, String estado, String sexo, String observações, boolean esportes, boolean videogame, boolean leitura, boolean dança, boolean marcenaria) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.estado = estado;
        this.sexo = sexo;
        this.observações = observações;
        this.esportes = esportes;
        this.videogame = videogame;
        this.leitura = leitura;
        this.dança = dança;
        this.marcenaria = marcenaria;
    }
    
    
    
}
