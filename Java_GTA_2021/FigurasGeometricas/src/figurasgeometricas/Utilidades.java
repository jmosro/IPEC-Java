package figurasgeometricas;

import javax.swing.JOptionPane;

/**
 * IPEC Santo Domingo de Heredia
 * Informática en Desarrollo de Software
 * Proyecto Figuras Geométricas
 * Date: 2021-feb-28
 * @author  Jesús Alberto Moscoso Agüero
 * @author  J. Mosro - jmosro.14@gmail.com
 * @version 1
*/
public class Utilidades {
    public static boolean isValidacionCorrectaStringADouble(String dato) {
        final String titulo = "Validación de datos";
        if(dato.isEmpty()) { // String dato es campo vacìo
            JOptionPane.showMessageDialog(null, "No debe dejar campos vacios.", titulo, 
                                              JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else {
            // try ... catch() // En caso de error al convertir el String, el catch() atrapa la excepción
            try { 
                // Double.parseDouble(String) - convertir de String a Double 
                if(Double.parseDouble(dato) < 0) { // Convertir String dato a tipo double y comparar si es negativo
                    JOptionPane.showMessageDialog(null, "Debe introducir valores positivos.", titulo,
                                                  JOptionPane.INFORMATION_MESSAGE);
                    return false;
                }
            } catch(NumberFormatException ex) { // Error: String dato no tiene formato de número con decimales
                    JOptionPane.showMessageDialog(null, "Debe introducir un número con formato correcto.", titulo,
                                                  JOptionPane.ERROR_MESSAGE);
                    return false;
            }
        }
        return true;
    }
}
