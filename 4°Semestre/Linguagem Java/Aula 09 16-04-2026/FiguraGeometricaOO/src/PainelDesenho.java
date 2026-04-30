
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D; 
import java.awt.Color;

/**
 *
 * @author Ingryd Salinas
 */

public class PainelDesenho extends JPanel{
    
    private String tipoFigura = "";
    private double largura = 0;
    private double altura = 0;
    private double vertices = 0;
    
    public void desenharFigura(String tipo, double larg, double alt){
        this.tipoFigura = tipo;
        this.largura = larg;
        this.altura = alt;
        this.repaint();//Método herdado que redesenha o JPanel quando ele for criado
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D canvas = (Graphics2D) g;   //canvas é uma classe de Graphics2D
        Color corSuave = new Color(173, 216, 230);
        canvas.setColor(corSuave);
        canvas.setStroke(new java.awt.BasicStroke(3));
        
        int w = (int) this.largura;  //conversão da largura para inteiro (casting)
        int h = (int) this.altura;
        
        if(tipoFigura.equals("retângulo") || tipoFigura.equals("quadrado")){
            canvas.fillRect(10, 10, w, h);
            
            canvas.setColor(Color.BLACK);
            canvas.drawRect(10, 10, w, h);
        }
    }
}
