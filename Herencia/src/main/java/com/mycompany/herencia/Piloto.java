/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author Roberto
 */
public class Piloto extends Persona{
    private int iCantidadCopasGanadas = 20;

    public Piloto(){
        iCantidadCopasGanadas = 10;
        System.out.println("Constructor de Piloto");
    }
    public void conducir(){
        //super.conducir();
        System.out.println("Manejando en modo extremo");

    }

    public int getiCantidadCopasGanadas() {
        return iCantidadCopasGanadas;
    }

    public void setiCantidadCopasGanadas(int iCantidadCopasGanadas) {
        this.iCantidadCopasGanadas = iCantidadCopasGanadas;
    }
}
