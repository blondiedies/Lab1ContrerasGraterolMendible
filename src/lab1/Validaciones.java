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

    /*Validaciones para cedula nueva*/
    public boolean validarCedula(String cedula) throws ExcepcionPropia{ //mide de 1 a 8 caracteres y solo incluye numeros
        
        Pattern pat =Pattern.compile("[0-9]{1,8}");
        Matcher mat = pat.matcher(cedula);
        
        if (Lab1.lista.buscarEnLista(Integer.parseInt(cedula))==null){ //verifica que la cedula no esté repetida
        return mat.matches();
        }
        else throw new ExcepcionPropia("Cedula invalida");
        
    }
    
    public boolean validarCedulaExistente(String cedula){ //mide de 1 a 8 caracteres y solo incluye numeros
        
        Pattern pat =Pattern.compile("[0-9]{1,8}");
        Matcher mat = pat.matcher(cedula);
        if (Lab1.lista.buscarEnLista(Integer.parseInt(cedula))==null){ //verifica que la cedula no esté repetida

            return false;//false si esta repetida
        }

        return mat.matches();
    }
    
    
   /*validacion strings*/
    public boolean validarString (String nombre, int limitesuperior)throws ExcepcionPropia{

        Pattern pat =Pattern.compile("[a-zA-z]+\\w{0,"+limitesuperior+"}"); //nombre 20, esp 30
        Matcher mat = pat.matcher(nombre);
        if (!mat.matches()){

            throw new ExcepcionPropia("Dato de texto invalido");

        }
        else{
        return true;}
    }
  
    
    /*VALIDACION INT y DOUBLE*/
    
    public boolean validarNum(String valor, String intervalo,int limiteinf, int limitesup) throws ExcepcionPropia{ //mide de 1 a 8 caracteres y solo incluye numeros
        
        Pattern pat =Pattern.compile("[0-9]{"+intervalo+"}"); //intervalo: edad 1,2; peso 1,3; altura 2,3, freq ent 1,rc 2,3, exp 1,2 
        Matcher mat = pat.matcher(valor);
        if ((Integer.parseInt(valor)<limiteinf)||((Integer.parseInt(valor)>limitesup))||(!mat.matches())){ //verifica que la persona sea adulta pero no anciana

            throw new ExcepcionPropia("Dato numérico invalido");

        }
        
        return mat.matches();
    }
    
    
}