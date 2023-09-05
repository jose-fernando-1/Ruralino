package dados;
import Models.Presente;
import java.util.*;
public class RepositorioPresentes {
    private List<Presente> presentes;
    private static RepositorioPresentes uniqueInstance = null;

    private RepositorioPresentes()
    {
        presentes = new ArrayList<>();
    }

   private static RepositorioPresentes getInstanceRepositorioPresentes()
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

}
