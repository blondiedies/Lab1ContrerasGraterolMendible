/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author captain trouble
 */
public class Deportista extends Persona{
    private int ritmoCardiaco;
    private int frecuenciaEntr; //1=diario, 2=semanal
    private int tipoEjercicio; 
    /*1=tonificacion,2=redux peso,3=redux medidas,4=cardio,
    5=pesas,6=flexibilidad y equilibrio,7=relajacion*/

//CONSTRUCTOR CON PARAMETROS
    public Deportista (int ritmoCardiaco, int frecuenciaEntr, int tipoEjercicio, int cedula, String nombre, int edad, char sexo, float peso, float altura) {
        super(cedula, nombre, edad, sexo, peso, altura);
        this.ritmoCardiaco = ritmoCardiaco;
        this.frecuenciaEntr = frecuenciaEntr;
        this.tipoEjercicio = tipoEjercicio;
    }

    //CONSTRUCTOR SIN PARAMETROS
    public Deportista(){      
    }
//getset

    public int getRitmoCardiaco() {
        return ritmoCardiaco;
    }

    public void setRitmoCardiaco(int ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
    }

    public int getFrecuenciaEntr() {
        return frecuenciaEntr;
    }

    public void setFrecuenciaEntr(int frecuenciaEntr) {
        this.frecuenciaEntr = frecuenciaEntr;
    }

    public int getTipoEjercicio() {
        return tipoEjercicio;
    }

    public void setTipoEjercicio(int tipoEjercicio) {
        this.tipoEjercicio = tipoEjercicio;
    }
    
    //metodo sobreescrito calcularIMC()
    public int calculaIMC(){
        //calcula porcentaje de grasa corporal
        int IMC=super.calcularIMC();
        return (int) ((1.2*IMC)+(0.23*getEdad())-(10.8*getSexo())-5.4);
        }
    
    public void grasaCorp(){
        switch (getSexo()){
            case 0: //mujer
                if (calculaIMC()<25){
                    System.out.println("Delgada");
                }
                else if (calculaIMC()>30){
                    System.out.println("Exceso de grasa corporal");
                }
                else{
                    System.out.println("Normal");
                }
            break;
            case 1://onvre
                if (calculaIMC()<15){
                    System.out.println("Delgada");
                }
                else if (calculaIMC()>20){
                    System.out.println("Exceso de grasa corporal");
                }
                else{
                    System.out.println("Normal");
                }
            break;
        }
        //hola
    }
    
    //a partir de los metodos heredados sobreescribir un metodo que verifique
    //si el ritmo cardiaco en reposo es alto (>100) y en ese caso
    //recomendar no realizar entrenamiento ese dia
    
    
    }

