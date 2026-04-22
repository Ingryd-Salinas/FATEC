
import javax.swing.JOptionPane;

/**
 * Classe para gerar objetos do tipo Ponto, Linha, Triângulo e Retângulo
 * Aula de sobrecarga, que é uma funcionalidade que permite definir múltiplos métodos com o mesmo nome 
 * dentro da mesma classe, desde que tenham listas de parâmetros diferentes (quantidade ou tipos).
 * @author Ingryd Salinas
 * @since 08/04/2026
 */
public class Figura {

    Integer a, b, c, d; /* Integer cria um objeto inteiro (diferente do tipo primitivo int). 
                        Integer pode ser nulo, int não, por isso está sendo usado nesse contexto */
    
    //Construtor genérico para qualquer tipo de objeto Figura
    public Figura(){
        String msg;
        msg = "1 - Ponto\n2 - Linha\n3 - Triângulo\n4 - Retângulo\n5 - Sair...";
        
        int opc = 0;
        opc = Integer.parseInt(JOptionPane.showInputDialog(msg));
        
        switch(opc){
            case 1: a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Ponto"));
                    break;
            case 2: a = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 1° valor da Linha"));
                    b = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 2° valor da Linha"));
                    break;
            case 3: a = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 1° valor do Triângulo"));
                    b = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 2° valor do Triângulo"));
                    c = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 3° valor do Triângulo"));
                    break;
            case 4: a = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 1° valor do Retangulo"));
                    b = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 2° valor do Retangulo"));
                    c = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 3° valor do Retangulo"));
                    d = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 4° valor do Retangulo"));
                    break;
            case 5: JOptionPane.showMessageDialog(null, "<html><font size='5'><font color = 'Red'>Programa finalizado com sucesso!!</font></html>");
                    //JOption aceita HTML, por isso dá para customizar assim
                    System.exit(0);
        }
    }
    
    //Constructor para um ponto
    public Figura(int a) {
        this.a = a;
    }

    //Constructor para uma linha
    public Figura(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //Construtor para um triângulo
    public Figura(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //Construtor para um retângulo
    public Figura(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    //Método genérico para identificar qualquer tipo de Figura
    public void exibirFigura(){
        if(a != null && b == null && c == null && d == null)
            exibirFigura(1);
        else if(a != null && b != null && c == null && d == null)
            exibirFigura(true);
        else if (a != null && b != null && c != null && d == null)
            exibirFigura("Dia");
        else
            exibirFigura('n', 2.78f);
    }
    
    //Método para exibir o valor do objeto ponto
    public void exibirFigura(int w) {
        JOptionPane.showMessageDialog (null, "é um ponto de valor " + a, "Ponto", 0);
    }

    //Método para exibir as coordenadas do objeto linha
    public void exibirFigura(boolean x) {
        JOptionPane.showMessageDialog (null, "é uma linha de coordenadas " + a + " e " + b, "Linha", 1);
        
    }
    
    //Método para exibir as medidas do objeto triãngulo
    public void exibirFigura(String k) {
        JOptionPane.showMessageDialog (null, "É um triângulo de coordenadas " + a + ", " + b + " e " + c, "Triângulo", 2);
        
    }
    
    //Método para exibir as medidas do objeto retãngulo
    public void exibirFigura(char j, float l) {
        JOptionPane.showMessageDialog (null, "É um retângulo com medições " + a + ", " + b + ", " + c + " e " + d, "Retângulo", 3);
        
    }
    
}//fim do main
