/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacuentas;

import java.util.Scanner;

/**
 *
 * @author Maria
 */
public class ProgramaCuentas {

    public static void main(String[] args) {
        System.out.println("Este es el programa de cuentas");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del titular");
        String nombreTitular = scanner.next();
        
        System.out.println("¿Desea ingresar saldo? S) SI  N) NO");
        String opcionSaldo = scanner.next();
        
        if (opcionSaldo.equals("S")) 
        {
            System.out.println("Ingrese el saldo actual");
            double saldo = scanner.nextDouble();
            Cuenta cuenta1 = new Cuenta(nombreTitular, saldo);
            menuOpcion(cuenta1);
        }
        else
        {
            Cuenta cuenta2 = new Cuenta(nombreTitular);
            menuOpcion(cuenta2);
        }     
    }
    
       /**

     * Método para elegir qué operación se va a realizar con la cuenta 

     * @param cuenta El parámetro cuenta contiene la información de las propiedades ingresadas

     */
    public static void menuOpcion(Cuenta cuenta)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una operación: A) Ingresar B) Retirar S) Salir");
        String opcion = scanner.next();
            while (!opcion.equals("S")) {
            
                if (opcion.equals("A")) {
                    System.out.println("Ingrese la cantidad");
                    double cantidadIngresar = scanner.nextDouble();
                    
                    cuenta.ingresar(cantidadIngresar);
                    
                } else if (opcion.equals("B")) {
                    System.out.println("Ingrese la cantidad");
                    double cantidadRetirar = scanner.nextDouble();
                    cuenta.retirar(cantidadRetirar);
                } else {
                    opcion = "S";
                }
            
            System.out.println("Ingrese una operación: A) Ingresar B) Retirar S) Salir");
            opcion= scanner.next();
        }
    }
}
