package service;

import dao.IDao;
import model.Patient;

public class PatientService {

    private IDao<Patient> patientIDao;
    private AddressService addressService;

    public PatientService(IDao<Patient> patientIDao,
                          AddressService addressService) {
        this.patientIDao = patientIDao;
        this.addressService = addressService;
    }

    public Patient save(Patient patient) {
        addressService.save(patient.getAddress());
        return patientIDao.save(patient);
    }

    public Patient search(Integer id) {
        return patientIDao.search(id);
    }

    public void delete(Patient patient) {
        addressService.delete(patient.getAddress());
        patientIDao.delete(patient);
    }





}
