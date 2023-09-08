package dados;
import Models.AmigoSorteado;
import Models.*;
import java.util.*;
public interface InterfacePessoa {
    void cadastrarPessoa(Pessoa pessoa);
    void removerPessoa(Pessoa pessoa);
    List<Pessoa> listarPessoas();
    List<AmigoSorteado> sortear(Grupo grupo);

    boolean buscarPessoaPorApelido(String apelido);
}
