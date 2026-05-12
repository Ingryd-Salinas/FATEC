
import javax.swing.JOptionPane;

/**
 * Classe para implementar exceções
 * @author Ingryd Salinas
 * @since Classe criada em 06/05/2026 - 09:56:07
 */
public class Divisao {
    public static void main(String[] args) throws AnaliseNumerosExcecao {
        String numA, numB;
        int option;
        float alt, peso;
        
        while(true){
        
            option = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Divisão \n\n 2 - Calcular IMC \n\n 3 - Sair"));
            switch(option){
                
                case 1:
                    numA = JOptionPane.showInputDialog("Digite A: ");
                    numB = JOptionPane.showInputDialog("Digite B: ");
                    dividir(numA, numB);
                    break;
                case 2:
                    alt = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite sua altura: "));
                    peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite seu peso: "));
                    imc(peso / (alt * alt));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Fechando o programa...");
                    return; //encerra automaticamente devido ao return encontrado
                default:
                    JOptionPane.showMessageDialog(null, "Digite apenas 1, 2 ou 3!!!");
                    break;
            }
            
        } //fim do while
        
    } //fim do main
    
    private static void dividir(String numA, String numB){
        
        try{
            int a = Integer.parseInt(numA); //variáveis devem estar dentro do try para a exceção do NumberFormatException ser executada
            int b = Integer.parseInt(numB);
            int divi = analiseDividir(a, b);
            JOptionPane.showMessageDialog(null, "Resultado da divisão: " + divi);
        }
        catch(ArithmeticException erro){
            JOptionPane.showMessageDialog(null, "Erro de divisão por zero - VERIFIQUE");
        }
        catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Digite apenas números!");
        }
        catch(DivisaoExcecao erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro do tipo: " + erro.toString());
        }
        catch(AnaliseNumerosExcecao erro){
            JOptionPane.showMessageDialog(null, "Erro do tipo " + erro.toString());
        }
        catch(Exception erro){ //Classe pai das exceções, capta exceções que você possa ter esquecido de especificar
            JOptionPane.showMessageDialog(null, "Ocorreu um erro do tipo " + erro.toString());
        }
        finally{ //equivale ao default do switch case
            JOptionPane.showMessageDialog(null, "Fim da execução!");
        }
    } //fim dividir

    private static void imc(float f) {
        try{
            
            JOptionPane.showMessageDialog(null, "Seu IMC é " + f + ".");
            classificacaoIMC(f);
            
        }catch(CalculoIMCExcecao erro){
            JOptionPane.showMessageDialog(null, erro.toString());
        }
        finally{ //equivale ao default do switch case
            JOptionPane.showMessageDialog(null, "Fim da execução!");
        }
    } //fim imc
    
    private static int analiseDividir(int a, int b) throws DivisaoExcecao, AnaliseNumerosExcecao{
        if(a < b)
            throw new DivisaoExcecao();
        if(a > 500)
            throw new DivisaoExcecao(1);
        if(a < 0 || b < 0)
            throw new AnaliseNumerosExcecao();
        if(a == b)
            throw new AnaliseNumerosExcecao(1);
        if(b > 100)
            throw new AnaliseNumerosExcecao(1.34f);
        
        return a / b;
    } //fim analise
    
    private static void classificacaoIMC(float c) throws CalculoIMCExcecao{
        if(c < 18.5)
            throw new CalculoIMCExcecao();
        else if(c < 25)
            throw new CalculoIMCExcecao(1);
        else if(c < 30)
            throw new CalculoIMCExcecao("a");
        else if(c < 35)
            throw new CalculoIMCExcecao(5.6f);
        else if(c < 40)
            throw new CalculoIMCExcecao(3.6);
        else
            throw new CalculoIMCExcecao(2, 6.7f);
    } //fim classificação

}
