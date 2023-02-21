/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.informacion_personal;

/**
 *
 * @author Roberto
 */
public class Persona {
    String nombre;
    int edad;
    String sexo;
    double peso;
    double altura;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public int calcularIMC(double altura, double peso){
        double Pesoideal;
        Pesoideal = (peso*(altura*altura));
        if(Pesoideal<20){
            System.out.println("La persona tiene un peso ideal");
            return -1;
        }else if(Pesoideal>=20 && Pesoideal<=25){
            System.out.println("La persona tiene peso debajo del ideal");
            return 0;
        }else if(Pesoideal>25){
            System.out.println("La persona tiene sobrepeso");
            return 1;
        }
        return calcularIMC(altura, peso);
    }
    public static boolean esMayordeEdad(int edad){
        if(edad<18){
            return false;
        }else{
            return true;
        }
    }
    public void comprobarSexo(String sexo){
        if(sexo.equals("hombre")){
            System.out.println("El sexo es hombre" );
        }else if(sexo.equals("mujer")){
            System.out.println("El sexo es mujer" );
        }else{
            System.out.println("El sexo no existe" );
        }
    }
    
}
