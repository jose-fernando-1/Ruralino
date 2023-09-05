package Models;

public class AmigoSorteado {
    private Pessoa doador;
    private Pessoa recebedor;

    public AmigoSorteado(Pessoa doador,Pessoa recebedor) {
        this.doador = doador;
        this.recebedor = recebedor;
    }

    public Pessoa getDoador() {
        return doador;
    }

    public Pessoa getRecebedor() {
        return recebedor;
    }

    public void setDoador(Pessoa doador) {
        this.doador = doador;
    }

    public void setRecebedor(Pessoa recebedor) {
        this.recebedor = recebedor;
    }
}
