
package lab1;
import java.util.Scanner;

public class Deportista extends Persona{
    private int ritmoCardiaco;
    private int frecuenciaEntr;
    private int tipoEjercicio;
    Scanner entrada = new Scanner(System.in);
    Validaciones valido = new Validaciones(); 

    public Deportista (int ritmoCardiaco, int frecuenciaEntr, int tipoEjercicio, int cedula, String nombre, int edad, char sexo, double peso, double altura) {
        super(cedula, nombre, edad, sexo, peso, altura);
        this.ritmoCardiaco = ritmoCardiaco;
        this.frecuenciaEntr = frecuenciaEntr;
        this.tipoEjercicio = tipoEjercicio;
    }

    public Deportista(){     

    }


    public int getRitmoCardiaco() {
        return ritmoCardiaco;
    }

    private void setRitmoCardiaco(int ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
    }

    public int getFrecuenciaEntr() {
        return frecuenciaEntr;
    }

    private void setFrecuenciaEntr(int frecuenciaEntr) {
        this.frecuenciaEntr = frecuenciaEntr;
    }

    public int getTipoEjercicio() {
        return tipoEjercicio;
    }

    private void setTipoEjercicio(int tipoEjercicio) {
        this.tipoEjercicio = tipoEjercicio;
    }
    

    @Override
    public int calcularIMC(){
        int IMC = (int) (getPeso()/(getAltura()*getAltura()));
        if(getSexo() == 'M'|| getSexo() == 'm')
        	return (int) ((1.2*IMC)+(0.23*getEdad())-10.8-5.4);
        else 
        	return (int) ((1.2*IMC)+(0.23*getEdad())-5.4);
    }
    
    @Override
    public boolean esMayor(){
    	if(getRitmoCardiaco() > 100){
    		System.out.println("No es recomendable entrenar hoy");
    		return true;
 		}
 		else
 			return false;
    }
    public void imprimirGrasaCorp(){
        System.out.println("Grasa corporal: "+ calcularIMC());
        switch (getSexo()){

            case 'F': 
            case 'f':
                if (calcularIMC()<25){
                    System.out.println("Delgada");
                }
                else if (calcularIMC()>30){
                    System.out.println("Exceso de grasa corporal");
                }
                else{
                    System.out.println("Normal");
                }
            break;

            case 'M':
            case 'm':
                if (calcularIMC()<15){
                    System.out.println("Delgado");
                }
                else if (calcularIMC()>20){
                    System.out.println("Exceso de grasa corporal");
                }
                else{
                    System.out.println("Normal");
                }
            break;
        }

    }

	public String tipoEjerString(){
		switch(getTipoEjercicio()){
	        case 1: return "tonificacion";
	        case 2: return "redux peso";
	        case 3: return "redux medidas";
	        case 4: return "cardio";
	        case 5: return "pesas";
	        case 6: return "flexibilidad"; 
	        case 7: return "relajacion";
	        default: return "";
	    }
	}   

	public void setDatosDeportista(){
		    
		setDatosPersona();

		int dato = 0;
    	while(!valido.validar(40, 120, dato)){
    		System.out.print("Indique la frecuencia cardiaca de la persona entre 40 y 120 lpm");
        	dato = entrada.nextInt();
        	System.out.println("\n");
    	}
    	setRitmoCardiaco(dato);
		    
    	while(!valido.validar(1, 2, dato)){
    		System.out.print("Indique la frecuencia de entrenamiento 1 que corresponde a diaria y 2 que corresponde a semanal");
        	dato = entrada.nextInt();
        	System.out.println("\n");
    	}
    	setFrecuenciaEntr(dato);        

    	dato = 0;
		while(!valido.validar(1, 7, dato)){
    		System.out.println("Indique número correspondiente a el tipo de ejercicio:");
    		System.out.println("1. Tonificacion");
    		System.out.println("2. Reducción de peso");
    		System.out.println("3. Reducción de medidas");
    		System.out.println("4. Cardiovascular");
    		System.out.println("5. Ejercicios de Fuerza");
    		System.out.println("6. Ejercicios de flexibilidad y equilibrio");
    		System.out.println("7. Ejercicios de relajación");
        	dato = entrada.nextInt();
        	System.out.println("\n");
    	}
    	setTipoEjercicio(dato);            	       	
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
        System.out.println("Ritmo Cardiaco: "+ritmoCardiaco);
        switch (getFrecuenciaEntr()){
            case 1:
                System.out.println("Frecuencia de entrenamiento diaria");
                break;
            case 2:
                System.out.println("Frecuencia de entrenamiento semanal");
                break; 
            default:
                break;
        }

        System.out.println("Tipo de ejercicio: "+tipoEjerString());	        
	}

    @Override
         public String retornarInfo(){
        String temp="Datos de la persona:<br>Cedula: "+cedula+"<br>Nombre: "+nombre+"<br>Edad: "+edad+"<br>Sexo: "+sexo+"<br>Peso: "+peso+"<br>Altura: "+altura+"<br>Ritmo Cardiaco: "+ritmoCardiaco+"<br>Freq. Entrenamiento: "+frecuenciaEntr+"<br>Tipo de Ejercicio: "+tipoEjercicio+"<br>------<br>";
        return temp;
    }
        
		
}
