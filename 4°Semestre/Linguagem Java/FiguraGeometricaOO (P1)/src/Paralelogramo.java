/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingryd Salinas
 */
public class Paralelogramo extends FiguraGeometrica{
    private double base;
    private double altura;
    private double ladoInclinado;

    public Paralelogramo(double base, double altura, double ladoInclinado) {
        this.base = base;
        this.altura = altura;
        this.ladoInclinado = ladoInclinado;
    }
    
    @Override
    public double calcularArea(){
        return this.base * this.altura;
    }
    
    @Override
    public double calcularPerimetro(){
            return 2 * (this.base + this.ladoInclinado);
    }
}
