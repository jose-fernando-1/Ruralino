package dados;

import Models.AmigoSorteado;
import Models.Pessoa;
import Models.Grupo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RepositorioPessoas implements InterfacePessoa{
    private List<Pessoa> pessoas;
    private List<Pessoa> pessoas_nao_sorteadas;
    Random gerador = new Random();
private static RepositorioPessoas uniqueInstance = null;
    private RepositorioPessoas()
    {
        pessoas = new ArrayList<>();
        pessoas_nao_sorteadas = pessoas;
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
        pessoas_nao_sorteadas.add(pessoa);
    }

    public void removerPessoa(Pessoa pessoa)
    {
        pessoas.remove(pessoa);
        pessoas_nao_sorteadas.remove(pessoa);
    }

    public List<Pessoa> listarPessoas()
    {
        return pessoas;
    }

    public AmigoSorteado sortear(Grupo grupo)
    {
       for(Pessoa pessoas : grupo.getParticipantes())
       {
           int aleatorio = gerador.nextInt(grupo.getParticipantes().size());
       }
    }




}
