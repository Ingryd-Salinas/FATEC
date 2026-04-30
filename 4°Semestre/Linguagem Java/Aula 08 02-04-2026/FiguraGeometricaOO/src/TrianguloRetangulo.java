/**
 *
 * @author Ingryd Salinas
 */
public class TrianguloRetangulo extends FiguraGeometrica{
    
    protected double largura;
    protected double altura;

    public TrianguloRetangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return (this.largura * this.altura) / 2;
    }
    
    @Override
    public double calcularPerimetro(){
        double hipotenusa = Math.sqrt(Math.pow(this.largura, 2) + Math.pow(this.altura, 2));
        return this.largura + this.altura + hipotenusa;
    }
}
