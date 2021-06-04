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
public class Entrenador extends Persona{
    private String experienciaLaboral; 
    private String especialidad;
    Scanner entrada = new Scanner(System.in);

    //CONSTRUCTOR CON PARAMETROS
    public Entrenador(String experienciaLaboral, String especialidad, int cedula, String nombre, int edad, char sexo, float peso, float altura) {
        super(cedula, nombre, edad, sexo, peso, altura);
        this.experienciaLaboral = experienciaLaboral;
        this.especialidad = especialidad;
    }

    //CONSTRUCTOR SIN PARAMETROS
    public Entrenador(){      
    }
        

    public String getExperienciaLaboral() {
        return experienciaLaboral;
    }

    public void setExperienciaLaboral(String experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


  
   public void agregarDatosEntrenador(){

        System.out.print("introduzca su experiencia Laboral: ");
        experienciaLaboral = entrada.nextLine();
      
        
        System.out.print("introduzca su Especialidad: ");
        especialidad = entrada.nextLine();
     
        
   }
       
    public void imprimirDatosEntrenador(){
        System.out.println("Experiencia Laboral: "+experienciaLaboral);
        System.out.println("Especialidad: "+especialidad);
    }
    
    /*metodo sobrecargado: dependiendo del IMC del 
    deportista, porcentaje de grasa corporal y tipo de ejercicio, sugerirá qué
    rutina practicar o cuales objetivos cumplir (2 metodos)
   */
    public void determinarRutina(String tipoEjer){
        
    }
    
    public void determinarRutina(int grasaCorpo){
        //mujer: <25% delgada, >30% exceso; hombres: <15% delgada, >20% exceso
    
    }
}
