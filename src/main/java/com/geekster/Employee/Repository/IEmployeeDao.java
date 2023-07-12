package com.geekster.Employee.Repository;

import com.geekster.Employee.Method.employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeDao extends CrudRepository<employee,Integer> {
}
