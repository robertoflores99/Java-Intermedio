/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo_game;

/**
 *
 * @author Roberto
 */
public class POO_Game {

    public static void main(String[] args) {
        

        Toyota toyo = new Toyota("PAS201"); //200
        toyo.encenderMotor();
        toyo.avanzar();
        System.out.println("Velocidad Máxima: " + toyo.getdVelocidadMaxima());

        Toyota toyo2 = new Toyota("ASP120");
        toyo2.setdVelocidadMaxima(300);
        System.out.println("Velocidad Máxima: " + toyo2.getdVelocidadMaxima());


        System.out.println("========================================== ");

        Nissan nis = new Nissan("220"); // 220
        nis.encenderMotor();
        nis.avanzar();

        System.out.println("Velocidad Máxima: " + nis.getdVelocidadMaxima());

/*
        Auto auto1 = new Auto();

        auto1.encenderMotor();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar(); auto1.avanzar();
        auto1.avanzar();
        auto1.avanzar();
        //auto1.frenarHastaDetener();
*/
    }
}
