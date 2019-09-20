/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaagenda;

import java.util.Scanner;

/**
 *
 * @author Maria
 */
public class ProgramaAgenda {
    


    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();
        Contacto contacto;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una opción: A) Agregar un contacto B) Buscar un contacto C) Listar agenda D)Ver si la agenda está llena E)Ver espacios libres de la agenda S)Salir");
        String opcion= scanner.next();
        
        
        
        while (!opcion.equals("S")) 
        {
            
            System.out.println("La opción seleccionada es: "+opcion);
            
            
            switch(opcion)
            {
                case "A":

             System.out.println("Ingrese el nombre");
             String nombre = scanner.next();
             System.out.println("Ingrese el telefono");
             String telefono = scanner.next();
             System.out.println("Ingrese el email");
             String email = scanner.next();
             contacto= new Contacto(nombre,telefono,email);
             agenda.agregarContacto(contacto);
      
            break;

             case "B":
             System.out.println("Ingrese el nombre a buscar");
             nombre = scanner.next();   
             
            if (agenda.buscarPorNombre(nombre)==true) {
                System.out.println("Se encontró el contacto en la agenda");
            }
            else
            {
                System.out.println("No se encontró el contacto en la agenda");
            }
                    
            break;
                
                case "C":   
                agenda.listarTodos();
            break;
               
                case "D":
                    
            if (agenda.agendaLlena() == true) {
                System.out.println("Hay espacio disponible en la agenda");
            }
            else
            {
                System.out.println("La agenda está llena");
            }
            break;
                
                case "E":
                agenda.espacioLibre();
                break;
                
            default:
                opcion= "S";
            }
            
            
            System.out.println("Ingrese una opción: A) Agregar un contacto B) Buscar un contacto C) Listar agenda D)Ver si la agenda está llena E)Ver espacios libres de la agenda");
            opcion= scanner.next();
        }
        
        
    }
   
    
}
