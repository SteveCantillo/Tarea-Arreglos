/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03.arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author steve
 */
public class Ejercicio03ArreglosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de "
                + "matriz"));
        ClaseMatrizEjercicio03 tam = new ClaseMatrizEjercicio03(tamaño);
        
        tam.crearArreglo();
        tam.imprimirArreglo();
        tam.sumaEsquinas();
        tam.sumaDiagonal();
        tam.sumaDiagonalInver();
        tam.numMayor();
        
        
        
        
        
        
    }
    
}
