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

    public List<AmigoSorteado> sortear(Grupo grupo) {
        amigosSorteados = new ArrayList<>();
        List<Pessoa> participantes = new ArrayList<>(grupo.getParticipantes()); // Crie uma cópia da lista de participantes

        Random gerador = new Random();

        for (Pessoa pessoa : grupo.getParticipantes()) {
            Pessoa amiguinho;

            do {
                int indice = gerador.nextInt(participantes.size());
                amiguinho = participantes.get(indice);
            } while (amiguinho == pessoa);

            AmigoSorteado dupla = new AmigoSorteado(pessoa, amiguinho);
            amigosSorteados.add(dupla);
            pessoa.setAmigoSorteado(amiguinho);
            participantes.remove(amiguinho);
        }

        return amigosSorteados;
    }


}
