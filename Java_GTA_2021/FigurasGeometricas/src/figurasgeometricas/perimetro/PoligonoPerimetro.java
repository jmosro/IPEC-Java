package figurasgeometricas.perimetro;

import figurasgeometricas.FiguraBase;

/**
 * IPEC Santo Domingo de Heredia
 * Informática en Desarrollo de Software
 * Proyecto Figuras Geométricas
 * Date: 2021-abr
 * @author  Jesús Alberto Moscoso Agüero
 * @author  J. Mosro - jmosro.14@gmail.com
 * @version 1
*/
public class PoligonoPerimetro implements FiguraBase {
    
    private double lado;
    private int ladosTotales;
    private double resultado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setLadosTotales(int ladosTotales) {
        this.ladosTotales = ladosTotales;
    }

    public double getResultado() {
        return resultado;
    }

    @Override
    public void calcular() {
        // Fórmula del perímetro del polígono
        // Perímetro = Lado * Total de Lados
        resultado = lado * (double) ladosTotales;
    }
    
}
