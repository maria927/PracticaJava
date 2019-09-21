/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacuentas;

    
public class Cuenta {
   
   private String nombreTitular;
   private double saldo= 1000000;
   
   
   
   public Cuenta(String nombreTitular) 
   {
       this.nombreTitular = nombreTitular;
       
   }
   
     public Cuenta(String nombreTitular, double saldo) 
   {
       this.nombreTitular = nombreTitular;
       this.saldo = saldo;
       
   }


            /**

     * Este método recibe una cantidad como parámetro el cual sumará a la cuenta actual. Si la cantidad en negativa no debe de sumar nada 

     * @param cantidad Indica la cantidad que se ingresará a la cuenta

     */
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
    
             /**

     *  Este método recibe una cantidad como parámetro el cual restara a la cuenta actual. Si la cantidad a retirar es mayor a la cantidad actual no se puede restar y debe de sacar un mensaje de “SALDO INSUFICIENTE”

     * @param cantidad Indica la cantidad que se retirará de la cuenta

     */
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
