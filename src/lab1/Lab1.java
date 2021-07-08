
package lab1;
import java.util.Scanner;

public class Lab1 {

    static int cedulatemp;
    static Gimnasio lista=new Gimnasio();
    static int check=0;
    static Controlador c = new Controlador();
        
    public Gimnasio getLista(){
        return lista;
       
    }

    public static void main(String[] args) {
          /*int experienciaLaboral, String especialidad, int cedula, String nombre, int edad, char sexo, double peso, double altura*/
        Entrenador entrenador = new Entrenador(2,"Idk",27615745,"Miguel",20,'M',60,180);
        Deportista deportista = new Deportista(2,2,2,27615745,"Miguel",20,'M',70,180);
        Deportista deportista2 = new Deportista(2,2,2,28000000,"Miguel",20,'M',20,60);
        
        

        lista.agregarLista(deportista);
        lista.agregarLista(deportista2);
        lista.agregarLista(entrenador);        
      
        c.mostrarMenuPpal();
       new Validaciones().validarCedula("27615745");
	}
}

