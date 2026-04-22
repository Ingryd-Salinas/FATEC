/**
 * Classe para instanciar objetos do tipo Pessoa, Física e Jurídica
 * @author Ingryd Salinas
 * @since Classe criada em 22/04/2026
 */

public class Cadastro {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Gilberto", 45);
        Fisica pf = new Fisica("Marcella", 23, 3478695, "+O", "Silvia", 1.63f);
        Juridica pj = new Juridica("Faculdade de Tecnologia", 58, 254364501, "FATEC", 12000000f);
        
        p.exibirDados();
        pf.exibirDados();
        pf.exibirDados("xis");
        pj.exibirDados();
        pj.exibirDados(3);
    }
}
