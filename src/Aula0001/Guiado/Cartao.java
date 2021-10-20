package Aula0001.Guiado;

public class Cartao {

    private String nome;
    private String banco;

    public Cartao(String nome, String banco) {
        this.nome = nome;
        this.banco = banco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
}
