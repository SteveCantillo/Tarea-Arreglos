
package practica_arreglos;
import javax.swing.JOptionPane;
/**
 *
 * @author mousl
 */
public class Practica_Arreglos {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamaño= Integer.parseInt(JOptionPane.showInputDialog
        ("Digite el tamaño del arreglo"));
        Arreglo arregloA = new Arreglo(tamaño);
        arregloA.rellenarArreglo();
        arregloA.imprimirArreglo();
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite "
                + "el numero que busca en el arreglo"));
        arregloA.buscarArreglo(numero);
 }
}


    
    

