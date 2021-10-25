package Aula0004.Guiado.src;

public class GerenciadorSpam extends Gerenciador{

    @Override
    public void verificar(Mail mail) {
        System.out.println("Marcado como spam");
    }
}
