package dados;

import Models.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPessoas implements InterfacePessoa{
    private List<Pessoa> pessoas;
private static RepositorioPessoas uniqueInstance = null;
    private RepositorioPessoas()
    {
        pessoas = new ArrayList<>();
    }

    public static RepositorioPessoas getInstanceRepositorioPessoas()
    {
        if(uniqueInstance==null)
        {
            uniqueInstance = new RepositorioPessoas();
        }
        return uniqueInstance;
    }

    public void cadastrarPessoa(Pessoa pessoa)
    {
        pessoas.add(pessoa);
    }

    public void removerPessoa(Pessoa pessoa)
    {
        pessoas.remove(pessoa);
    }

    public List<Pessoa> listarPessoas()
    {
        return pessoas;
    }

}
