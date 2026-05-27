
import static java.time.Clock.system;
import javax.swing.JOptionPane;

/**
 * Classe para exibir um menu de opções para o cliente
 * @author Ingryd Salinas
 * @since Classe criada em 27/05/2026 - 11:09:17
 */
public class Menu {
    
    Forno forno = new Forno();
    Pizza pizza;

    public Menu() {
        String msg;
        msg = "1 - Frango com Catupiry"
            + "\n2 - Marguerita"
            + "\n3 - Portuguesa"
            + "\n4 - Quatro Queijos"
            + "\n5 - Banoffee"
            + "\n6 - Pistache"
            + "\n7 - RomeuJulieta"
            + "\n8 - Sensação"
            + "\n9 - Pão Caseiro"
            + "\n10 - Sair";
        
        int opção = 0;
        while(true){
        opção = Integer.parseInt(JOptionPane.showInputDialog(null, msg, "Escolha sua pizza", 3));
        
            switch(opção){
                case 1:
                    pizza = new FrangoCatupiry();
                    break;
                case 2:
                    pizza = new Marguerita();
                    break;
                case 3:
                    pizza = new Portuguesa();
                    break;
                case 4:
                    pizza = new QuatroQueijos();
                    break;
                case 5:
                    pizza = new Banoffee();
                    break;
                case 6:
                    pizza = new Pistache();
                    break;
                case 7:
                    pizza = new RomeuJulieta();
                    break;
                case 8:
                    pizza = new Sensação();
                    break;
                case 9:
                    pizza = new PãoCaseiro();
                    break;
                case 10:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Sabor inexistente!!");
                    opção = 0;
            
            }//fim do switch
        
            //Objeto polimórfico que prepara qualquer tipo de pizza
            if(opção != 0)
                forno.preparar(pizza);
            System.out.println("====================================================");
            
        }//fim while
    }//fim do construtor

}//fim da classe
