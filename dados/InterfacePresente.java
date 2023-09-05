package dados;
import Models.Presente;
import java.util.*;
public interface InterfacePresente {
    void cadastrarPresente(Presente presente);
    void removerPresente(Presente presente);
    List<Presente> listarPresentes();
}
