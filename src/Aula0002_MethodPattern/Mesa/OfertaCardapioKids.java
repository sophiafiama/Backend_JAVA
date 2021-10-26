package Aula0002_MethodPattern.Mesa;

public class OfertaCardapioKids extends OfertaCardapio {

    private String brinde;
    private double adicional;

    public OfertaCardapioKids(String nomeOferta, String descricao, int codigoOferta, double precoBase, String brinde, double adicional) {
        super(nomeOferta, descricao, codigoOferta, precoBase);
        this.brinde = brinde;
        this.adicional = adicional;
    }

    @Override
    public void montarOferta() {
        System.out.println("Atendente, monte a oferta " + getCodigoOferta());
        System.out.println("Adicione o Brinde do Cardápio Kids: "+ brinde);
    }

    @Override
    public void calcularOferta() {
        System.out.println("O valor desta oferta é :" + (getPrecoBase()+adicional));
    }
}
