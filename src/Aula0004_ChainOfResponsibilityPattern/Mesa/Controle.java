package Aula0004_ChainOfResponsibilityPattern.Mesa;

import Aula0004_ChainOfResponsibilityPattern.Guiado.src.Mail;

public class Controle {

    protected Controle controleseguinte;

    public Controle getControleseguinte() {
        return controleseguinte;
    }

    public void setControleseguinte(Controle controleseguinte) {
        this.controleseguinte = controleseguinte;
    }

    public abstract void verificar(Produto produto);
}
