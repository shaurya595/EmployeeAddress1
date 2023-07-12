package com.geekster.Employee.Service;

import com.geekster.Employee.Method.Address;
import com.geekster.Employee.Repository.IAddressDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AddressService {
    @Autowired
    IAddressDao addressDao;
    public void addAddress(Address address) {
        addressDao.save(address);
    }

    public Iterable<Address> getAllChef() {
        Iterable<Address> allAddress = addressDao.findAll();
        return allAddress;
    }


    public void removeAddressById(Integer id) {
        addressDao.deleteById(id);
    }
}
