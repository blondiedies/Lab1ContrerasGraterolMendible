package lab1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Validaciones {

    public Validaciones(){}
    

    /*Validaciones para cedula*/
    public boolean validarCedula(String cedula){ //mide de 1 a 8 caracteres y solo incluye numeros
        
        Pattern pat =Pattern.compile("[0-9]{1,8}");
        Matcher mat = pat.matcher(cedula);
        if (Lab1.lista.buscarEnLista(Integer.parseInt(cedula))!=null){ //verifica que la cedula no esté repetida
            return false;
        }
        return mat.matches();
    }
    
    //otras validaciones
    public boolean validar(int limitInf , int limitSup , int dato){
        return dato > limitInf && dato < limitSup;
    }
    public boolean validar(double limitInf , double limitSup , double dato){
        return !(dato <= limitInf || dato >= limitSup);
    }
    public boolean validar(char caracter1 , char caracter2 , char dato){
        return dato == caracter1 || dato == caracter2;
    }
}