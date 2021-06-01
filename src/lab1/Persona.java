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
public class Persona {
   protected int cedula;
   protected String nombre;
   protected  int edad;
   protected  char sexo;
   protected  float peso;
   protected  float altura;

    public Persona(int cedula, String nombre, int edad, char sexo, float peso, float altura) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
 
    public Persona(){
        
    }


    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
   
    
    public void crearDatosPersona(){
        Scanner entrada = new Scanner(System.in);
         System.out.println("\n");
        System.out.print("Indique la cedula de la persona: ");
        cedula= entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Indique el nombre de la persona: ");
        nombre = entrada.nextLine();

      
        System.out.print("Indique la edad de la persona: ");
        edad = entrada.nextInt();
        if((edad > 81) ||(edad< 12)){
            do{
            System.out.print("Introduzca una edad valida comprendida entre 12 y 81 años");
            edad = entrada.nextInt();
            }while ((edad>81)||(edad<12));
        }
        entrada.nextLine();
        
        System.out.print("Indique el sexo de la persona: ");
        sexo = entrada.next().charAt(0);
        entrada.nextLine();
        
        System.out.print("Indique el peso de la persona: ");
        peso = entrada.nextFloat();
        if((peso > 635)||(peso < 2)) {
            do{
            System.out.print("Introduzca un peso valido menor a 635: ");
            peso= entrada.nextFloat();
            }while ((peso > 635)||(peso<2));
        }
        entrada.nextLine();
        
        System.out.print("Indique la altura de la persona: ");
        altura = entrada.nextFloat();
        if((altura > 2.72)||(altura<0.50) ){
            do{
            System.out.print("Introduzca una altura valido menor a 2,72m o mayor a 1,00m: ");
            altura= entrada.nextFloat();
            }while ((altura > 2.72)||(altura < 0.50));
        }
        entrada.nextLine();
    }
    
    public void esMayorDeEdad(int edad){
        if (getEdad() < 18){
            System.out.println("Esta persona es menor de edad");
        }else{
            System.out.println("esta eprsona es mayor de edad");
        }
        

    }
    
    public void comprobarSexo(char sexo){
        char M = 'M',F = 'F',m='m',f='f';
        ;
       if(( sexo== m)||(sexo== f)||(sexo==F)||(sexo==M)){
           System.out.println("El sexo introducido es Correcto");
       }else{
        System.out.println("El sexo introducido es Incorrecto");
    }
    }
    
    public void imprimirDatosPer(){
        System.out.println("\n");
        System.out.println("Datos de la persona\n");
        System.out.println("Cedual: "+cedula);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Sexo: "+sexo);
        System.out.println("Peso: "+peso);
        System.out.println("Altura: "+altura);
    }
   
    
    public int calcularIMC(){
       float IMC = getPeso()/(getAltura()*getAltura());
        if( IMC < 18 )
             return -1;
        else if ( IMC < 25 )
             return 0;
         else if ( IMC < 35 )
             return 1;
         else if ( IMC >41 )
             return 2; 
      return -9; }
    
}