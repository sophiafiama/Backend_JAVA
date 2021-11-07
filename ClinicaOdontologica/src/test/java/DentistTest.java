import dao.ConfigJDBC;
import dao.impl.DentistDaoImpl;
import model.Dentist;
import org.junit.jupiter.api.Test;
import service.DentistService;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DentistTest {

    private DentistService dentistService = new DentistService(new DentistDaoImpl());

    @Test
    public void searchingDentist() {
        Dentist dentist = new Dentist("REG123", "Gustavo", "Teles");
        dentistService.save(dentist);
        assertTrue(dentist.getId() != null);
        Dentist dentistSearched = dentistService.search(dentist.getId());
        assertTrue(dentistSearched.getId() != null);
    }

}
