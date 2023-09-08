package dados;
import Models.Grupo;
import Models.Pessoa;
import java.util.*;
public interface InterfaceGrupo {
    void cadastrarGrupo(Grupo grupo);
    void removerGrupo(Grupo grupo);
    List<Grupo> listarGrupos();

    boolean buscarGrupoPorNome(Grupo grupo);
    void adicionarPessoaNoGrupo(Grupo grupo, Pessoa pessoa);
}
