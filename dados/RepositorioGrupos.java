package dados;
import Models.Grupo;
import java.util.*;
public class RepositorioGrupos {
    private List<Grupo> grupos;

    private static RepositorioGrupos uniqueInstance = null;

    private RepositorioGrupos()
    {
        grupos = new ArrayList<>();
    }

    public static RepositorioGrupos getInstanceRepositorioGrupos()
    {
        if(uniqueInstance==null)
        {
            uniqueInstance = new RepositorioGrupos();
        }
        return uniqueInstance;
    }

    public void cadastrarGrupo(Grupo grupo)
    {
        grupos.add(grupo);
    }
    public void removerGrupo(Grupo grupo)
    {
        grupos.remove(grupo);
    }
}
