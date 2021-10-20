package Aula0001.Guiado;

public class Main {

    public static void main(String[] args) {
    IFachadaDesconto fachada = new FachadaDesconto();

    Cartao cartao1 = new Cartao("1234567890", "Star Banck");
    Produto produto1 = new Produto("Ervilha","Congelada");
        System.out.println("Desconto:" + fachada.desconto(cartao1,produto1,5));


        cartao1.setBanco("Banco Teste");
        produto1.setTipo("Lata");

        System.out.println("Desconto:" + fachada.desconto(cartao1,produto1,5));
        System.out.println("Desconto:" + fachada.desconto(cartao1,produto1,15));
    }
}
