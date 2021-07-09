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
public class Controlador  implements ActionListener {
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

public void crearDep(){
    //captacion de datos
    //sexo
     char sexo = 'F';
        int tipoejer=1;
        int ced = Integer.parseInt(nuevod.getTexto(nuevod.getTextField3()));
        String nombre =nuevod.getTexto(nuevod.getTextField1());
        int edad = Integer.parseInt(nuevod.getTexto(nuevod.getTextField2()));
        
        if (nuevod.getCombo(nuevod.getComboBox1())=="M"){
             sexo = 'M';
        }
        
        double peso=Double.parseDouble(nuevod.getTexto(nuevod.getTextField4()));
        double alt=Double.parseDouble(nuevod.getTexto(nuevod.getTextField5()));
        int rc = Integer.parseInt(nuevod.getTexto(nuevod.getTextField7()));
        int freq= Integer.parseInt(nuevod.getTexto(nuevod.getTextField6()));
        
        if (nuevod.getCombo(nuevod.getComboBox2())=="Tonificación"){
            tipoejer=1;
        }
        else if (nuevod.getCombo(nuevod.getComboBox2())=="Reducción de Peso"){
            tipoejer=2;}
        else if(nuevod.getCombo(nuevod.getComboBox2())=="Reducción de Medidas"){
            tipoejer=3;}
        if (nuevod.getCombo(nuevod.getComboBox2())=="Cardio"){
            tipoejer=4;
        }
        else if (nuevod.getCombo(nuevod.getComboBox2())=="Pesas"){
            tipoejer=5;}
        else if(nuevod.getCombo(nuevod.getComboBox2())=="Flexibilidad"){
            tipoejer=6;}
        else if(nuevod.getCombo(nuevod.getComboBox2())=="Relajación"){
            tipoejer=7;}
       
    
    //creando el deportista
    Deportista d = new Deportista(rc, freq, tipoejer, ced, nombre,  edad, sexo,  peso,  alt);
    Lab1.lista.agregarLista(d);
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

public void ritmo(){
            Deportista d = (Deportista) Lab1.lista.buscarEnLista(Lab1.cedulatemp);
                //calculo del imc
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

       vrc.setTexto(vrc.getTextArea1(),String.valueOf(d.getRitmoCardiaco()));

}

/*------------*/
/*Menu entrenador*/

public void mostrarNuevoEntrenador(){
    nuevoe.setLocationRelativeTo(null);
    nuevoe.setVisible(true);
}

public void mostrarListaEnt(){
    
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
    //captacion de datos
    //sexo
     char sexo = 'F';
        int tipoejer=1;
        int ced = Integer.parseInt(nuevoe.getTexto(nuevoe.getTextField3()));
        String nombre =nuevoe.getTexto(nuevoe.getTextField1());
        int edad = Integer.parseInt(nuevoe.getTexto(nuevoe.getTextField2()));
        
        if (nuevoe.getCombo(nuevoe.getComboBox1())=="M"){
             sexo = 'M';
        }
        
        double peso=Double.parseDouble(nuevoe.getTexto(nuevoe.getTextField4()));
        double alt=Double.parseDouble(nuevoe.getTexto(nuevoe.getTextField5()));
        
        String esp = nuevoe.getTexto(nuevoe.getTextField6());
        int exp = Integer.parseInt(nuevoe.getTexto(nuevoe.getTextField7()));
    
        //creando el entrenador
    Entrenador e = new Entrenador(exp, esp, ced, nombre,  edad, sexo,  peso,  alt);
    Lab1.lista.agregarLista(e);
}
      

/*rutina*/
public void detRut(){
rutinav=new Rutina();
rutinav.setLocationRelativeTo(null);
       rutinav.setTexto(rutinav.getTextArea1(),rutinav.genRutinaObj());
       

}

/*lista entrenadores*/

public void mostrarListaE(){

                           //busqueda en lista
               String a= Lab1.lista.retornarDeportista();

listaE.setTexto(listaE.getTextArea1(),a);
}


/*ventana cedula*/

public void cedula() throws NumberFormatException{
    int a=0;
     try{a= Integer.parseInt(cedv.getTexto(cedv.getTextField3()));}
     catch(NumberFormatException excepcion1){
     System.out.println("Caracter invalido1");
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

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
