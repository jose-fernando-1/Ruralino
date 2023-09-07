
import Models.*;
import java.util.*;
import dados.*;
public class Main {


    public static void main(String[] args) {

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

        List<Pessoa> listinha = new ArrayList<>();
        listinha.add(pessoa1);
        listinha.add(pessoa2);
        listinha.add(pessoa3);
        listinha.add(pessoa4);

        Date data = new Date();
        List<AmigoSorteado> amigoSorteadoslista = new ArrayList<>();

        Grupo grupo1 = new Grupo("turminha da baderna", data, listinha, amigoSorteadoslista);

       List<AmigoSorteado> a = RepositorioPessoas.getInstanceRepositorioPessoas().sortear(grupo1);
       System.out.println(a);

    }
}
