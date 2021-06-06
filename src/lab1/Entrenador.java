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
    
    public int determinarPorcentaje(int grasaCorpo){
      
        switch(sexoNum()){
           case 0: //mujer
               if (grasaCorpo<25){
                   return 0;
               }
               if (grasaCorpo>30){
                   return 2;
               }
               if ((grasaCorpo>=25)&&(grasaCorpo<=30)){
                   return 1; }
               break;
           case 1://hombre
               if (grasaCorpo<15){
                   return 0;
               }
               if (grasaCorpo>20){
                   return 2;
               }
               if ((grasaCorpo>=25)&&(grasaCorpo<=30)){
                   return 1; } 
               break;
       }
        return 0;
    }
    
    public void rutina(String tipoEjer){
    if (null!=tipoEjer)switch (tipoEjer) {
            case "tonificacion":
                System.out.println("Se recomienda Zumba");
                break;
            case "redux peso":
                System.out.println("Se recomienda Caminadora");
                break;
            case "redux medidas":
                System.out.println("Se recomienda Spinning");
                break;
            case "cardio":
                System.out.println("Se recomienda Natacion");
                break;
            case "pesas":
                System.out.println("Se recomienda Gym");
                break;
            case "flexibilidad":
                System.out.println("Se recomienda Gimnasia");
                break;
            case "relajacion":
                System.out.println("Se recomienda Yoga");
                break;
            default:
                break;
        }
}
  
    public void objetivo(String tipoEjer){
    if (null!=tipoEjer)switch (tipoEjer) {
            case "tonificacion":
                System.out.println("Se recomienda Abdominales + Flexiones");
                break;
            case "redux peso":
                System.out.println("Se recomienda Salto de cuerda + Trotar");
                break;
            case "redux medidas":
                System.out.println("Se recomienda Abdominales + Sentadillas");
                break;
            case "cardio":
                System.out.println("Se recomienda Trotar + Correr");
                break;
            case "pesas":
                System.out.println("Se recomienda Levantar pesas + TRX");
                break;
            case "flexibilidad":
                System.out.println("Se recomienda Estiramientos + Puente");
                break;
            case "relajacion":
                System.out.println("Se recomienda Meditacion + saludo al sol");
                break;
            default:
                break;
        }
}
    
    //para grasaCorpo se usa el calculaIMC de la clase deportista
    //mujer: <25% delgada, >30% exceso; hombres: <15% delgada, >20% exceso
    public void determinarRutina(String tipoEjer, int grasaCorpo){
        //que rutina practicar
        //depende del tipo de ejercicio: 
        /*1=tonificacion,2=redux peso,3=redux medidas,4=cardio,
    5=pesas,6=flexibilidad y equilibrio,7=relajacion*/
       switch (determinarPorcentaje(grasaCorpo)){
           case 0: //por debajo
               System.out.println("El deportista es delgado/a");
               System.out.println("Se recomienda aumentar de peso");
               rutina(tipoEjer);
           break;
           case 1://normal
               System.out.println("El deportista es de peso normal");
               System.out.println("Se recomienda mantener el peso");
               rutina(tipoEjer);
           break;
           case 2://exceso
               System.out.println("El deportista tiene sobrepeso/a");
               System.out.println("Se recomienda disminuir de peso");
               rutina(tipoEjer);
           break;
       }
       
        
    }
    
   
    
    public void determinarRutina(int grasaCorpo, String tipoEjer){
    //que objetivos cumplir    
    switch (determinarPorcentaje(grasaCorpo)){
           case 0: //por debajo
               System.out.println("El deportista es delgado/a");
               System.out.println("Se recomienda aumentar de peso");
               objetivo(tipoEjer);
           break;
           case 1://normal
               System.out.println("El deportista es de peso normal");
               System.out.println("Se recomienda mantener el peso");
               objetivo(tipoEjer);
           break;
           case 2://exceso
               System.out.println("El deportista tiene sobrepeso/a");
               System.out.println("Se recomienda disminuir de peso");
               objetivo(tipoEjer);
           break;
       }
    
    }
}
