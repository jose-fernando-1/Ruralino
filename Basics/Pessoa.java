package Basics;
import java.util.*;
public class Pessoa {
    private String nomeCompleto;
    private String apelido;
    private String senha;
    private List<Presente> lista_de_presentes;

    public Pessoa(String nomeCompleto, String apelido, String senha,List<Presente> lista_de_presentes) {
        this.nomeCompleto = nomeCompleto;
        this.apelido = apelido;
        this.senha = senha;
        this.lista_de_presentes = lista_de_presentes;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public String getApelido() {return apelido;
    }
    public String getSenha() {
        return senha;
    }
    public List<Presente> getLista_de_Presentes()
    {
        return lista_de_presentes;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setLista_de_presentes(List<Presente> lista_de_presentes) {
        this.lista_de_presentes = lista_de_presentes;
    }
}

