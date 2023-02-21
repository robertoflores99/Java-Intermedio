/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.banco;

import java.util.Scanner;
import com.mycompany.banco.Cuenta;
/**
 *
 * @author Roberto
 */
public class Banco {
    
    static boolean operaciones(){
        Scanner scan = new Scanner(System.in);
        String decision;
        System.out.println("Desea realizar otra operacion: ");
        decision = scan.nextLine();
        if(decision.equals("si")){
            return true;
        }else if(decision.equals("no")){
            return false;
        }
        return operaciones();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresar el nombre del titular: ");
        String titular = scan.nextLine();
        int dinero;
        boolean operacion=true;
        String decision, ingoret;
        Cuenta banco1 = new Cuenta(titular);
        while (operacion=true) {
            System.out.println("¿Desea ingresar o retirar dinero?: ");
            ingoret = scan.nextLine();
            if(ingoret.equals("ingresar")){
                System.out.println("Ingresa la cantidad que desea ingresar: ");
                dinero = scan.nextInt();
                banco1.ingresar(dinero);
            }else if(ingoret.equals("retirar")){
                System.out.println("Ingresa la cantidad que desea retirar: ");
                dinero = scan.nextInt();
                banco1.retirar(dinero);
                
            }
            operacion=operaciones();
            System.out.println("El dinero de la cuenta es: "+banco1.getCantidad());
        }
    }
}
