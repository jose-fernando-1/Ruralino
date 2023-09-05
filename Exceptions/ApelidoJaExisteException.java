package Exceptions;

public class ApelidoJaExisteException extends Exception{
    String apelido;
    public ApelidoJaExisteException(String apelido)
    {
        super("Apelido já existe! " + apelido);
        if(apelido==null)
        {
            throw new IllegalArgumentException();
        }
        this.apelido = apelido;
    }

}
