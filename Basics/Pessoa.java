package Basics;
import java.util.*;
public class Pessoa {
    private String nomeCompleto;
    private String apelido;
    private String senha;
    private List<Presente> lista_de_presentes;

    public Pessoa(String nomeCompleto, String apelido, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.apelido = apelido;
        this.senha = senha;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public String getApelido() {return apelido;
    }
    public String getSenha() {
        return senha;
    }
}

