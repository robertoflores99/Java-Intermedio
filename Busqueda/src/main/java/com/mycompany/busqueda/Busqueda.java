/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.busqueda;

import javax.swing.JOptionPane;

/**
 *
 * @author Roberto
 */
public class Busqueda {

    public static void main(String[] args) {
        int arreglo[]={9,1,8,2,5};
        int dato;
        boolean bandera=false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar: "));
        int i=0;
        //Busqueda secuencial
        while (i<5 && bandera==false) {            
            if(arreglo[i]==dato){
                bandera=true;
            }
            i++;
        }
        if(bandera==false){
            JOptionPane.showMessageDialog(null, "El numero ingresado no se encuentra en el arreglo");
        }else{
            JOptionPane.showMessageDialog(null,"El numero ha sido encontrado en la posicion: "+(i-1));
        }
    }
}
