package Aula0001_FacadePattern.Guiado;

public class FachadaDesconto implements IFachadaDesconto{

    private  ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    public FachadaDesconto() {
        this.apiCartao = new ApiCartao();
        this.apiProduto = new ApiProduto();
        this.apiQuantidade = new ApiQuantidade();
    }

    @Override
    public int desconto(Cartao c, Produto p, int quantidade) {
        int desconto = 0;
        desconto += ApiQuantidade.desconto(quantidade);
        desconto += ApiProduto.desconto(p);
        desconto += ApiCartao.desconto(c);
        return desconto;
    }
}
