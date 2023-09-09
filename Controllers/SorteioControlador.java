package Controllers;

import Models.AmigoSorteado;
import Models.Grupo;
import Models.Pessoa;
import dados.RepositorioPessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SorteioControlador {

    private List<AmigoSorteado> amigosSorteados;

    private static SorteioControlador instance;

    public static SorteioControlador getInstanceSorteioControlador(){
        if(instance == null){
            instance = new SorteioControlador();
        }
        return instance;
    }

    public List<AmigoSorteado> sortear(Grupo grupo) {
        amigosSorteados = new ArrayList<>();
        List<Pessoa> participantes = new ArrayList<>(grupo.getParticipantes()); // Cria uma cópia da lista de participantes e itera nela

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

    public void imprimirSorteio()
    {
        for (AmigoSorteado amigoSorteado : this.amigosSorteados) {
            Pessoa doador = amigoSorteado.getDoador();
            Pessoa recebedor = amigoSorteado.getRecebedor();

            System.out.println(doador.getNomeCompleto() + " -> " + recebedor.getNomeCompleto());
        }
    }

}
