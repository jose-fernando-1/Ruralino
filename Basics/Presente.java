package Basics;
import java.util.*;
public class Presente {
    private String categoria;
    private String descricao;
    private double preco;

    public Presente(String categoria, String descricao, double preco)
    {
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }
    public double getPreco() {
        return preco;
    }

    public void setCategoria(String categoria) {

        this.categoria = categoria;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public void setPreco(double preco) {

        this.preco = preco;
    }


}
