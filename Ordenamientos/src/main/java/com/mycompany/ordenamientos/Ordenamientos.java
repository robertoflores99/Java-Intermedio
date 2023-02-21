/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ordenamientos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto
 */
public class Ordenamientos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arreglo [], nElementos, aux, pos;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos: "));
        arreglo = new int[nElementos];
        for(int i = 0; i<nElementos;i++){
            System.out.println((i+1)+". Digite un numero: ");
            arreglo[i] = scan.nextInt();
        }
        /*
        //Metodo Burbuja (numero actual es mayor al siguiente)
        for(int i=0;i<(nElementos-1);i++){
            for(int j=0;j<(nElementos-1);j++){
                if(arreglo[j]>arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        */

        //Ordenamiento por Insercion (numero siguiente es mayor al actual)
        for(int i=0;i<nElementos;i++){
            pos = i;
            aux = arreglo[i];
            while ((pos>0)&&(arreglo[pos-1]>aux)) {                
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        }
        //Mostrar el arreglo de forma creciente
        System.out.println("Ordenamiento creciente");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("");
        System.out.println("Ordenamiento decreciente");
        for (int i = (nElementos-1); i >=0; i--) {
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("");
    }
}
