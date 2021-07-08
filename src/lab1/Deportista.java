
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
        int IMC = (int) (getPeso()/(getAltura()*getAltura()/10000));
        if(getSexo() == 'M'|| getSexo() == 'm'){
        	return (int) ((1.2*IMC)+(0.23*getEdad())-10.8-5.4);}
        else 
        	return (int) ((1.2*IMC)+(0.23*getEdad())-5.4);
    }
    
    @Override
    public boolean esMayor(){
    	if(getRitmoCardiaco() > 100){
    		//no es recomendable
    		return true;
 		}
 		else
 			return false;
    }
    public String imprimirGrasaCorp(){
        System.out.println("Grasa corporal: "+ calcularIMC());
        switch (getSexo()){

            case 'F': 
            case 'f':
                if (calcularIMC()<25){
                    return "Delgada";
                }
                else if (calcularIMC()>30){
                    return "Exceso de grasa corporal";
                }
                else{
                    return "Normal";
                }
            

            case 'M':
            case 'm':
                if (calcularIMC()<15){
                    return "Delgado";
                }
                else if (calcularIMC()>20){
                    return "Exceso de grasa corporal";
                }
                else{
                    return "Normal";
                }

        }
        return "";
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

	public void setDatosDeportista(int cedula, int edad, String nombre, char sexo, double altura, double peso,int rc, int freq, int tipo){
		   
        setDatosPersona(cedula, edad, nombre,sexo, altura, peso);

    	setRitmoCardiaco(rc);
		    

    	setFrecuenciaEntr(freq);        


    	setTipoEjercicio(tipo);            	       	
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
        String temp="Cedula: "+cedula+System.lineSeparator()+"Nombre: "+nombre+System.lineSeparator()+"Edad: "+edad+System.lineSeparator()+"Sexo: "+sexo+System.lineSeparator()+"Peso: "+peso+System.lineSeparator()+"Altura: "+altura+System.lineSeparator()+"Ritmo Cardiaco: "+ritmoCardiaco+System.lineSeparator()+"Freq. Entrenamiento: "+frecuenciaEntr+System.lineSeparator()+"Tipo de Ejercicio: "+tipoEjercicio+System.lineSeparator()+"------"+System.lineSeparator();
        return temp;
    }
        
		
}
