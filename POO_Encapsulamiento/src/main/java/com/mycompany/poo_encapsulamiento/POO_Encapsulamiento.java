/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo_encapsulamiento;

/**
 *
 * @author Roberto
 */
public class POO_Encapsulamiento {

    public static void main(String[] args) {
        Gato felix = new Gato();
        //felix.nombre = "Felix Torres";
        felix.jugar();
        //felix.setNombre("Felix");
        //System.out.println("Gato: " + felix.nombre);
        System.out.println("Altura de Salto: " + felix.getdAlturaSaltoMetros());
        felix.cazar();

        System.out.println("---------------------- ");
        Leon raul = new Leon();
        //raul.nombre = "RAUL SANTILLAN";
        //System.out.println("Nombre: " + raul.nombre);
        raul.setNombre("RAUL SANTILLAN");
        System.out.println(raul.getNombre());
        System.out.println("Altura de Salto: " + raul.getdAlturaSaltoMetros());
        raul.cazarPresaDobleTam();
        raul.cazar();
    }
}
