
import javax.swing.JOptionPane;
/**
 * Classe concreta para implementar Eletrodomestico
 * @author Ingryd Salinas
 * @since Classe criada em 13 de mai. de 2026 - 17:11:44
 */
public class Microondas implements Eletrodomestico{
    @Override
    public void ligar(){
        System.out.println("O microondas foi ligado, observe que a luz tá acesa!");
    }
    
    public void ligar (int tempo) throws InterruptedException{
        int i;
        ligar();
        for(i = tempo; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000); //Suspende o processamento por 1 segundo, pois é declarado em milissegundos
        }
        desligar();
    }
    
    @Override
    public void desligar(){
        System.out.println("O microondas foi desligado, o aviso sonoro foi ativado!");
    }
    
    //Funcionalidade para o botão pipoca - tempo pré determinado
    public void pipoca() throws InterruptedException{
        System.out.println("Estourando pipoca!<3");
        ligar(15);
        System.out.println("Pipoca pronta!");
    }
    
    public void descongelamento() throws InterruptedException{
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de descongelamento: "));
        System.out.println("Descongelando... >o<");
        ligar(tempo);
        System.out.println("Descongelado! >o<");
    }
    
    //Quando o usuário escolhe o tempo:
    public void escolherTempo() throws InterruptedException{
        int tempo= Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo: "));
        System.out.println("Esquentando...");
        ligar(tempo);
        System.out.println("Quente!");
    }
}
