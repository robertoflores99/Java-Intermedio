/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo;

import java.util.Scanner;

import com.mycompany.poo.Gato;

/**
 *
 * @author Roberto
 */
public class POO {

    public static void main(String[] args) {
        //Declaramos un objeto del tipo Gato. Tambien se está creando una instancia del objeto Gato-
        Gato g;

        System.out.println(".....");

        g = new Gato("Cocker");

        g.jugar();

        Scanner cmd = new Scanner(System.in);
    }
}
