package com.customerService.controller;


import com.customerService.model.Customer;
import com.customerService.service.CustomerService;
import com.customerService.service.InternalPollService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequestMapping("/customer")

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private InternalPollService internalPollService;

    @PostMapping(value = "/customer/create")
    public String createCustomer(@RequestBody Customer customer)  {
        customerService.createCustomer(customer);
        return "Create new customer";
    }

    @PutMapping(value = "/customer/{customerId}/update")
    public void updateCustomerById(@PathVariable Long customerId,
                                   @RequestBody Customer customer) throws Exception {
        customerService.updateCustomerById(customerId, customer);
    }

    @DeleteMapping(value = "/customer/{customerId}/delete")
    public void deleteCustomerById(@PathVariable Long customerId) throws Exception {
        customerService.deleteCustomerById(customerId);
    }

    @GetMapping(value = "/customer/{customerId}")
    public Customer getCustomerById(@PathVariable Long customerId) throws JsonProcessingException {
        return customerService.getCustomerById(customerId);
    }

    @GetMapping(value = "/customer/{firstName}/all")
    public List<Customer> getCustomersByFirstName(@PathVariable String firstName) {
        return customerService.getCustomersByFirstName(firstName);
    }

    @GetMapping(value = "/customer/all")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping(value = "/id/{firstName}/all")
    public List<Long> getCustomerIdsByFirstName(@PathVariable String firstName) {
        return customerService.getCustomerIdsByFirstName(firstName);
    }

}
