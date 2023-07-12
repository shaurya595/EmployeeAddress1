package com.geekster.Employee.Controller;


import com.geekster.Employee.Method.employee;
import com.geekster.Employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping()
    public void addEmployee(@RequestBody employee Employee){
        employeeService.addEmployee(Employee);
    }
    @GetMapping()
    public Iterable<employee> getEmployee(){
        return employeeService.getAllEmployee();
    }
}
