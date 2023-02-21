/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mascota;

/**
 *
 * @author Roberto
 */
public class Perro {
    public String nombre;
    public boolean vacunado;
    public int edad;
    public String raza;
    public String color;
    public int numeroPatas;
    
    //CONSTRUCTOR
    public Perro(String nombre) {
        this.nombre = nombre;
    }
    
    //ENCAPSULAMIENTO
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    
    //METODOS
    public void ladrar(){
        System.out.println(nombre+" esta ladrando");
    }
    public void correr(){
        System.out.println(nombre+" esta corriendo");
    }
    public void dormir(){
        System.out.println(nombre+" esta durmiendo");
    }
    public void comer(String comida){
        System.out.println(nombre+" esta comiendo "+comida);
    }
    
}
