package Controllers;
import java.util.*;

import Exceptions.NomeDoGrupoJaExisteException;
import Exceptions.GrupoNaoCadastradoException;
import Exceptions.PessoaNaoCadastradaException;
import Models.Grupo;
import Models.Pessoa;
import dados.InterfacePessoa;
import dados.RepositorioPessoas;
import dados.InterfaceGrupo;
import dados.RepositorioGrupos;

public class GrupoControlador {
    private InterfaceGrupo repositorioGrupos;
    private InterfacePessoa repositorioPessoa;
    private static GrupoControlador instance;

    private GrupoControlador()
    {
        repositorioGrupos = RepositorioGrupos.getInstanceRepositorioGrupos();
        repositorioPessoa = RepositorioPessoas.getInstanceRepositorioPessoas();
    }

    public static GrupoControlador getInstanceGrupoControlador(){
        if(instance == null){
            instance = new GrupoControlador();
        }
        return instance;
    }



    public void cadastrarGrupo(Grupo grupo) throws NomeDoGrupoJaExisteException
    {
        if(repositorioGrupos.buscarGrupoPorNome(grupo))
        {
            throw new NomeDoGrupoJaExisteException(grupo.getNome_do_grupo());
        }
        else
        {
            repositorioGrupos.cadastrarGrupo(grupo);
        }
    }

    public void adicionarPessoaNoGrupo(Grupo grupo,Pessoa pessoa) throws GrupoNaoCadastradoException,PessoaNaoCadastradaException
    {
        if(!repositorioGrupos.buscarGrupoPorNome(grupo) || !repositorioPessoa.buscarPessoaPorApelido(pessoa.getApelido()))
        {
            throw new GrupoNaoCadastradoException(grupo.getNome_do_grupo());
        }
        else
        {
            grupo.getParticipantes().add(pessoa);
        }
    }



}
