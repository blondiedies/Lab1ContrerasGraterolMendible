
package lab1;
import java.util.Scanner;

public class Lab1 {

    static int cedulatemp;
    static Gimnasio lista=new Gimnasio();
    static int check=0;
        
    public Gimnasio getLista(){
        return lista;
    }

    public static void main(String[] args) {
          /*int experienciaLaboral, String especialidad, int cedula, String nombre, int edad, char sexo, double peso, double altura*/
        Entrenador entrenador = new Entrenador(2,"Idk",27615745,"Miguel",20,'M',60,180);
        Deportista deportista = new Deportista(2,2,2,27615745,"Miguel",20,'M',70,180);
        Deportista deportista2 = new Deportista(2,2,2,28000000,"Miguel",20,'M',20,60);
        Menu menu = new Menu();
    	Scanner entrada = new Scanner(System.in);
        lista.agregarLista(deportista);
        lista.agregarLista(deportista2);
        lista.agregarLista(entrenador);
       	int opcion = 1;

        
      
        new MenuPrincipal().setVisible(true);
       /*while (opcion > 0 && opcion < 6){
       	opcion = menu.principal();

       		switch(opcion){
       			case 1:
       				menu.introducirPersona(deportista, entrenador);
       				break;
       			case 2:
       				menu.imprimirDatos(deportista,entrenador);
       				break;
       			case 3:
       				menu.consultarSexo(deportista, entrenador);
       				break;
       			case 4:
       				menu.esMayorEdad(deportista, entrenador);
       				break;
       			case 5:
       				menu.opcionesEntrenador(deportista, entrenador);
       				break;
       			case 6:
       				menu.opcionDeportista(deportista, entrenador);
       				break;
       			default:
       				break;
       		}
		}*/
	}
}

