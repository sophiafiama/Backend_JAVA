import dao.ConfigJDBC;
import dao.impl.AddressDaoImpl;
import dao.impl.PatientDaoImpl;
import model.Address;
import model.Patient;
import org.junit.jupiter.api.Test;
import service.AddressService;
import service.PatientService;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PatientTest {

    private PatientService patientService = new PatientService(new PatientDaoImpl(new ConfigJDBC()), new AddressService(new AddressDaoImpl(new ConfigJDBC())));

    @Test
    public void savingPatient() {
        Patient patient = new Patient("Gustavo", "Barretto", "1326299760", "05/11/2021", new Address("Rua Amazonas", 953, "Salvador", "Bahia"));
        patientService.save(patient);
        assertTrue(patient.getId() != null);

    }

    @Test
    public void searchingPatient() {
        Patient patient = new Patient("Gustavo", "Barretto", "1326299760", "05/11/2021", new Address("Rua Amazonas", 953, "Salvador", "Bahia"));
        patientService.save(patient);
        assertTrue(patient.getId() != null);
        Patient patientSearched = patientService.search(patient.getId());
        assertTrue(patientSearched.getId() != null);
    }

}
