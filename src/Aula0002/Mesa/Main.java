package Aula0002.Mesa;

public class Main {
    public static void main(String[] args) {
        OfertaCardapio Oferta1 = new OfertaCardapioAdulto("Combo X-Burguer", "1 Lanche, 1Refrigerante",001,28.50);
        OfertaCardapio Oferta2 = new OfertaCardapioKids("Combo X-Burguer Kids", "1 Lanche , 1Refrigerante",002,28.50,"Cubo Mágico",5.35);
        OfertaCardapio Oferta3 = new OfertaCardápioVeg("Combo X-Burguer Veg", "1 Lanche Veg, 1Refrigerante",003,28.50,"Embalagem Verde");

        Oferta1.montarOferta();
        Oferta1.calcularOferta();

        Oferta2.montarOferta();
        Oferta2.calcularOferta();

        Oferta3.montarOferta();
        Oferta3.calcularOferta();
    }
}
