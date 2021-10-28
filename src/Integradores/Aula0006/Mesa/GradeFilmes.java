package Integradores.Aula0006.Mesa;

import java.util.ArrayList;
import java.util.List;

public class GradeFilmes implements IGradeFilmes{

    static List<Filme> gradeDeFilmes =  new ArrayList<>();

    static List<Filme> getList(){
        return gradeDeFilmes;
    }


    @Override
    public Filme getFilme(String nome) {

    }

}
