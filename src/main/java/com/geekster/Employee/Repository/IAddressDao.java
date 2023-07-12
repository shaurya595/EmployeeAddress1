package com.geekster.Employee.Repository;

import com.geekster.Employee.Method.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressDao extends CrudRepository<Address,Integer> {
}
