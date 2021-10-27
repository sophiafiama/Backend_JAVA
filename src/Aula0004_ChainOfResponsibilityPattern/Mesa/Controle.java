package Aula0004_ChainOfResponsibilityPattern.Mesa;

public abstract class Controle {

    protected Controle controleseguinte;

    public Controle getControleseguinte() {
        return controleseguinte;
    }

    public void setControleseguinte(Controle controleseguinte) {
        this.controleseguinte = controleseguinte;
    }

    public abstract void verificarProduto(Produto produto);
}
