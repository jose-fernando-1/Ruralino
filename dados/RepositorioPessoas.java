package dados;

import Models.AmigoSorteado;
import Models.Pessoa;
import Models.Grupo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RepositorioPessoas implements InterfacePessoa{
    private List<Pessoa> pessoas;

    private List<AmigoSorteado> amigosSorteados;

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

    @Override
    public List<AmigoSorteado> sortear(Grupo grupo) {
        return null;
    }

    public List<AmigoSorteado> listarAmigosSorteados()
    {
        return amigosSorteados;
    }

    @Override
    public boolean buscarPessoaPorApelido(String apelido) {
        for(Pessoa pessoa : pessoas)
        {
            if(pessoa.getApelido().equals(apelido))
            {
                return true;
            }
        }
        return false;
    }




}
