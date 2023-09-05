package Basics;
import java.util.*;
public class Grupo {
    private String nome_do_grupo;
    private List<Pessoa> participantes;
    private List<AmigoSorteado> amigos_secretos;
    private Date data_do_sorteio;

    public Grupo(String nome_do_grupo,Date data, List<Pessoa> participantes, List<AmigoSorteado> amigos_secretos) {
        this.nome_do_grupo = nome_do_grupo;
        this.data_do_sorteio = data;
        this.participantes = participantes;
        this.amigos_secretos = amigos_secretos;

    }

    public String getNome_do_grupo() {
        return nome_do_grupo;
    }

    public List<AmigoSorteado> getAmigos_secretos() {
        return amigos_secretos;
    }

    public Date getData_do_sorteio() {
        return data_do_sorteio;
    }

    public List<Pessoa> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Pessoa> participantes) {
        this.participantes = participantes;
    }

    public void setAmigos_secretos(List<AmigoSorteado> amigos_secretos) {
        this.amigos_secretos = amigos_secretos;
    }

    public void setData_do_sorteio(Date data_do_sorteio) {
        this.data_do_sorteio = data_do_sorteio;
    }

    public void setNome_do_grupo(String nome_do_grupo) {
        this.nome_do_grupo = nome_do_grupo;
    }
}
