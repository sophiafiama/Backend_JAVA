package Aula0001_FacadePattern.Guiado;

public class ApiProduto {

    public static int  desconto(Produto p){
        if(p.getTipo().compareTo("Lata")==0){
            return 10;
        } return 0;
    }
}
