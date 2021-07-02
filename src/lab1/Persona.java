
package lab1;
import java.util.Scanner;

class Persona {

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
    public void setDatosPersona(){

    	int dato = 0;
    	while(!valido.validar(9999999, 99999999, dato)){
    		System.out.print("Indique la cedula de la persona entre 7 y 8 digitos: ");
        	dato = entrada.nextInt();
        	System.out.println("\n");
    	}
    	setCedula(dato);
        
		while(!valido.validar(12, 85, dato)){
    		System.out.print("Indique edad de la persona entre 12 y 85 años: ");
        	dato = entrada.nextInt();
        	System.out.println("\n");
    	}
    	setEdad(dato);
        
       	System.out.print("Indique nombre la persona: ");
    	String dato1 = System.console().readLine();
    	setNombre(dato1);
        
        char dato2 = 't';
        while(!valido.validar('F', 'M', dato2)){
    		System.out.print("Indique sexo de la persona con una letra 'F' si es femenino y 'M' si es masculino: ");
        	dato2 = entrada.next().charAt(0);
        	System.out.println("\n");
    	}
    	setSexo(dato2);

    	double dato3 = 0.0;
    	while(!valido.validar(1.4, 2.5, dato3)){
    		System.out.print("Indique altura de la persona entre '1.4' y '2.0' metros: ");
        	dato3 = entrada.nextFloat();
        	System.out.println("\n");
    	}
    	setAltura(dato3);

        while(!valido.validar(40.0, 150.0, dato)){
    		System.out.print("Indique peso de la persona entre '40.0' y '150.0' kg: ");
        	dato3 = entrada.nextFloat();
        	System.out.println("\n");
    	}
    	setPeso(dato3);
    }

    public boolean esMayor(){
        if (getEdad() < 18)
            return false;
        else
            return true;
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
}