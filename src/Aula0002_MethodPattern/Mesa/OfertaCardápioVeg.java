package Aula0002_MethodPattern.Mesa;

public class OfertaCardápioVeg extends OfertaCardapio {
        private String embalagem;

    public OfertaCardápioVeg(String nomeOferta, String descricao, int codigoOferta, double precoBase, String embalagem) {
        super(nomeOferta, descricao, codigoOferta, precoBase);
        this.embalagem = embalagem;
    }

    @Override
    public void montarOferta() {
        System.out.println("Atendente, monte a oferta " + getCodigoOferta());
        System.out.println("Adicione a embalagem do Cardápio Vegetariano");
        System.out.println("Adicione os condimentos do Cardápio Vegetariano");
    }

    @Override
    public void calcularOferta() {
        System.out.println("O valor desta oferta é :" + getPrecoBase()*1.1);
    }
}
