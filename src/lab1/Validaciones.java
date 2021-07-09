package lab1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Validaciones {

    public Validaciones(){}
    /**
     cedula DONE
     nombre DONE
     edad (INT) DONE
     peso (double)
     altura (double)
     freq de entrenamiento (int de 0 A 7)
     ritmo cardiaco (int)
     Especialidad (string) DONE
     experiencia laboral (int)*/

    /*Validaciones para cedula*/
    public boolean validarCedula(String cedula){ //mide de 1 a 8 caracteres y solo incluye numeros
        
        Pattern pat =Pattern.compile("[0-9]{1,8}");
        Matcher mat = pat.matcher(cedula);
        if (Lab1.lista.buscarEnLista(Integer.parseInt(cedula))!=null){ //verifica que la cedula no esté repetida

            return false;
        }

        return mat.matches();
    }
    
   /*validacion strings*/
    public boolean validarString(String nombre, int limitesuperior){
        Pattern pat =Pattern.compile("[a-zA-z]+\\w{0,"+limitesuperior+"}"); //nombre 20, esp 30
        Matcher mat = pat.matcher(nombre);

        return mat.matches();
    }
  
    
    /*VALIDACION INT y DOUBLE*/
    
    public boolean validarNum(String valor, String intervalo,int limiteinf, int limitesup){ //mide de 1 a 8 caracteres y solo incluye numeros
        
        Pattern pat =Pattern.compile("[0-9]{"+intervalo+"}"); //intervalo: edad 1,2; peso 1,3; altura 2,3, freq ent 1,rc 2,3, exp 1,2 
        Matcher mat = pat.matcher(valor);
        if ((Integer.parseInt(valor)<limiteinf)||((Integer.parseInt(valor)>limitesup))){ //verifica que la persona sea adulta pero no anciana

            return false;
        }

        return mat.matches();
    }
    
    
}