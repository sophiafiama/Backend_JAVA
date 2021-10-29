package Integradores.Aula0006.Mesa;

public class FilmeNaoHabilitadoException extends Exception{

    public FilmeNaoHabilitadoException(){
        super();
    }

    public FilmeNaoHabilitadoException(String mensagem){
        super(mensagem);
    }
}
