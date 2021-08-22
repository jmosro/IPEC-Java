package figurasgeometricas.volumen;

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
public class ParalelepipedoVolumen implements FiguraBase {
    
    private double largo;
    private double base;
    private double altura;
    private double resultado;

    public void setLargo(double largo) {
        this.largo = largo;
    }

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
        // Fórmula del volumen del paralelepípedo
        // Volumen = Largo * Base * Altura
        resultado = largo * base * altura;
    }
    
}
