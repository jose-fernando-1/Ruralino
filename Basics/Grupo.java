package Basics;
import java.util.*;
public class Grupo {
    private String nome_do_grupo;
    private List<Pessoa> participantes;
    private List<AmigoSorteado> amigos_secretos;
    private Date data_do_sorteio;

    public Grupo(String nome_do_grupo,Date data, List<Pessoa> participantes) {
        this.nome_do_grupo = nome_do_grupo;
        this.data_do_sorteio = data;
        this.participantes = participantes;

    }



}
