
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Classe para...
 * @author Ingryd Salinas
 * @since Classe criada em 13 de mai. de 2026 - 17:00:54
 */
public class Liquidificador implements Eletrodomestico{
    @Override
    public void ligar() {
        escolherOpcao();
    }

    private void escolherOpcao() {
        JOptionPane.showMessageDialog(null, "Velocidades: 1, 2 ou 3 ou 0 para desligar");
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma velocidade: "));
        
        switch(opc){
            case 0:
                desligar();
                break;
            case 1:
                System.out.println("Velocidade 1 ativada!");
                break;
            case 2:
                System.out.println("Velocidade 2 ativada!!");
                break;
            case 3:
                System.out.println("Velocidade 3 ativada!!!");
                break;
            default:
                String denovo = JOptionPane.showInputDialog("Deseja escolher outra velocidade?");
                if("sim".equals(denovo.toLowerCase())) //mesma coisa que denovo.toLowerCase() == "sim"
                    escolherOpcao();
        }
    }
    
    @Override
    public void desligar(){
    }
}
