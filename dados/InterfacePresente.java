package dados;
import Models.Pessoa;
import Models.Presente;
import java.util.*;
public interface InterfacePresente {
    void cadastrarPresente(Presente presente);
    void removerPresente(Presente presente);
    List<Presente> listarPresentes();

    void adicionarNaListaDeDesejos(Pessoa pessoa, Presente presente);
    void removerDaListaDeDesejos(Pessoa pessoa, Presente presente);
}
