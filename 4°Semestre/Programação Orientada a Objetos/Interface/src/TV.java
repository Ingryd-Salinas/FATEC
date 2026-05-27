import javax.swing.JOptionPane;
/**
 * Classe concreta para implementar todos os métodos abstratos da interface Eletrodomesticos
 * @author Ingryd Salinas
 * @since 18/05/2026 - 11:37:38
 */
public class TV implements Eletrodomestico{
    @Override
    public void ligar() {
        System.out.println("A TV foi ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("A TV foi desligada!");
    }
    
    //Método para simular a funcionalidade "soneca"
    public void soneca() throws InterruptedException{
        
        int i;
        ligar();
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("A TV deverá desligar em quanto tempo? "));
        System.out.println("Modo soneca ativado!");
        
        
        for(i = tempo; i > 0; i--){
             
            Thread.sleep(300);// Suspende o processamento por 1 segundo, pois é declarado em lilisegundos
            System.out.println(i);
            if(i == 30 || i == 15 || i == 5 || i == 1){
                System.out.println("Faltam " + i + " minutos!");
            }
        }
        
        desligar();
        
    }
}
