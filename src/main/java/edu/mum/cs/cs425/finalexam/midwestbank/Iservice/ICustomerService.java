package edu.mum.cs.cs425.finalexam.midwestbank.Iservice;

import java.util.List;

import edu.mum.cs.cs425.finalexam.midwestbank.model.Customer;

public interface ICustomerService {
    public abstract List<Customer> findAll();
    public abstract Customer save(Customer customer);
    public List<Customer> findAllSort();
}
