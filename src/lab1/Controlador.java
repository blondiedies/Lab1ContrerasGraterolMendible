/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author captain trouble
 */
public class Controlador  {
    private Deportista d;
    private Entrenador e;
    private Gimnasio g;
    private MenuPrincipal menuP;
    private MenuDeportista menuD;
    private MenuEntrenador menuE;
    private NuevoDeportista nuevod  ;
    private NuevoEntrenador nuevoe;
    private  IMC indicem;
    private RitmoCardiaco vrc;
    private Rutina rutinav;
    private VentanaCedula cedv;
    private ListaDeportistas listaD;  
    private ListaEntrenadores listaE;
    private VentanaError error= new VentanaError();
    private Validaciones v = new Validaciones();
    

    public Controlador() {
    }
    
    public Deportista getDeportista() {
  return d;
}
    public Entrenador getEntrenador(){
        return e;
    }
    
    public Gimnasio getGimnasio(){
        return g;
    }

public void setDeportista(Deportista d) {
  this.d = d;
}
public void setEntrenador(Entrenador e) {
  this.e = e;
}

public void setGimnasio(Gimnasio g) {
  this.g = g;
}
  


/***metodos de conexion*/

/*general*/

public void mostrarMenuPpal(){
    menuP= new MenuPrincipal();
    menuP.setLocationRelativeTo(null);
        menuP.setVisible(true);}

/*Menu PPAL*/
public void mostrarMenuEntrenador() {
  menuE=new MenuEntrenador();
  menuE.setLocationRelativeTo(null);
  menuE.setVisible(true);
}

public void mostrarMenuDeportista() {
  menuD=new MenuDeportista();
    menuD.setLocationRelativeTo(null);
  menuD.setVisible(true);
}
/*------------*/
/*Menu Deportista*/

public void ritmoCardiaco(){
    Lab1.check=2;
    cedv=new VentanaCedula();
    cedv.setLocationRelativeTo(null);
        cedv.setVisible(true);   
}

public void MostrarListaDeportistas(){
    listaD=new ListaDeportistas();
    listaD.mostrarLista();
    listaD.setLocationRelativeTo(null);
    listaD.setVisible(true); 
}

public void IMC(){
    Lab1.check=1;
    cedv=new VentanaCedula();
    cedv.setLocationRelativeTo(null);
    cedv.setVisible(true);
}
public void mostrarNuevoDeportista() {
    nuevod=new NuevoDeportista();
    nuevod.setLocationRelativeTo(null);
    nuevod.setVisible(true);
 
}

/*Nuevo Deportista*/

public void crearDep() throws ExcepcionPropia{
    Lab1.error="";
     char sexo = 'F';
        int tipoejer=1, ced=0, exp=0, edad=0, rc=0, freq=0;
        double peso=0, alt=0;
        String nombre="";
        try{
            //cedula
        try{if (v.validarCedula(nuevod.getTexto(nuevod.getTextField3()))){
            ced = Integer.parseInt(nuevod.getTexto(nuevod.getTextField3()));
        }}
        catch (ExcepcionPropia e){Lab1.error=Lab1.error+System.lineSeparator()+"CEDULA INVALIDA";}
        catch (NumberFormatException n){Lab1.error=Lab1.error+System.lineSeparator()+"CEDULA INVALIDA";}
        
        //EDAD
        try{
            if (v.validarNum(nuevod.getTexto(nuevod.getTextField2()),"1,3", 18, 100))
                    {
            edad = Integer.parseInt(nuevod.getTexto(nuevod.getTextField2()));}}
        catch (ExcepcionPropia e){Lab1.error=Lab1.error+System.lineSeparator()+"EDAD INVALIDA";}
        catch (NumberFormatException n){Lab1.error=Lab1.error+System.lineSeparator()+"EDAD INVALIDA";}
        //sexo (no requiere validacion)
        if (nuevod.getCombo(nuevod.getComboBox1())=="M"){
             sexo = 'M';
        }
        //PESO/ALTURA
        try{if (v.validarNum(nuevod.getTexto(nuevod.getTextField4()),"1,3", 1, 500))
                    {peso=Double.parseDouble(nuevod.getTexto(nuevod.getTextField4()));}}
        catch (ExcepcionPropia e){Lab1.error=Lab1.error+System.lineSeparator()+"PESO INVALIDO";
     }
        catch (NumberFormatException n){Lab1.error=Lab1.error+System.lineSeparator()+"PESO INVALIDO";}
        try{if (v.validarNum(nuevod.getTexto(nuevod.getTextField5()),"1,3", 1, 400))
                    {alt=Double.parseDouble(nuevod.getTexto(nuevod.getTextField5()));}}
        catch (ExcepcionPropia e){Lab1.error=Lab1.error+System.lineSeparator()+"ALTURA INVALIDA";}
        catch (NumberFormatException n){Lab1.error=Lab1.error+System.lineSeparator()+"ALTURA INVALIDA";}
     
        
                //nombre
        try{
            if(v.validarString(nuevod.getTexto(nuevod.getTextField1()),20)){
            nombre =nuevod.getTexto(nuevod.getTextField1());};}
        catch(ExcepcionPropia excepcionnom){
            Lab1.error=Lab1.error+System.lineSeparator()+"NOMBRE INVALIDO";}
        
        //ritmo card
try{if (v.validarNum(nuevod.getTexto(nuevod.getTextField7()),"1,3", 1, 200)){
            rc = Integer.parseInt(nuevod.getTexto(nuevod.getTextField7()));}}
        catch (ExcepcionPropia e){Lab1.error=Lab1.error+System.lineSeparator()+"RC INVALIDO";}
catch(NumberFormatException excepcionnum){Lab1.error=Lab1.error+System.lineSeparator()+"RC INVALIDO";
     }
        
        //frecuencia
try{if (v.validarNum(nuevod.getTexto(nuevod.getTextField6()),"1", 1, 7)){
        freq= Integer.parseInt(nuevod.getTexto(nuevod.getTextField6()));}}
        catch (ExcepcionPropia e){Lab1.error=Lab1.error+System.lineSeparator()+"FREQ INVALIDA";        }
catch(NumberFormatException excepcionnum){Lab1.error=Lab1.error+System.lineSeparator()+"FREQ INVALIDA";
     }
        
        if (nuevod.getCombo(nuevod.getComboBox2())=="Tonificación"){
            tipoejer=1;
        }
        else if (nuevod.getCombo(nuevod.getComboBox2())=="Reducción de Peso"){
            tipoejer=2;}
        else if(nuevod.getCombo(nuevod.getComboBox2())=="Reducción de Medidas"){
            tipoejer=3;}
        else if (nuevod.getCombo(nuevod.getComboBox2())=="Cardio"){
            tipoejer=4;
        }
        else if (nuevod.getCombo(nuevod.getComboBox2())=="Pesas"){
            tipoejer=5;}
        else if(nuevod.getCombo(nuevod.getComboBox2())=="Flexibilidad"){
            tipoejer=6;}
        else if(nuevod.getCombo(nuevod.getComboBox2())=="Relajación"){
            tipoejer=7;}}
        catch(NullPointerException hmm){}

finally{
                  
    if (Lab1.error==""){//no hubo excepciones

    //creando el deportista
    Deportista d = new Deportista(rc, freq, tipoejer, ced, nombre,  edad, sexo,  peso,  alt);
    Lab1.lista.agregarLista(d);}
    else{
        error.setTexto(error.getTextArea1(),"ERRORES: "+Lab1.error);
     error.setVisible(true); 
    }
}  
}

/*listadep*/
public void mostrarListaD(){

                           //busqueda en lista
String a= Lab1.lista.retornarDeportista();
listaD.setTexto(listaD.getTextArea1(),a);

}

/*IMC*/
public void calcIMC(){
    indicem=new IMC();
    indicem.setLocationRelativeTo(null);
    indicem.setTexto(indicem.getTextArea1(),indicem.calcularIMC());
}

/*Ritmo Cardiaco*/

public void ritmo()throws NullPointerException{
            try{Deportista d = (Deportista) Lab1.lista.buscarEnLista(Lab1.cedulatemp);
            
            if (d.esMayor()){
                    vrc.setTextoL(vrc.getLabel7(),"ELEVADO");
                    vrc.setForegroundColor(vrc.getLabel7(),Color.RED);
                    vrc.setTextoL(vrc.getLabel6(),"No se recomienda hacer actividad");
                    //no es recomendable
                }
                else{
                    vrc.setTextoL(vrc.getLabel7(),"NORMAL");
                    vrc.setForegroundColor(vrc.getLabel7(),Color.GREEN);
                    vrc.setTextoL(vrc.getLabel6(),"Se puede hacer actividad");
                }
                
vrc.setTexto(vrc.getTextArea1(),String.valueOf(d.getRitmoCardiaco()));}

           catch(NullPointerException excepcion6){
                    Lab1.error=Lab1.error+System.lineSeparator()+"Cedula Invalida";
            error.setTexto(error.getTextArea1(),Lab1.error); error.setVisible(true);
                    vrc.setTextoL(vrc.getLabel7(),"No es posible mostrar el ritmo cardíaco");
                    vrc.setForegroundColor(vrc.getLabel7(),Color.BLUE);
                    vrc.setTextoL(vrc.getLabel6(),"No es posible hacer una recomendación");
                
           vrc.setTexto(vrc.getTextArea1(),"N/A");
       }

}

/*------------*/
/*Menu entrenador*/

public void mostrarNuevoEntrenador(){
    nuevoe = new NuevoEntrenador();
    nuevoe.setLocationRelativeTo(null);
    nuevoe.setVisible(true);
}

public void mostrarListaEnt(){
    listaE= new ListaEntrenadores();
    listaE.mostrarLista();
    listaE.setLocationRelativeTo(null);
    listaE.setVisible(true);   
}

public void rutina(){
    Lab1.check=3;
    cedv = new VentanaCedula();
        cedv.setLocationRelativeTo(null);
        cedv.setVisible(true);
}

/*nuevo entrenador*/

public void crearEnt(){
    Lab1.error="";
     char sexo = 'F';
        int tipoejer=1, ced=0, exp=0, edad=0;
        double peso=0, alt=0;
        String nombre="", esp="";
        try{
            //cedula
        try{if (v.validarCedula(nuevoe.getTexto(nuevoe.getTextField3()))){
            ced = Integer.parseInt(nuevoe.getTexto(nuevoe.getTextField3()));
        }}
        catch (ExcepcionPropia e){Lab1.error=Lab1.error+System.lineSeparator()+"CEDULA INVALIDA";}
        catch (NumberFormatException n){Lab1.error=Lab1.error+System.lineSeparator()+"CEDULA INVALIDA";}
        
        //EDAD
        try{
            if (v.validarNum(nuevoe.getTexto(nuevoe.getTextField2()),"1,3", 18, 100))
                    {
            edad = Integer.parseInt(nuevoe.getTexto(nuevoe.getTextField2()));}}
        catch (ExcepcionPropia e){Lab1.error=Lab1.error+System.lineSeparator()+"EDAD INVALIDA";}
        catch (NumberFormatException n){Lab1.error=Lab1.error+System.lineSeparator()+"EDAD INVALIDA";}
        //sexo (no requiere validacion)
        if (nuevoe.getCombo(nuevoe.getComboBox1())=="M"){
             sexo = 'M';
        }
        //PESO/ALTURA
        try{if (v.validarNum(nuevoe.getTexto(nuevoe.getTextField4()),"1,3", 1, 500))
                    {peso=Double.parseDouble(nuevoe.getTexto(nuevoe.getTextField4()));}}
        catch (ExcepcionPropia e){Lab1.error=Lab1.error+System.lineSeparator()+"PESO INVALIDO";
     }
        catch (NumberFormatException n){Lab1.error=Lab1.error+System.lineSeparator()+"PESO INVALIDO";}
        try{if (v.validarNum(nuevoe.getTexto(nuevoe.getTextField5()),"1,3", 1, 400))
                    {alt=Double.parseDouble(nuevoe.getTexto(nuevoe.getTextField5()));}}
        catch (ExcepcionPropia e){Lab1.error=Lab1.error+System.lineSeparator()+"ALTURA INVALIDA";}
        catch (NumberFormatException n){Lab1.error=Lab1.error+System.lineSeparator()+"ALTURA INVALIDA";}
     
        
                //nombre
        try{
            if(v.validarString(nuevoe.getTexto(nuevoe.getTextField1()),20)){
            nombre =nuevoe.getTexto(nuevoe.getTextField1());};}
        catch(ExcepcionPropia excepcionnom){
            Lab1.error=Lab1.error+System.lineSeparator()+"NOMBRE INVALIDO";}
        
        //especialidad
        try{
            if(v.validarString(nuevoe.getTexto(nuevoe.getTextField6()), 30)){
                    esp = nuevoe.getTexto(nuevoe.getTextField6());}}
            catch (ExcepcionPropia excepcionesp){
                    Lab1.error=Lab1.error+System.lineSeparator()+"ESPECIALIDAD DEMASIADO LARGA";
                    }        
        //EXP
        try{exp = Integer.parseInt(nuevoe.getTexto(nuevoe.getTextField7()));}
        catch(NumberFormatException excepcionnum){Lab1.error=Lab1.error+System.lineSeparator()+"EXPERIENCIA INVALIDA";
     }}
        
    catch(NullPointerException hmm){}
        //creando el entrenador
finally{
    if (Lab1.error==""){//no hubo excepciones
        
    Entrenador e = new Entrenador(exp, esp, ced, nombre,  edad, sexo,  peso,  alt);
    Lab1.lista.agregarLista(e);}
    else{
        error.setTexto(error.getTextArea1(),"ERRORES: "+Lab1.error);
     
     error.setVisible(true);}
}}
      

/*rutina*/
public void detRut() throws NullPointerException{
rutinav=new Rutina();
rutinav.setLocationRelativeTo(null);
       try{rutinav.setTexto(rutinav.getTextArea1(),rutinav.genRutinaObj());}
       catch (NullPointerException excepcion8){Lab1.error=Lab1.error+System.lineSeparator()+"Cedula Invalida";
            error.setTexto(error.getTextArea1(),Lab1.error); 
            error.setVisible(true);
            rutinav.setTexto(rutinav.getTextArea1(),"No es posible mostrar la rutina recomendada");
       }
       
       

}

/*lista entrenadores*/

public void mostrarListaE(){

                           //busqueda en lista
               String a= Lab1.lista.retornarEntrenador();

listaE.setTexto(listaE.getTextArea1(),a);
}


/*ventana cedula*/

public void cedula() throws NumberFormatException{
    int a=0;
     try{a= Integer.parseInt(cedv.getTexto(cedv.getTextField3()));}
     catch(NumberFormatException excepcion1){
         Lab1.error="";
     error.setTexto(error.getTextArea1(),"ERROR: CARACTER INVALIDO");
     
     error.setVisible(true);}
    
     
        Lab1.cedulatemp=a;
        //para determinar a cual ventana se sigue
        switch (Lab1.check){
            case 1: //imc
                calcIMC();
                indicem.setLocationRelativeTo(null);
                indicem.setVisible(true);
             
                break;
        
            case 2: //ritmo cardiaco
                vrc= new RitmoCardiaco();
                vrc.ritmoCard();
                vrc.setLocationRelativeTo(null);
                vrc.setVisible(true);
                
                break;
            
            case 3: //rutina entrenador
                detRut();
                rutinav.setLocationRelativeTo(null);
                rutinav.setVisible(true);
               
        }
        

}


}
