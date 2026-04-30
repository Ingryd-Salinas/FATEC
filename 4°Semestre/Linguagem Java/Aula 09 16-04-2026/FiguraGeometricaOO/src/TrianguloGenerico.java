
/**
 *
 * @author Ingryd Salinas
 */
public class TrianguloGenerico extends FiguraGeometrica {

    private double[][] vertices;

    public TrianguloGenerico(double[][] vertices) {
        this.vertices = vertices;
    }

    
    @Override
    public double calcularArea() {
        
        double diagPrincipal = (this.vertices[0][0] * this.vertices[1][1] * 1) + 
                               (this.vertices[0][1] * 1 * this.vertices[2][0]) + 
                               (1 * this.vertices[1][0] * this.vertices[2][1]);
                               
        double diagSecundaria = (this.vertices[0][1] * this.vertices[1][0] * 1) + 
                                (this.vertices[0][0] * 1 * this.vertices[2][1]) + 
                                (1 * this.vertices[1][1] * this.vertices[2][0]);

        double determinante = diagPrincipal - diagSecundaria;

        return Math.abs(determinante) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
       
        double distAB = calcularDistancia(this.vertices[0][0], this.vertices[0][1], 
                                          this.vertices[1][0], this.vertices[1][1]);
                                          
        double distBC = calcularDistancia(this.vertices[1][0], this.vertices[1][1], 
                                          this.vertices[2][0], this.vertices[2][1]);
                                          
        double distCA = calcularDistancia(this.vertices[2][0], this.vertices[2][1], 
                                          this.vertices[0][0], this.vertices[0][1]);

        return distAB + distBC + distCA;
    }


    private double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
