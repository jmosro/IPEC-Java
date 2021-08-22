package figurasgeometricas.area;

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
public class RomboArea implements FiguraBase {
    
    private double diagonalMenor;
    private double diagonalMayor;
    private double resultado;

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }
        
    public double getResultado() {
        return resultado;
    }

    @Override
    public void calcular() {
        // Fórmula del área del rombo
        // Área = Diagonal Menor * Diagonal Mayor
        resultado = diagonalMenor * diagonalMayor;
    }
    
}
