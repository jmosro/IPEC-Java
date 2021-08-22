package figurasgeometricas.perimetro;

import figurasgeometricas.FiguraBase;

/**
 * IPEC Santo Domingo de Heredia
 * Informática en Desarrollo de Software
 * Proyecto Figuras Geométricas
 * Date: 2021-mar
 * @author  Jesús Alberto Moscoso Agüero
 * @author  J. Mosro - jmosro.14@gmail.com
 * @version 1
*/
public class TrianguloPerimetro implements FiguraBase {
    
    private double lado1;
    private double lado2;
    private double lado3;
    private double resultado;

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getResultado() {
        return resultado;
    }

    @Override
    public void calcular() {
        // Fórmula del perímetro del triángulo
        // Perímetro = Lado1 + Lado2 + Lado3
        resultado = lado1 + lado2 + lado3;
    }
    
}
