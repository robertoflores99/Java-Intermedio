/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author Roberto
 */
public class PilotoAntiguo {
    private String sNombre;
    private int iEdad;
    private int iCantidadCopasGanadas = 20;

    public PilotoAntiguo(){
        iCantidadCopasGanadas = 10;
        System.out.println("Constructor de Piloto");
    }

    public void caminar(){
        System.out.println("Camiando ...");
    }

    public void correr(){
        System.out.println("Corriendo ...");
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public int getiCantidadCopasGanadas() {
        return iCantidadCopasGanadas;
    }

    public void setiCantidadCopasGanadas(int iCantidadCopasGanadas) {
        this.iCantidadCopasGanadas = iCantidadCopasGanadas;
    }
}
