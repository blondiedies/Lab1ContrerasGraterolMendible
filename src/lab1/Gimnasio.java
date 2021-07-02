/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;

/**
 *
 * @author captain trouble
 */
public class Gimnasio {
     private ArrayList<Persona> lista;
    //construct
    public Gimnasio(){
        lista=new ArrayList<Persona>();
    }
    //metodos
    public void agregarLista(Persona p){
        lista.add(p);
    }
    
    public int getTamano(){
        return lista.size();
    }
    
    public void imprimir(){
        //se imprime el contenido completo de la lista
        for (Persona temp: lista){//hasta que la lista se vacie
            temp.imprimirDatosPer();
        }
    }
    
    //para uso en parte grafica a partir de aqui
    
    
    public String retornar(){//para uso en parte grafica
        String temporal="";
        for (Persona temp: lista){
            temporal= temporal; 
            temporal= temporal + "<br>" +temp.retornarInfo();//usar html al imprimir en la parte grafica
        }
        return temporal;
    }
    
    public String retornarEntrenador(){
        String temporal="";
        for (Persona temp: lista){
            if (temp instanceof Entrenador){
            temporal= temporal; 
            temporal= temporal + "<br>" +temp.retornarInfo();//usar html al imprimir en la parte grafica
        }}
        return temporal;
    }
    
    public String retornarDeportista(){
        String temporal="";
        for (Persona temp: lista){
            if (temp instanceof Deportista){
            temporal= temporal; 
            temporal= temporal + "<br>" +temp.retornarInfo();//usar html al imprimir en la parte grafica
        }}
        return temporal;
    }
    
    
}
