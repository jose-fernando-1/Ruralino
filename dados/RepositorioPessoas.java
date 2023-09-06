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

    public void sortear() {

        List<Pessoa> participantesEmbaralhados = new ArrayList<>(pessoas);
        amigosSorteados.clear();
        Random gerador = new Random();

        for (Pessoa participante : pessoas) {
            Pessoa amigoSecreto;
            do {
                int indiceSorteado = gerador.nextInt(participantesEmbaralhados.size());
                amigoSecreto = participantesEmbaralhados.get(indiceSorteado);
            } while (amigoSecreto == participante);

            AmigoSorteado amigoSorteado = new AmigoSorteado(participante, amigoSecreto);
            amigosSorteados.add(amigoSorteado);

            participante.setAmigoSorteado(amigoSecreto);
            participantesEmbaralhados.remove(amigoSecreto);
        }

    }




}
