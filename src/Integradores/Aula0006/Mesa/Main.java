package Integradores.Aula0006.Mesa;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Onde os Fracos Não Têm Vez","Mexico");
        Filme filme2 = new Filme("O Auto da Compadecida","Brasil");
        Filme filme3 = new Filme("O Labirinto do Fauno","Colômbia");
        Filme filme4 = new Filme("A Pele Que Habito","Argentina");

        GradeDeFilmes catalogoDeFilmes = new GradeDeFilmes();

        catalogoDeFilmes.addFilme(filme1);
        catalogoDeFilmes.addFilme(filme2);
        catalogoDeFilmes.addFilme(filme3);
        catalogoDeFilmes.addFilme(filme4);

        // Instânciando a camada do IP
        IGradeDeFilmes clienteArgentina = new GradeDeFilmesProxy(36,219,001,056, catalogoDeFilmes);

        try {
            clienteArgentina.getFilme("O Auto da Compadecida");
        } catch (FilmeNaoHabilitadoException exception){
            System.err.println(exception.getMessage());
        }

        try {
            clienteArgentina.getFilme("A Pele Que Habito");
        } catch (FilmeNaoHabilitadoException exception){
            System.err.println(exception.getMessage());
        }

        // Instânciando a camada do IP
        IGradeDeFilmes clienteBrasil = new GradeDeFilmesProxy(81,201,192,123, catalogoDeFilmes);

        try {
            clienteBrasil.getFilme("O Auto da Compadecida");
        } catch (FilmeNaoHabilitadoException exception){
            System.err.println(exception.getMessage());
        }

        try {
            clienteBrasil.getFilme("Onde os Fracos Não Têm Vez");
        } catch (FilmeNaoHabilitadoException exception){
            System.err.println(exception.getMessage());
        }

        // Instânciando a camada do IP
        IGradeDeFilmes clienteColombia = new GradeDeFilmesProxy(112,117,222,244, catalogoDeFilmes);

        try {
            clienteColombia.getFilme("O Labirinto do Fauno");
        } catch (FilmeNaoHabilitadoException exception){
            System.err.println(exception.getMessage());
        }

        try {
            clienteColombia.getFilme("Onde os Fracos Não Têm Vez");
        } catch (FilmeNaoHabilitadoException exception){
            System.err.println(exception.getMessage());
        }

    }

}