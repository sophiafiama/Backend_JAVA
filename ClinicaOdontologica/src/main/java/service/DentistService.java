package service;

import dao.IDao;
import model.Dentist;

public class DentistService {

    private IDao<Dentist> dentistIDao;

    public DentistService(IDao<Dentist> dentistIDao) {
        this.dentistIDao = dentistIDao;
    }

    public Dentist save(Dentist dentist) {
        return dentistIDao.save(dentist);
    }

    public Dentist search(Integer id) {
        return dentistIDao.search(id);
    }

}
