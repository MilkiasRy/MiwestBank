package edu.mum.cs.cs425.finalexam.midwestbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.finalexam.midwestbank.model.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Long> {
}
