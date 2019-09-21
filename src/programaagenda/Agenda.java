/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaagenda;

 
public class Agenda {
    
    private Contacto[] arrayContacto;
    
    public Agenda() {
        this.arrayContacto = new Contacto[15]; 
    }
    
    /**

     *  Este método Agrega un contacto a la agenda teniendo en cuenta, si no
    puede agregar más a la agenda debe de informar al usuario “AGENDA SIN ESPACIO” y no
    se pueden duplicar nombres en la agenda

    * @param c Informacion del contacto

     */
    public void agregarContacto(Contacto c)
    {
        
        if (!agendaLlena()) {
            System.out.println("Agenda sin espacio");
        }
        else if (buscarPorNombre(c.getNombre()))
        {
            System.out.println("El contacto con nombre "+c.getNombre()+" ya existe en la agenda"); 
        }
        else
        {
        
            for (int i = 0; i < arrayContacto.length; i++) {
                if (arrayContacto[i] == null) { 
                    arrayContacto[i] = c;
                    System.out.println("Registro agregado");
                    break; 
                }
            }
        }
    }
    
        /**

     *   Valida si existe o no el nombre de un contacto en la agenda

     * @param nombre Parámetro con el nombre que se va a buscar en la agenda

     */
    
        public Boolean buscarPorNombre(String nombre) {

        boolean existe = false;
            System.out.println("Nombre: "+nombre);
        for (int i = 0; i < arrayContacto.length; i++) 
        {
            if (arrayContacto[i]!=null) {
                if (arrayContacto[i].getNombre().equals(nombre.trim())) {
                    existe = true; 
                }  
            }
            
        }
        return existe;
    }
        
     /**

     *    Lista todos los contactos de la agenda.

     */
        public void listarTodos()
        {
           for (int i = 0; i < arrayContacto.length; i++) {
                    System.out.println(arrayContacto[i]);
             
            }
        
        }
        
    /**

     *    Me indica si la agenda ya esta llena o no

     */
         public Boolean agendaLlena()
        {
           boolean estadoAgenda = false;
           for (int i = 0; i < arrayContacto.length; i++) {
                    if(arrayContacto[i] == null)
                    {
                        estadoAgenda = true;
                    }
            }
           return estadoAgenda;
        }

         
      /**

     *     Me indica cuantos espacios libres hay en la agenda

     */
         public void espacioLibre(){
             
             int contador = 0;
             for (int i = 0; i < arrayContacto.length; i++) {
                    if(arrayContacto[i] == null)
                    {
                        contador = contador + 1;
                    }
            }
             
             System.out.println("Hay "+contador+" espacios libres en la agenda");
             contador = 0;
         }
    
}
