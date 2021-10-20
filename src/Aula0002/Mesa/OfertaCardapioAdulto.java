package Aula0002.Mesa;

public class OfertaCardapioAdulto extends OfertaCardapio {

    public OfertaCardapioAdulto(String nomeOferta, String descricao, int codigoOferta, double precoBase) {
        super(nomeOferta, descricao, codigoOferta, precoBase);
    }


    @Override
    public void montarOferta() {
        System.out.println("Atendente, monte a oferta " + getCodigoOferta());
    }

    @Override
    public void calcularOferta() {
        System.out.println("O valor desta oferta é :" + getPrecoBase());
    }
}
