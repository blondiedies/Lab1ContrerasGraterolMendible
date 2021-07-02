
package lab1;
import java.util.Scanner;

public class Entrenador extends Persona{
    private int experienciaLaboral; 
    private String especialidad;
    Scanner entrada = new Scanner(System.in);
    Validaciones valido = new Validaciones();

    public Entrenador(int experienciaLaboral, String especialidad, int cedula, String nombre, int edad, char sexo, float peso, float altura) {
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

    public void determinarRutina(int grasaCorporal, int tipoEjercicio){
    	if(tipoEjercicio == 6 || tipoEjercicio == 7)//relajacion, equilibrio y flexibilidad
    		System.out.println("Se recomienda hacer yoga y ejercicios de meditación");
    	else if(tipoEjercicio == 5) //ejerccios de fuerza
    		System.out.println("Hacer ejercicios con pesas");
    	else if ( tipoEjercicio == 2 || tipoEjercicio == 3) { // reduccion de medidas y de peso
    		if(grasaCorporal < 20)
    			System.out.println("No se puede determinar rutina porque su % de grasa corporal es muy bajo");
    		else if(grasaCorporal < 40)
    			System.out.println("Hacer ejercicios con pesas y HIIT");
    		else
    			System.out.println("Hacer ejercicios con pesas y caminar");
    	}else if(tipoEjercicio == 4){ // cardio
			if ( grasaCorporal < 20) 
				System.out.println("No se puede determinar rutina porque su % de grasa corporal es muy bajo");
			else if(grasaCorporal < 40)
				System.out.println("Hacer HITT y saltar la cuerda");
			else{
				System.out.println("Caminar o si su médico lo permite trotar");
			}
    	}else{ // tonificar
    		if ( grasaCorporal < 20)
    			System.out.println("Hacer ejercicio con pesas");	
    		else
    			System.out.println("Hacer ejercicio con pesas y ejercicios cardiovasculares"); 
    	}
    }

    public void determinarRutina(Deportista deportista){
    
    }

    void imprimirDatosDeportista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String retornarInfo(){
        String temp="Datos de la persona:<br>Cedula: "+cedula+"<br>Nombre: "+nombre+"<br>Edad: "+edad+"<br>Sexo: "+sexo+"<br>Peso: "+peso+"<br>Altura: "+altura+"<br>Exp. Laboral: "+experienciaLaboral+"<br>Especialidad: "+especialidad+"<br>------<br>";
        return temp;
    }
}