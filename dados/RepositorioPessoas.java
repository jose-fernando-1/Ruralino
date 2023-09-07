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

    public List<AmigoSorteado> sortear(Grupo grupo) {


            amigosSorteados = new ArrayList<>();
            pessoas = new ArrayList<>(grupo.getParticipantes()); //se eu tirar o if, ou se a inicicalização da lista de amigos sorteados vier antes do amigosSorteados.isEmpty dá ruim.


            Random gerador = new Random();


            for (Pessoa pessoa : pessoas) {
                Pessoa amiguinho;

                do {
                    int indice = gerador.nextInt(pessoas.size());
                    amiguinho = pessoas.get(indice);
                } while (amiguinho == pessoa);
                AmigoSorteado dupla = new AmigoSorteado(pessoa, amiguinho);
                amigosSorteados.add(dupla);
                pessoa.setAmigoSorteado(amiguinho);
                pessoas.remove(amiguinho);
            }

            return amigosSorteados;
    }

}
