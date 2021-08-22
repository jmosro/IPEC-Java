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
public class CirculoArea implements FiguraBase {
    
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
        // Fórmula del área del círculo
        // Área = PI * Radio al Cuadrado
        resultado = Math.PI * Math.pow(radio, 2);
    }
    
}
