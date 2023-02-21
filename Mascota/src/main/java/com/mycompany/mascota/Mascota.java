/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mascota;

import java.util.Scanner;
import com.mycompany.mascota.Perro;

/**
 *
 * @author Roberto
 */
public class Mascota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre de un perro: ");
        String nombrePerro = scan.nextLine();
        Perro perro1 = new Perro(nombrePerro);
        perro1.setEdad(5);
        perro1.setColor("negro");
        perro1.setNumeroPatas(4);
        perro1.setRaza("pitbull");
        perro1.setVacunado(true);
        
        //imprimir
        System.out.println(perro1.getNombre()+" tiene "+perro1.getEdad()+" años");
        perro1.comer("croquetas");
        perro1.ladrar();
        perro1.correr();
        perro1.dormir();
    }
}
