/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author Roberto
 */
public class Cuenta {
    public String titular;
    public double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public void ingresar(double cantidad){
        if(cantidad<0){
            System.out.println("La cantidad ingresada es negativa, porfavor ingrese una cantida mayor o igual a 0");
        }else{
            setCantidad(cantidad+getCantidad());
            System.out.println("La cantidad ingresada es: "+cantidad);
        }
    }
    public void retirar(double cantidad){
        if(cantidad<0){
            System.out.println("La cantidad ingresada es negativa, porfavor ingrese una cantida mayor o igual a 0");
        }else{
            setCantidad(getCantidad()-cantidad);
            System.out.println("La cantidad retirada es: "+cantidad);
        }
    }
}
