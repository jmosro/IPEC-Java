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
public class CuadradoPerimetro implements FiguraBase {
    
    private double lado;
    private double resultado;

    public void setLado(double lado) {
        this.lado = lado;
    }
        
    public double getResultado() {
        return resultado;
    }

    @Override
    public void calcular() {
        // Fórmula del perímetro del cuadrado
        // Perímetro = Lado * 4
        resultado = lado * 4;
    }
    
}
