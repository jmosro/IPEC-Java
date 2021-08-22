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
public class EsferaVolumen implements FiguraBase {
    
    private double radio;
    private double resultado;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getResultado() {
        return resultado;
    }

    @Override
    public void calcular() {
        // Fórmula del volumen de la esfera
        // Volumen = ( 4/3 ) * PI * Radio elevado a 3
        resultado = ( ((double)4)/((double)3) ) * Math.PI * Math.pow(radio, 3);
    }
    
}
