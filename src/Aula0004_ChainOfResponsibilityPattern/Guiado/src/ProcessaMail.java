package Aula0004_ChainOfResponsibilityPattern.Guiado.src;

public class ProcessaMail {
    public static void main(String[] args) {
        CheckMail processo = new CheckMail();
        processo.verificarEmails(new Mail("email@email.com", "tecnica@digitalhouse.com", "Reclamação"));
        processo.verificarEmails(new Mail("email@email.com", "csdcsa@digitalhouse.com", "Gerencia"));
        processo.verificarEmails(new Mail("email@email.com", "gerencia@colmeia.com", "Comercial"));
    }
}
