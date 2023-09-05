package dados;
import Models.Pessoa;
import java.util.*;
public interface InterfacePessoa {
    void cadastrarPessoa(Pessoa pessoa);
    void removerPessoa(Pessoa pessoa);
    List<Pessoa> listarPessoas();
}
