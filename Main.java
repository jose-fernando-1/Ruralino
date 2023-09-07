
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
        for (AmigoSorteado amigoSorteado : a) {
            Pessoa doador = amigoSorteado.getDoador();
            Pessoa recebedor = amigoSorteado.getRecebedor();

            System.out.println(doador.getNomeCompleto() + " -> " + recebedor.getNomeCompleto());
        }

        System.out.print("\n\n\n\n");


//*************************************************************************************



        Pessoa pessoa5,pessoa6,pessoa7,pessoa8,pessoa9;
        List<Presente> listap5,listap6,listap7,listap8,listap9;

        listap5 = new ArrayList<>();
        listap6 = new ArrayList<>();
        listap7 = new ArrayList<>();
        listap8 = new ArrayList<>();
        listap9 = new ArrayList<>();

        pessoa5 = new Pessoa("Marco aurelio", "marquinhos", "111", listap5);
        pessoa6 = new Pessoa("Paulo Azevedo", "Paulo", "222", listap6);
        pessoa7 = new Pessoa("Arthur Shelby", "tutu", "333", listap7);
        pessoa8 = new Pessoa("Charles Chaplin", "Charles", "444", listap8);
        pessoa9 = new Pessoa("Eduardo leao", "duda", "555", listap9);

        List<Pessoa> listinha2 = new ArrayList<>();

        listinha2.add(pessoa5);
        listinha2.add(pessoa6);
        listinha2.add(pessoa7);
        listinha2.add(pessoa8);
        listinha2.add(pessoa9);

        Date data2 = new Date();
        List<AmigoSorteado> amigoSorteadoslista2 = new ArrayList<>();
        Grupo grupo2 = new Grupo("capeteemo", data2, listinha2, amigoSorteadoslista2);

        List<AmigoSorteado> b = RepositorioPessoas.getInstanceRepositorioPessoas().sortear(grupo2);

        for (AmigoSorteado amigoSorteado : b) {
            Pessoa doador = amigoSorteado.getDoador();
            Pessoa recebedor = amigoSorteado.getRecebedor();

            System.out.println(doador.getNomeCompleto() + " -> " + recebedor.getNomeCompleto());
        }





    }
}
