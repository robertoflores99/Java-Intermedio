/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_encapsulamiento;

/**
 *
 * @author Roberto
 */
public class Felino {
    //Atributos
    private String sRaza;
    private int iDimensiones;
    private int iEdad;
    private double dPeso;
    private String sColorPelo;
    private String nombre;
    private double dAlturaSaltoMetros;
    private double dDañoPrimeraMordina = 2;


    public Felino(double dAlturaSaltoMetros){
        this.dAlturaSaltoMetros = dAlturaSaltoMetros;
    }

    public double getdDañoPrimeraMordina() {
        return 10;
        //return dDañoPrimeraMordina;
    }

    public void setdDañoPrimeraMordina(double dDañoPrimeraMordina) {
        this.dDañoPrimeraMordina = dDañoPrimeraMordina;
    }

    public double getdAlturaSaltoMetros() {
        return dAlturaSaltoMetros;
    }

    public void setdAlturaSaltoMetros(double dAlturaSaltoMetros) {
        this.dAlturaSaltoMetros = dAlturaSaltoMetros;
    }

    public String getsRaza() {
        return sRaza;
    }

    public void setsRaza(String sRaza) {
        this.sRaza = sRaza;
    }

    public int getiDimensiones() {
        return iDimensiones;
    }

    public void setiDimensiones(int iDimensiones) {
        this.iDimensiones = iDimensiones;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public double getdPeso() {
        return dPeso;
    }

    public void setdPeso(double dPeso) {
        this.dPeso = dPeso;
    }

    public String getsColorPelo() {
        return sColorPelo;
    }

    public void setsColorPelo(String sColorPelo) {
        this.sColorPelo = sColorPelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    //Metodos
    public void saltar(){

    }


    public void jugar(){
        System.out.println("Jugando ...");
    }
    public void arañar(){

    }
    public void maullar(){

    }
    public void dormir(){

    }
    public void comer(){

    }
    public void cazar(){

        System.out.println("Cazando por detras con daño " + this.dDañoPrimeraMordina);
    }
}
