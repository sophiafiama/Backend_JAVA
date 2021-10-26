package Aula0001_FacadePattern.Mesa;

import java.time.LocalDate;

public interface IFachadaBusca {
    public void buscar (String Destino, LocalDate dataIda, LocalDate dataVolta);
}
