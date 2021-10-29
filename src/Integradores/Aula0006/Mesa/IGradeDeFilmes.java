package Integradores.Aula0006.Mesa;

public interface IGradeDeFilmes {
    public abstract Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException;
}