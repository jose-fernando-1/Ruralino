package dados;
import Models.Presente;
import Models.Pessoa;
import dados.RepositorioPessoas;
import java.util.*;
public class RepositorioPresentes implements InterfacePresente {
    private List<Presente> presentes;
    private static RepositorioPresentes uniqueInstance = null;

    private RepositorioPresentes()
    {
        presentes = new ArrayList<>();
    }

   public static RepositorioPresentes getInstanceRepositorioPresentes()
    {
        if(uniqueInstance==null)
        {
            uniqueInstance = new RepositorioPresentes();
        }
        return uniqueInstance;
    }


    public void cadastrarPresente(Presente presente)
    {
        presentes.add(presente);
    }
    public void removerPresente(Presente presente)
    {
        presentes.remove(presente);
    }

    public List<Presente> listarPresentes()
    {
        return presentes;
    }

    public void adicionarNaListaDeDesejos(Pessoa pessoa,Presente presente)
    {
        pessoa.getLista_de_Desejos().add(presente);
    }

    public void removerDaListaDeDesejos(Pessoa pessoa, Presente presente)
    {
        pessoa.getLista_de_Desejos().remove(presente);
    }

}
