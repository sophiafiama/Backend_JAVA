package Aula0002.Mesa;

public abstract class OfertaCardapio {

    private String nomeOferta;
    private String descricao;
    private int codigoOferta;
    private double precoBase;

    public OfertaCardapio(String nomeOferta, String descricao, int codigoOferta, double precoBase) {
        this.nomeOferta = nomeOferta;
        this.descricao = descricao;
        this.codigoOferta = codigoOferta;
        this.precoBase = precoBase;
    };

    public String getNomeOferta() {
        return nomeOferta;
    }

    public void setNomeOferta(String nomeOferta) {
        this.nomeOferta = nomeOferta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigoOferta() {
        return codigoOferta;
    }

    public void setCodigoOferta(int codigoOferta) {
        this.codigoOferta = codigoOferta;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public abstract void montarOferta();
    public abstract void calcularOferta();


}
