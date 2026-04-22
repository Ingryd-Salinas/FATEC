
import javax.swing.JOptionPane;

/**
 * Classe para instanciar objetos do tipo Figura
 * @author Ingryd Salinas
 * @since 08/04/2026
 */

public class Desenho {
    public static void main(String[] args) {
        
        /* Configurando uma caixa de diálogo para mensagem
        JOptionPane.showMessageDialog(1, 2, 3, 4);
        1 - this/null;
        2 - Texto que aparece dentro de Janela
        3 - Título da Janela
        4 - Ícone - pode variar de -1 a 3
        Variação:
        -1 - sem ícone
        0 - Error - Ícone de erro
        1 - Information - Informação para o usuário
        2 - Warning - Aviso ao usuário
        3 - Question - Interrogação - Usuário entra com dado*/
        JOptionPane.showMessageDialog(null, "Mensagem ao usuário", "Ingryd", 1);
        
        while(true){
            Figura f = new Figura();
            f.exibirFigura();
        }
        
        
        
    }
}//fim do main
