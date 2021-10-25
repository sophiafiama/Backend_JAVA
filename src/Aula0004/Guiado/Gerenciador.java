package Aula0004.Guiado;

public class Gerenciador {
    protected Gerenciador gerenciadorSgeuinte;

    public Gerenciador(Gerenciador gerenciadorSgeuinte) {
        this.gerenciadorSgeuinte = gerenciadorSgeuinte;
    }

    public void setGerenciadorSeguinte( Gerenciador gerenciadorSeguinte){
        this.gerenciadorSgeuinte = gerenciadorSeguinte;
    };

    public void verificar(Mail mail){

    };
}
