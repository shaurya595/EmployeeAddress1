package com.geekster.Employee.Service;


import com.geekster.Employee.Method.employee;
import com.geekster.Employee.Repository.IEmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeDao employeeDao;

    public void addEmployee(employee employee) {
        employeeDao.save(employee);
    }

    public Iterable<employee> getAllEmployee() {
        Iterable<employee> allEmployee = employeeDao.findAll();
        return allEmployee;
    }
}
