/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03.arreglos;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author steve
 */
public class ClaseMatrizEjercicio03 {

    private int tamaño;
    private int matriz[][];

    public ClaseMatrizEjercicio03(int tamaño) {
        this.tamaño = tamaño;
        this.matriz = new int[this.tamaño][this.tamaño];
    }

    public void crearArreglo() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public void imprimirArreglo() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void sumaEsquinas() {
        int suma = 0;
        suma = matriz[0][0] + matriz[0][tamaño - 1] + matriz[tamaño - 1][0]
                + matriz[tamaño - 1][tamaño - 1];
        System.out.println("La suma de las esquinas es " + suma);
    }

    public void sumaDiagonal() {
        int suma = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        for (k = 0; k < tamaño; k++) {
            suma += matriz[i][j];
            i += 1;
            j += 1;
        }
        System.out.println("La suma de la diagonal es " + suma);
    }

    public void sumaDiagonalInver() {
        int suma = 0;
        int i = 0;
        int j = tamaño - 1;
        int k = 0;
        for (k = 0; k < tamaño; k++) {
            suma += matriz[i][j];
            i += 1;
            j -= 1;
        }
        System.out.println("La suma de la diagonal inversa es " + suma);
    }

    public void numMayor() {
        int numMayor = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (numMayor < matriz[i][j]) {
                    numMayor = matriz[i][j];
                }
            }
        }
        System.out.println("El número mayor de la matriz es " + numMayor);
    }

}
