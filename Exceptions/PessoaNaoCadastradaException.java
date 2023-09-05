package Exceptions;

public class PessoaNaoCadastradaException extends Exception{
    String pessoa;
    public PessoaNaoCadastradaException(String pessoa)
    {
        super("Pessoa não cadastrada! " + pessoa);
        if(pessoa==null)
        {
            throw new IllegalArgumentException();
        }
        this.pessoa = pessoa;
    }


}
