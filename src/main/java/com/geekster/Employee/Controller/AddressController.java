package com.geekster.Employee.Controller;

import com.geekster.Employee.Method.Address;
import com.geekster.Employee.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping()
    public void addAddress(@RequestBody Address address){
        addressService.addAddress(address);
    }
    @GetMapping()
    public Iterable<Address> getAddress(){
        return addressService.getAllChef();
    }
    @DeleteMapping (value = "/deleteAddress/{id}")
    public void deleteAddressById(@PathVariable Integer id){
        addressService.removeAddressById(id);
    }

}
