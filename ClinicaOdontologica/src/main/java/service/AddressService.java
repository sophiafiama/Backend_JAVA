package service;

import dao.IDao;
import model.Address;

public class AddressService {

    private IDao<Address> addressIDao;

    public AddressService(IDao<Address> addressIDao) {
        this.addressIDao = addressIDao;
    }

    public Address save(Address address) {
        return addressIDao.save(address);
    }

    public Address search(Integer id) {
        return addressIDao.search(id);
    }

    public void delete(Address address) {
        addressIDao.delete(address);
    }
}
