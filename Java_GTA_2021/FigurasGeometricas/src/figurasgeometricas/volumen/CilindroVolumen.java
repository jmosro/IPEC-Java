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
public class CilindroVolumen implements FiguraBase {
    
    private double radio;
    private double altura;
    private double resultado;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
        
    public double getResultado() {
        return resultado;
    }

    @Override
    public void calcular() {
        // Fórmula del volumen del cilindro
        // Volumen = PI * Radio elevado al cuadrado * Altura
        resultado = Math.PI * Math.pow(radio, 2) * altura;
    }
    
}
