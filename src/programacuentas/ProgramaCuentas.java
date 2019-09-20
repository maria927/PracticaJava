/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacuentas;

import java.util.Scanner;

/**
 *
 * @author malzatee
 */
public class ProgramaCuentas {

    public static void main(String[] args) {
        System.out.println("Este es el programa de cuentas");
        Scanner scanner = new Scanner(System.in);
        double saldo = 3500000;
        System.out.println("Ingrese el nombre del titular");
        String nombre = scanner.next();
        System.out.println("Ingrese una operación: A) Ingresar B) Retirar S) Salir");
        String opcion = scanner.next();
        Cuenta cuenta2 = new Cuenta(nombre, saldo);
        
            while (!opcion.equals("S")) {
            
                if (opcion.equals("A")) {
                    System.out.println("Ingrese la cantidad");
                    double cantidadIngresar = scanner.nextDouble();
                    
                    cuenta2.ingresar(cantidadIngresar);
                    
                } else if (opcion.equals("B")) {
                    System.out.println("Ingrese la cantidad");
                    double cantidadRetirar = scanner.nextDouble();
                    cuenta2.retirar(cantidadRetirar);
                } else {
                    opcion = "S";
                }
            
            System.out.println("Ingrese una operación: A) Ingresar B) Retirar S) Salir");
            opcion= scanner.next();
        }
         
    }
    
}
