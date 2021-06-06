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
        super(); 
        ritmoCardiaco = 0;
        frecuenciaEntr = 0;
        tipoEjercicio = 0;
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
    public int calcularIMC(){
        //calcula porcentaje de grasa corporal
        int IMC=super.calcularIMC();
        return (int) ((1.2*IMC)+(0.23*getEdad())-(10.8*sexoNum())-5.4);
        }
    
    public void grasaCorp(){
        System.out.println("Grasa corporal: "+calcularIMC());
        switch (sexoNum()){

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
//usar este metodo con determinarRutina() y rutina()
public String tipoEjerString(){
    switch(this.tipoEjercicio){
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

public void agregarDatosDeportista(){
        System.out.print("introduzca su ritmo cardiaco: ");
        ritmoCardiaco = entrada.nextInt();
      
        
        System.out.println("introduzca su frecuencia de entrenamiento: ");
        System.out.println("(1=diario, 2=semanal)");
        int a=entrada.nextInt();
        while ((a!=1)&&(a!=2)){
        System.out.println("Frecuencia invalida, intente de nuevo");
        a=entrada.nextInt();
        }
        frecuenciaEntr = a;
     
        System.out.println("introduzca su tipo de ejercicio:");
        System.out.println("1=tonificacion,2=redux peso,3=redux medidas,4=cardio,");
        System.out.println("5=pesas,6=flexibilidad y equilibrio,7=relajacion");
        a=entrada.nextInt();
        while ((a!=1)&&(a!=2)&&(a!=3)&&(a!=4)&&(a!=5)&&(a!=6)&&(a!=7)){
        System.out.println("tipo invalida, intente de nuevo");
        a=entrada.nextInt();
        }
        frecuenciaEntr = a;
        
   }

public void imprimirDatosDeportista(){
        System.out.println("Ritmo Cardiaco: "+ritmoCardiaco);
        
        String freq;
        switch (frecuenciaEntr){
            case 1:
                freq="Diaria";
                break;
            case 2:
                freq="Semanal";
                break; 
            default:
                freq="N/A";
        }
        System.out.println("Frecuencia de entrenamiento: "+freq);

        System.out.println("Tipo de ejercicio: "+tipoEjerString());

        
}
    //a partir de los metodos heredados sobreescribir un metodo que verifique
    //si el ritmo cardiaco en reposo es alto (>100) y en ese caso
    //recomendar no realizar entrenamiento ese dia

    @Override
    public void comprobacion(){
        if (getRitmoCardiaco() > 100 )
            System.out.print(" Es recomendado no realizar entrenamiento hoy");
        else
            System.out.print("No hay problema en que hoy haga su entrenamiento");
    }
    
    }

