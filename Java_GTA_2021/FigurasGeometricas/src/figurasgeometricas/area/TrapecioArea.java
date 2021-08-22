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
public class TrapecioArea implements FiguraBase {
    
    private double baseMayor;
    private double baseMenor;
    private double altura;
    private double resultado;

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getResultado() {
        return resultado;
    }

    @Override
    public void calcular() {
        // Fórmula del área del trapecio
        // Área = ( Altura * Base Mayor * Base Menor ) / 2
        resultado = (altura * baseMayor * baseMenor) / 2;
    }
    
}
