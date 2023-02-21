/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.informacion_personal;

import java.util.Scanner;

/**
 *
 * @author Roberto
 */
public class Informacion_Personal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = scan.nextInt();
        System.out.println("Ingrese el sexo: ");
        String sexo = scan.next();
        System.out.println("Ingrese el peso: ");
        double peso = scan.nextDouble();
        System.out.println("Ingrese la altura: ");
        double altura = scan.nextDouble();
        Persona persona1 = new Persona(nombre);
        persona1.setAltura(altura);
        persona1.setEdad(edad);
        persona1.setPeso(peso);
        persona1.setSexo(sexo);
        persona1.calcularIMC(altura, peso);
        persona1.comprobarSexo(sexo);
        boolean mayor;
        mayor = persona1.esMayordeEdad(edad);
        if(mayor = true){
            System.out.println("Es mayor de edad");
        }else if (mayor = false){
            System.out.println("Es menor de edad");
        }
    }
}
