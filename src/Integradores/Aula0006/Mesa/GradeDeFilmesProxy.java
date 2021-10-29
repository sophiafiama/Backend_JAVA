package Integradores.Aula0006.Mesa;

public class GradeDeFilmesProxy implements IGradeDeFilmes {

    private int IP_1;
    private int IP_2;
    private int IP_3;
    private int IP_4;
    private GradeDeFilmes catalogo;


    public GradeDeFilmesProxy(int IP_1, int IP_2, int IP_3, int IP_4, GradeDeFilmes catalogo) {
        this.IP_1 = IP_1;
        this.IP_2 = IP_2;
        this.IP_3 = IP_3;
        this.IP_4 = IP_4;
        this.catalogo = catalogo;
    }

    @Override
    public Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException{
        Filme filmeVerificado = catalogo.getFilme(nomeDoFilme);
        if(filmeVerificado.getPais().equalsIgnoreCase(verificarPais())){
            System.out.println("O filme "+filmeVerificado.getNome()+" está pronto para você assistir!");
            return filmeVerificado;
        }else
            throw new FilmeNaoHabilitadoException("O filme "+filmeVerificado.getNome()+" não está disponível em seu país.");
    }

    public String verificarPais() {
        if (IP_1 < 50) {
            return "Argentina";
        }
        if (IP_1 < 100) {
            return "Brasil";
        }
        if (IP_1 < 150) {
            return "Colômbia";
        } else {
            return "País não localizado";
        }
    }
}