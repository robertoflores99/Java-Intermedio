/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_encapsulamiento;

/**
 *
 * @author Roberto
 */
public class Leon extends Felino{
    public Leon(){
        super(8);
    }

    public void cazarPresaDobleTam(){
        System.out.println("CAzando una presa que me dobla de tamaño");
    }
    public double getdDañoPrimeraMordina() {
        return 5;
        //return dDañoPrimeraMordina;
    }
    public void cazar(){
        System.out.println("Cazando por el costado con daño " + super.getdDañoPrimeraMordina());
    }
}
