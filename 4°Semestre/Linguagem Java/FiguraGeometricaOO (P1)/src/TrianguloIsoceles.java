/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingryd Salinas
 */

public class TrianguloIsoceles extends TrianguloRetangulo {

    private double base;

    public TrianguloIsoceles(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularPerimetro() {
        
        double metadeDaBase = this.base / 2.0;
        double ladoInclinado = Math.sqrt(Math.pow(metadeDaBase, 2) + Math.pow(this.altura, 2));
        return this.base + (2 * ladoInclinado);
    }
}
