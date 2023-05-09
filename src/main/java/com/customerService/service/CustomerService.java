package com.customerService.service;

import com.customerService.model.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface CustomerService {
    Long createCustomer(Customer customer);
    void updateCustomerById(Long customerId, Customer customer) throws Exception;
    void deleteCustomerById(Long id) throws Exception;
    Customer getCustomerById(Long id) throws JsonProcessingException;
    List<Customer> getCustomersByFirstName(String firstName);
    List<Customer> getAllCustomers();
    List<Long> getCustomerIdsByFirstName(String firstName);

}
