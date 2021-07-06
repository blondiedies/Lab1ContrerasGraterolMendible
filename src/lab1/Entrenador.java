
package lab1;
import java.util.Scanner;

public class Entrenador extends Persona{
    private int experienciaLaboral; 
    private String especialidad;
    Scanner entrada = new Scanner(System.in);
    Validaciones valido = new Validaciones();

    public Entrenador(int experienciaLaboral, String especialidad, int cedula, String nombre, int edad, char sexo, double peso, double altura) {
        super(cedula, nombre, edad, sexo, peso, altura);
        this.experienciaLaboral = experienciaLaboral;
        this.especialidad = especialidad;
    }

    public Entrenador(){      
    }
        

    public int getExperienciaLaboral() {
        return experienciaLaboral;
    }

    private void setExperienciaLaboral(int experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    private void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setDatosEntrenador(){
       
        setDatosPersona();

        int dato = 500;
    	while(!valido.validar(0, getEdad()-16, dato)){
    		System.out.print("Indique la cantidad de años que tiene de experinecia laboral, se asume que empezo a trabajar despues de los 16 años");
        	dato = entrada.nextInt();
        	System.out.println("\n");
    	}
    	setExperienciaLaboral(dato);
      
		System.out.print("Indique su especialidad");
		setEspecialidad(System.console().readLine());
                System.out.println("\n");
        
   	}
       
    @Override
    public void imprimirDatosPer(){
        System.out.println("Datos de la persona\n");
        System.out.println("Cedula: "+cedula);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Sexo: "+sexo);
        System.out.println("Peso: "+peso);
        System.out.println("Altura: "+altura);
        System.out.println("Experiencia Laboral: "+experienciaLaboral);
        System.out.println("Especialidad: "+especialidad);
    }

    public String determinarRutina(int grasaCorporal, String tipoEjercicio){
        /*case 1: return "tonificacion";
	        case 2: return "redux peso";
	        case 3: return "redux medidas";
	        case 4: return "cardio";
	        case 5: return "pesas";
	        case 6: return "flexibilidad"; 
	        case 7: return "relajacion";
	        default: return "";*/
        switch (tipoEjercicio){
            case "tonificacion":
                if ( grasaCorporal < 20)
    			return "Hacer ejercicio con pesas";	
    		else
    			return "Hacer ejercicio con pesas y ejercicios cardiovasculares"; 
                
            
            case "relajacion":
            case "flexibilidad":
                return "Se recomienda hacer yoga y ejercicios de meditación";
                
            case "pesas":
                return "Hacer ejercicios con pesas";
            
            case "redux peso":
            case "redux medidas":
    		if(grasaCorporal < 20)
    			return "No se puede determinar rutina porque su % de grasa corporal es muy bajo";
    		else if(grasaCorporal < 40)
    			return "Hacer ejercicios con pesas y HIIT";
    		else
    			return "Hacer ejercicios con pesas y caminar";
    	
            case "cardio":
			if ( grasaCorporal < 20) 
				return "No se puede determinar rutina porque su % de grasa corporal es muy bajo";
			else if(grasaCorporal < 40)
				return "Hacer HITT y saltar la cuerda";
			else{
				return "Caminar o si su médico lo permite trotar";
			}
            default:
                return "";
    		
        }
    }

    public String determinarRutina(String tipoEjercicio, int grasaCorporal){ //objetivos
        /*case 1: return "tonificacion";
	        case 2: return "redux peso";
	        case 3: return "redux medidas";
	        case 4: return "cardio";
	        case 5: return "pesas";
	        case 6: return "flexibilidad"; 
	        case 7: return "relajacion";
	        default: return "";*/
        switch (tipoEjercicio){
            case "tonificacion":
                if ( grasaCorporal < 20)
    			return "10 repeticiones";	
    		else
    			return "15 repeticiones"; 
                
            
            case "relajacion":
            case "flexibilidad":
                return "Media hora diaria";
                
            case "pesas":
                return "Una hora diaria";
            
            case "redux peso":
            case "redux medidas":
    		if(grasaCorporal < 20)
    			return "No se puede determinar sus objetivos porque su % de grasa corporal es muy bajo";
    		else if(grasaCorporal < 40)
    			return "Media hora al dia";
    		else
    			return "Una hora al dia";
    	
            case "cardio":
			if ( grasaCorporal < 20) 
				return "No se puede determinar sus objetivos porque su % de grasa corporal es muy bajo";
			else if(grasaCorporal < 40)
				return "Media hora al dia";
			else{
				return "Una hora al dia";
			}
            default:
                return "";
    		
        }
    }

    void imprimirDatosDeportista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String retornarInfo(){
        String temp="Cedula: "+cedula+System.lineSeparator()+"Nombre: "+nombre+System.lineSeparator()+"Edad: "+edad+System.lineSeparator()+"Sexo: "+sexo+System.lineSeparator()+"Peso: "+peso+System.lineSeparator()+"Altura: "+altura+System.lineSeparator()+"Exp. Laboral: "+experienciaLaboral+System.lineSeparator()+"Especialidad: "+especialidad+System.lineSeparator()+"------"+System.lineSeparator();
        return temp;
    }
}