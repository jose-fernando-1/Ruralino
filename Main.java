
import Controllers.GrupoControlador;
import Controllers.PessoaControlador;
import Controllers.SorteioControlador;
import Models.*;
import java.util.*;
import dados.*;

public class Main {


    public static void main(String[] args) {

        PessoaControlador controladorPessoa = PessoaControlador.getInstancePessoaControlador();
        GrupoControlador controladorGrupo = GrupoControlador.getInstanceGrupoControlador();
        SorteioControlador controladorSorteio = SorteioControlador.getInstanceSorteioControlador();





        Pessoa pessoa1,pessoa2,pessoa3,pessoa4;
        List<Presente> listap1,listap2,listap3,listap4;

        listap1 = new ArrayList<>();
        listap2 = new ArrayList<>();
        listap3 = new ArrayList<>();
        listap4 = new ArrayList<>();

        pessoa1 = new Pessoa("joao victor", "joaozinho", "123", listap1);
        pessoa2 = new Pessoa("josé afonso", "ze", "000", listap2);
        pessoa3 = new Pessoa("maria capoeira", "mari", "456", listap3);
        pessoa4 = new Pessoa("liu kang", "lizinho", "789", listap4);

        controladorPessoa.cadastrarPessoa(pessoa1);
        controladorPessoa.cadastrarPessoa(pessoa2);
        controladorPessoa.cadastrarPessoa(pessoa3);
        controladorPessoa.cadastrarPessoa(pessoa4);



        Date data = new Date();

        Grupo grupo1 = new Grupo("grupo1", data, controladorPessoa.retornaListaPessoa(),controladorPessoa.retornaListaAmigoSorteado());

        List<AmigoSorteado> ab = controladorSorteio.sortear(grupo1);

        controladorSorteio.imprimirSorteio();






System.out.print("\n\n\n");







//*************************************************************************************


    }
}
