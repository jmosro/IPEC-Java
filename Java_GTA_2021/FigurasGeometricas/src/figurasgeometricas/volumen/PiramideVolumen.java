package figurasgeometricas.volumen;

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
public class PiramideVolumen implements FiguraBase {
    
    private double ladoPentagonal;
    private double radioPentagonal;
    private double altura;
    private double resultado;

    public void setLadoPentagonal(double ladoPentagonal) {
        this.ladoPentagonal = ladoPentagonal;
    }

    public void setRadioPentagonal(double radioPentagonal) {
        this.radioPentagonal = radioPentagonal;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getResultado() {
        return resultado;
    }

    @Override
    public void calcular() {
        // Fórmula del volumen de la pirámide pentagonal
        // Volumen = ( Total Lados del Poligono en la Base * Lado Pentagonal Base *
        //             Radio Pentagonal Base como Apotema * Altura Pirámide ) / 6
        resultado = ( ((double)5) * ladoPentagonal * radioPentagonal * altura) / ((double)6);
    }
    
}
