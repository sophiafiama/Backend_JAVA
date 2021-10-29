package Integradores.Aula0006.Mesa;

import java.util.ArrayList;
import java.util.List;

public class GradeDeFilmes implements IGradeDeFilmes {

    static List<Filme> listaDeFilmes = new ArrayList<>();

    static List<Filme> getListaDeFilmes(){
        return listaDeFilmes;
    }

    public void addFilme(Filme filme){
        listaDeFilmes.add(filme);
    };

    @Override
    public Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException {
        return GradeDeFilmes.getListaDeFilmes().stream().filter(obj -> obj.getNome()
                .equalsIgnoreCase(nomeDoFilme)).findFirst().orElse(null);
    }
}