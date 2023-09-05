package Exceptions;

public class GrupoNaoCadastradoException extends Exception{
    String nome_do_grupo;
    public GrupoNaoCadastradoException(String nome_do_grupo)
    {
        super("Grupo não cadastrado! " + nome_do_grupo);
        if(nome_do_grupo==null)
        {
            throw new IllegalArgumentException();
        }
        this.nome_do_grupo = nome_do_grupo;
    }

}
