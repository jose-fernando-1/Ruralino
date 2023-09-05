package Exceptions;

public class NomeDoGrupoJaExisteException extends Exception{
    String nome_do_grupo;
    public NomeDoGrupoJaExisteException(String nome_do_grupo)
    {
        super("Nome do grupo já existe! " + nome_do_grupo);
        if(nome_do_grupo==null)
        {
            throw new IllegalArgumentException();
        }
        this.nome_do_grupo = nome_do_grupo;
    }

}
