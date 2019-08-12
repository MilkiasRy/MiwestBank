package edu.mum.cs.cs425.finalexam.midwestbank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.finalexam.midwestbank.Iservice.ICustomerService;
import edu.mum.cs.cs425.finalexam.midwestbank.model.Customer;
import edu.mum.cs.cs425.finalexam.midwestbank.repository.ICustomerRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    public ICustomerRepository customerRepository;
    @Override
    public List<Customer> findAll() {

        List<Customer> accounts = customerRepository.findAll();
        return accounts.stream().sorted(Comparator.comparing(Customer::getLastName)).collect(Collectors.toList());
       
    }

    public List<Customer> findAllSort() {

        List<Customer> accounts = customerRepository.findAll();
        return accounts.stream().sorted(Comparator.comparing(Customer::getLastName)).collect(Collectors.toList());

    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}
