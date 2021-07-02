
package lab1;
import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
          
        Entrenador entrenador = new Entrenador();
        Deportista deportista = new Deportista();
        Menu menu = new Menu();
    	Scanner entrada = new Scanner(System.in);
       	int opcion = 1;
       
       while (opcion > 0 && opcion < 6){
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
		}
	}
}

