package Aula0004_ChainOfResponsibilityPattern.Guiado.src;

public class GerenciadorGerencia extends Gerenciador{

    @Override
    public void verificar(Mail mail) {
        if ((mail.getDestino().equalsIgnoreCase("gerencia@colmeia.com")) ||
                (mail.getAssunto().equalsIgnoreCase("Gerencia"))){
            System.out.println("Enviado ao departamento gerencial");
        } else {
            if(this.getGerenciadorSeguinte() != null){
                this.getGerenciadorSeguinte().verificar(mail);
            }
        }
    }
}