package dados;
import Models.Grupo;
import java.util.*;
public interface InterfaceGrupo {
    void cadastrarGrupo(Grupo grupo);
    void removerGrupo(Grupo grupo);
    List<Grupo> listarGrupos();
}
