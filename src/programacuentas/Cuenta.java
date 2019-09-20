/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacuentas;

    
public class Cuenta {
   
   private String nombreTitular;
   private double saldo;
   
   
   
   public Cuenta(String nombreTitular) 
   {
       this.nombreTitular = nombreTitular;
       
   }
   
     public Cuenta(String nombreTitular, double saldo) 
   {
       this.nombreTitular = nombreTitular;
       this.saldo = saldo;
       
   }


    public void ingresar(double cantidad) {
        
        System.out.println("La cantidad es: "+cantidad);
        if (cantidad < 0) {
            System.out.println("No se puede adicionar una cantidad negativa al saldo actual");
            }
        else
        {
            this.saldo= this.saldo + cantidad;
            System.out.println("Hola "+this.nombreTitular+" su nuevo saldo es: "+this.saldo);
      
        }
    }
    
    public void retirar(double cantidad)
    {
        if (cantidad > this.saldo) {
            System.out.println("SALDO INSUFICIENTE!!");
        }
        else
        {
            this.saldo= this.saldo - cantidad;
            System.out.println("Hola "+this.nombreTitular+" su nuevo saldo es: "+this.saldo);
        }
        
    }
}
