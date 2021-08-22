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
public class RectanguloPerimetro implements FiguraBase {
    
    private double base;
    private double altura;
    private double resultado;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getResultado() {
        return resultado;
    }

    @Override
    public void calcular() {
        // Fórmula del perímetro del rectángulo
        // Perímetro = (Base * 2) + (Altura * 2)
        resultado = (base * 2) + (altura * 2);
    }
    
}
