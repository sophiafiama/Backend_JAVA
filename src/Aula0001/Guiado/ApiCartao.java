package Aula0001.Guiado;

public class ApiCartao {

    public static int  desconto(Cartao c){
        if(c.getBanco().compareTo("Star Banck")==0){
            return 20;
        } return 0;
    }
}
