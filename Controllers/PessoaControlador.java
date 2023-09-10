package Controllers;
import java.util.*;
import Models.*;
import dados.RepositorioGrupos;
import dados.RepositorioPessoas;
import dados.InterfacePessoa;
import Exceptions.ApelidoJaExisteException;
import Exceptions.PessoaNaoCadastradaException;
public class PessoaControlador {
    private InterfacePessoa repositorioPessoas;
    private static PessoaControlador instance;

    private PessoaControlador()
    {
        repositorioPessoas = RepositorioPessoas.getInstanceRepositorioPessoas();
    }

    public static PessoaControlador getInstancePessoaControlador(){
        if(instance == null){
            instance = new PessoaControlador();
        }
        return instance;
    }

    public void cadastrarPessoa(Pessoa pessoa) throws ApelidoJaExisteException
    {
        if(repositorioPessoas.buscarPessoaPorApelido(pessoa.getApelido()))
        {
             throw new ApelidoJaExisteException(pessoa.getApelido());
        }
        else
        {
            repositorioPessoas.cadastrarPessoa(pessoa);
        }
    }

    public List<Pessoa> retornaListaPessoa()
    {
        return RepositorioPessoas.getInstanceRepositorioPessoas().listarPessoas();
    }

    public List<AmigoSorteado> retornaListaAmigoSorteado()
    {
        return RepositorioPessoas.getInstanceRepositorioPessoas().listarAmigosSorteados();
    }



}
