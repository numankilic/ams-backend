package org.airms.airlinemanagementsystem.api.controller;

import org.airms.airlinemanagementsystem.business.abstracts.CustomerService;
import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.core.utilities.results.Result;
import org.airms.airlinemanagementsystem.entities.concretes.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/getall")
    public DataResult<List<Customer>> getAll(){
        return this.customerService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Customer customer){
        return this.customerService.add(customer);
    }

    @GetMapping("/getByCustomerName")
    public DataResult<List<Customer>> getByCustomerName(@RequestParam String customerName){
        return this.customerService.getByCustomerName(customerName);
    }
    @GetMapping("/getById")
    public DataResult<Customer> getById(@RequestParam String passportNumber){
        return this.customerService.getById(passportNumber);
    }
}
