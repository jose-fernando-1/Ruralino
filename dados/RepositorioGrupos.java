package dados;
import Models.Grupo;
import Models.Pessoa;
import java.util.*;
public class RepositorioGrupos implements InterfaceGrupo{
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

    public List<Grupo> listarGrupos()
    {
        return grupos;
    }





    @Override
    public boolean buscarGrupoPorNome(Grupo grupo) {
        for(Grupo grupo1 : grupos)
        {
            if(grupo1.getNome_do_grupo().equals(grupo.getNome_do_grupo()))
            {
                return true;
            }
        }
        return false;
    }

    public void adicionarPessoaNoGrupo(Grupo grupo, Pessoa pessoa)
    {

    }
}
