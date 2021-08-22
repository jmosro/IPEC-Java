package figurasgeometricas.area;

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
public class PoligonoArea implements FiguraBase {
    
    private double lado;
    private int ladosTotales;
    private double apotema;
    private double resultado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setLadosTotales(int ladosTotales) {
        this.ladosTotales = ladosTotales;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getResultado() {
        return resultado;
    }

    @Override
    public void calcular() {
        // Fórmula del área del polígono
        // Perímetro = ( Perímetro * Apotema ) / 2
        // Perímetro = ( (Lado * Total de Lados) * Apotema ) / 2
        resultado = ( ( lado * (double) ladosTotales ) * apotema ) / 2;
    }
    
}
