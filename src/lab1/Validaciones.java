package lab1;

class Validaciones {

    public Validaciones(){}

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