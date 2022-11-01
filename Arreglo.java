/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author mousl
 */
public class Arreglo {

    private int tamaño;
    private int arregloN[];
    private int numero;

    public Arreglo(int tamaño) {
        this.tamaño = tamaño;
        this.arregloN = this.arregloN = new int[this.tamaño];
        this.numero = numero;
    }

    public void rellenarArreglo() {
        for (int i = 0; i < arregloN.length; i++) {
            arregloN[i] = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite el numero"));
        }
    }

    public void imprimirArreglo() {
        for (int i = 0; i < arregloN.length; i++) {
            System.out.println("Posición " + i + " valor " + arregloN[i]);
        }
    }

    public void buscarArreglo(int numero) {
        for (int i = 0; i < arregloN.length; i++) {
            if (numero == arregloN[i]) {
                System.out.println("El numero " + numero + " "
                        + "esta en la posicion " + i);
            } else if (numero != arregloN[i]) {
                System.out.println("No se encuentra en la posicion "+i);
            }
        }
    }
}

