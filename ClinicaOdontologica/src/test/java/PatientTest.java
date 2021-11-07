import dao.ConfigJDBC;
import dao.impl.AddressDaoImpl;
import dao.impl.PatientDaoImpl;
import model.Address;
import model.Patient;
import org.junit.jupiter.api.Test;
import service.AddressService;
import service.PatientService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PatientTest {

    private PatientService patientService = new PatientService(new PatientDaoImpl(), new AddressService(new AddressDaoImpl()));

    @Test
    public void savingPatient() {
        Patient patient = new Patient("Gustavo", "Barretto", "1326299760", "05/11/2021", new Address("Rua Amazonas", 953, "Salvador", "Bahia"));
        patientService.save(patient);
        assertTrue(patient.getId() != null);

    }

    @Test
    public void searchingPatient() {
        Patient patient = new Patient("Gustavo", "Barretto", "1326299760", "05/11/2021", new Address("Rua Amazonas", 953, "Salvador", "Bahia"));
        Patient patient2 = new Patient("Eduardo", "Araújo", "12345678", "04/11/2021", new Address ("Rua Marília", 101, "Marília", "São Paulo"));
        patientService.save(patient);
        patientService.save((patient2));
        assertTrue(patient.getId() != null);
        Patient patientSearched = patientService.search(patient.getId());
        assertTrue(patientSearched.getId() != null);
        Patient patientSearched2 = patientService.search(patient2.getId());
        assertTrue(patientSearched2.getId() != null);
    }

    @Test
    public void searchingPatientsAll() {
        Patient patient = new Patient("Gustavo", "Barretto", "1326299760", "05/11/2021", new Address("Rua Amazonas", 953, "Salvador", "Bahia"));
        Patient patient2 = new Patient("Eduardo", "Araújo", "12345678", "04/11/2021", new Address ("Rua Marília", 101, "Marília", "São Paulo"));
        patientService.save(patient);
        patientService.save((patient2));
        List<Patient> patients = patientService.searchAllPatients();

        assertFalse(patients.isEmpty());

    }

    @Test
    public void deletingPatientsAll() {
        Patient patient = new Patient("Gustavo", "Barretto", "1326299760", "05/11/2021", new Address("Rua Amazonas", 953, "Salvador", "Bahia"));
        Patient patient2 = new Patient("Eduardo", "Araújo", "12345678", "04/11/2021", new Address ("Rua Marília", 101, "Marília", "São Paulo"));
        patientService.save(patient);
        patientService.save((patient2));

        assertTrue(patient.getId() != null);
        patientService.delete(patient);
        assertFalse(patientService.search(patient.getId()) != null);

    }

}
