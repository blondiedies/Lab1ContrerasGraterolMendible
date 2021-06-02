/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author captain trouble
 */
public class Deportista extends Persona{
    private int ritmoCardiaco;
    private int frecuenciaEntr; //1=diario, 2=semanal
    private int tipoEjercicio; 
    Scanner entrada = new Scanner(System.in);
    /*1=tonificacion,2=redux peso,3=redux medidas,4=cardio,
    5=pesas,6=flexibilidad y equilibrio,7=relajacion*/
// ***** CONSTRUCTORES *****
    public Deportista (int ritmoCardiaco, int frecuenciaEntr, int tipoEjercicio, int cedula, String nombre, int edad, char sexo, float peso, float altura) {
        super(cedula, nombre, edad, sexo, peso, altura);
        this.ritmoCardiaco = ritmoCardiaco;
        this.frecuenciaEntr = frecuenciaEntr;
        this.tipoEjercicio = tipoEjercicio;
    }
    public Deportista(){  
        super(); 
        ritmoCardiaco = 0;
        frecuenciaEntr = 0;
        tipoEjercicio = 0;     
    }
// ***** get & set *****
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
    public String getTipoEjercicio() {
        if (tipoEjercicio == 1)
            return ("Tonificación");
        else if (tipoEjercicio == 2)
            return ("Reducción de peso");
        else if (tipoEjercicio == 3)
            return ("Reducción de medidas");
        else if(tipoEjercicio == 4)
            return ("Cardiovascular");
        else if (tipoEjercicio == 5)
            return ("Pesas");
        else if (tipoEjercicio == 6)
            return ("Flexibilidad y Equilibrio");
        else if (tipoEjercicio == 7)
            return ("Relajación");
        else
            return ("invalido");                
    }
    private void setTipoEjercicio(int tipoEjercicio) {
        this.tipoEjercicio = tipoEjercicio;
    }
// ***** METODOS *****
    public void crearDatosDeportista(){
        crearDatosPersona();
        System.out.println("\n");
        
        System.out.print("Indique ritmo cardiaco: ");
        int ritmoCard = entrada.nextInt();
        while (ritmoCard < 75 || ritmoCard > 170){
            System.out.print("Indique ritmo cardiaco valido: ");
            ritmoCard = entrada.nextInt();
        }
        setRitmoCardiaco(ritmoCard);
        entrada.nextLine();
        
        int frec = 0;
        while( frec != 1 && frec != 2){
            System.out.print("Indique frecuencia de entrenamiento: ");
            System.out.println("\n");
            System.out.println("1. Diario");
            System.out.println("2. Semanal");
            frec = entrada.nextInt();
        }
        setFrecuenciaEntr(frec);
        entrada.nextLine();
        
        int ejercicio = 0;
        while( ejercicio < 1 || ejercicio > 7 ){
            System.out.print("Indique el número correspondiente al tipo de ejercicio: ");
            System.out.println("\n");
            System.out.println("1. Tonificación");
            System.out.println("\n");
            System.out.println("2. Reducción de peso");
            System.out.println("\n");
            System.out.println("3. Reducción de medidas");
            System.out.println("\n");
            System.out.println("4. Cardiovascular");
            System.out.println("\n");
            System.out.println("5. Pesas");
            System.out.println("\n");
            System.out.println("6. Flexibilidad y equilibrio");
            System.out.println("\n");
            System.out.println("7. Tonificación");
            System.out.println("\n");
            ejercicio = entrada.nextInt();
        }
        setTipoEjercicio(ejercicio);
        entrada.nextLine();
    }
    @Override
    public int calcularIMC(){
        //calcula porcentaje de grasa corporal
        float IMC = getPeso()/(getAltura()*getAltura());
        int sex = 1;
        if (getSexo() == 'F' || getSexo() == 'f')
            sex = 0;
        return (int) ((1.2*IMC)+(0.23*getEdad())-(10.8*sex)-5.4);
    }
    public void grasaCorp(){
        int sex = 1;
        if (getSexo() == 'F' || getSexo() == 'f')
            sex = 0;
        switch (sex){
            case 0: //mujer
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
            case 1://onvre
                if (calcularIMC()<15){
                    System.out.println("Delgada");
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
    public void realizarEntrenamiento(){
        if (getRitmoCardiaco() > 100 )
            System.out.print(" Es recomendado no realizar entrenamiento hoy");
        else
            System.out.print("No hay problema en que hoy haga su entrenamiento");
    }
}
    

