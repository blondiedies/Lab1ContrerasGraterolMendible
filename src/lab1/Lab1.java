/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.Scanner;
/**
 *
 * @author Eduardo Graterol
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona pers = new Persona();
        
        pers.setCedula(25235855);
        pers.setNombre("eduardo");
        pers.setEdad(12);
        pers.setSexo('M');
        pers.setPeso(62);
        pers.setAltura(172);
        
        System.out.println("datos estaticos");
        pers.imprimirDatosPer();
         pers.esMayorDeEdad(pers.getEdad());
        System.out.println("\n");
        pers.comprobarSexo((char) pers.getSexo());
        
        
      
        Persona pers2 = new Persona();
        Entrenador trainer = new Entrenador();
        Deportista deport = new Deportista();
       
       int opcion;
       Scanner entrada = new Scanner(System.in);
    do{
        System.out.println(".......MENU......");
        System.out.println("1. Introducir persona");
        System.out.println("2. Imprimir Datos");
        System.out.println("3. Consultar si el sexo introducido es correcto");
        System.out.println("4. Consultar si esta persona es mayor de edad");
        System.out.println("5. Calcular el IMC de la persona");
        System.out.println("6. Opciones Entrenador");
        System.out.println("7. Opciones Deportista");
        System.out.println("8. Salir");
        System.out.print("Elija una opcion: ");
        opcion = entrada.nextInt();
        
        switch (opcion){
            case 1:   opcion = -1;                                      
                     do{
                      System.out.println("\n\n"); 
                      System.out.println("1. Agregar persona natural");
                      System.out.println("2. Agregar Entrenador");
                      System.out.println("3. Agregar Deportista"); 
                      System.out.println("4. Regresar al menu anterior");
                      System.out.print("Elija una opcion: ");
                      opcion = entrada.nextInt();
                         switch (opcion){
                             case 1: pers2.crearDatosPersona();
                                    break;
                             case 2: trainer.crearDatosPersona();
                                     trainer.agregarDatosEntrenador();
                                     break;
                             case 3: deport.crearDatosPersona();
                                     deport.agregarDatosDeportista();
                                     break;
                         }
                     }while (opcion != 4);
                      
                
            break;
            
            case 2: opcion = -1;                                                            
                    do{
                      System.out.println("\n\n"); 
                      System.out.println("1. Imprimir datos de Persona natural");
                      System.out.println("2. Imprimir datos de Entrenador");
                      System.out.println("3. Imprimir datos de Deportista"); 
                      System.out.println("4. Regresar al menu anterior");
                      System.out.print("Elija una opcion: ");
                      opcion = entrada.nextInt();
                         switch (opcion){
                             case 1: pers2.imprimirDatosPer();
                                    break;
                             case 2: trainer.imprimirDatosPer();
                                     trainer.imprimirDatosEntrenador();
                                     break;
                             case 3: deport.imprimirDatosPer();
                                     deport.imprimirDatosDeportista();
                                     break;
                         }
                     }while (opcion != 4);
            break;
            
            case 3: pers2.comprobarSexo((char) pers2.getSexo());
            break;
            
            case 4: pers2.esMayorDeEdad(pers2.getEdad());
                break;
                
            case 5: int r; r=pers2.calcularIMC();
            System.out.println("el valor obtenido es: "+r);
            break;
            
            case 6: //opciones entrenador
                opcion = -1;                                                            
                    do{
                      System.out.println("\n\nMENU ENTRENADOR"); 
                      System.out.println("1. Determinar rutina para deportista");
                      System.out.println("2. Determinar objetivos para deportista");
                      System.out.println("3. Regresar al menu anterior");
                      System.out.print("Elija una opcion: ");
                      opcion = entrada.nextInt();
                         switch (opcion){
                             case 1: 
                                 trainer.determinarRutina(deport.tipoEjerString(),deport.calcularIMC()); //rutina
                                    break;
                             case 2: 
                                 trainer.determinarRutina(deport.calcularIMC(), deport.tipoEjerString()); //objetivos
                                     break;
                         }
                     }while (opcion != 3);                
            break;
            
            case 7: //opciones deportista
                opcion = -1;                                                            
                    do{
                      System.out.println("\n\nMENU DEPORTISTA"); 
                      System.out.println("1. Calcular porcentaje de grasa corporal");
                      System.out.println("2. Verificar ritmo cardiaco");
                      System.out.println("3. Regresar al menu anterior");
                      System.out.print("Elija una opcion: ");
                      opcion = entrada.nextInt();
                         switch (opcion){
                             case 1: 
                                 deport.grasaCorp();
                                    break;
                             case 2: 
                                 deport.comprobacion();
                                 
                                     break;
                         }
                     }while (opcion != 3);
                
            break;
        }
        
        }while(opcion != 8);
    
}
}
