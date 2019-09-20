/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaagenda;

 
public class Agenda {
    
    private Contacto[] arrayContacto;
    
    public Agenda() {
        this.arrayContacto = new Contacto[3]; 
    }
    
    public void agregarContacto(Contacto c)
    {
        
        if (!agendaLlena()) {
            System.out.println("Agenda sin espacio");
        }
//        else if (buscarPorNombre("maria"))
//        {
//            System.out.println("El contacto con nombre  ya existe en la agenda"); 
     //   }
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
        
        public void listarTodos()
        {
           for (int i = 0; i < arrayContacto.length; i++) {
                    System.out.println(arrayContacto[i]);
             
            }
        
        }
        
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
