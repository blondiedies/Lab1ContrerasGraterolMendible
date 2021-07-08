
package lab1;
import java.util.Scanner;

public abstract class Persona {

	protected int cedula;
   	protected String nombre;
   	protected  int edad;
   	protected  char sexo; 
   	protected  double peso;
   	protected  double altura;
   	Scanner entrada = new Scanner(System.in);
   	Validaciones valido = new Validaciones();


    public Persona(int cedula, String nombre, int edad, char sexo, double peso, double altura) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public Persona(){}

    // GET & SET
    public int getCedula() {
        return cedula;
    }

    protected void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    protected void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    protected void setSexo(char sexo) {
        this.sexo=sexo;
    }

    public double getPeso() {
        return peso;
    }

    protected void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    protected void setAltura(double altura) {
        this.altura = altura;
    }
   
// OTROS METODOS
    public void setDatosPersona(int cedula, int edad, String nombre, char sexo, double altura, double peso){

    	
    	setCedula(cedula);
        
    	setEdad(edad);
        
    	setNombre(nombre);
        
        
    	setSexo(sexo);

    	
    	setAltura(altura);

    	setPeso(peso);
    }

    public boolean esMayor(){
            return getEdad() >= 18;
    }

    public void imprimirDatosPer(){
        System.out.println("Datos de la persona\n");
        System.out.println("Cedula: "+cedula);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Sexo: "+sexo);
        System.out.println("Peso: "+peso);
        System.out.println("Altura: "+altura);
    }
   
    public int calcularIMC(){
       int IMC = (int) (getPeso()/(getAltura()*getAltura()));
       if( IMC < 18)
    		return -1;
    	else if( IMC < 25)
    		return 0;
    	else if ( IMC < 35)
    		return 1;
    	else
    		return 2;
    }
    
        public String retornarInfo(){
        String temp="Datos de la persona:Cedula: "+cedula+"Nombre: "+nombre+"Edad: "+edad+"Sexo: "+sexo+"Peso: "+peso+"Altura: "+altura+"------";
        return temp;
    }
    
}