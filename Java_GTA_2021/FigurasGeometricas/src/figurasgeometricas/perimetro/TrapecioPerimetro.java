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
public class TrapecioPerimetro implements FiguraBase {
    
    private double ladoInclinadoIzquierda;
    private double ladoInclinadoDerecha;
    private double baseMayor;
    private double baseMenor;
    private double resultado;

    public void setLadoInclinadoIzquierda(double ladoInclinadoIzquierda) {
        this.ladoInclinadoIzquierda = ladoInclinadoIzquierda;
    }

    public void setLadoInclinadoDerecha(double ladoInclinadoDerecha) {
        this.ladoInclinadoDerecha = ladoInclinadoDerecha;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getResultado() {
        return resultado;
    }

    @Override
    public void calcular() {
        // Fórmula del perímetro del Trapecio
        // Perímetro = Lado Inclinado Izquierda + Lado Inclinado Derecha + Base Mayor + Base Menor
        resultado = ladoInclinadoIzquierda + ladoInclinadoDerecha + baseMayor + baseMenor;
    }
    
}
