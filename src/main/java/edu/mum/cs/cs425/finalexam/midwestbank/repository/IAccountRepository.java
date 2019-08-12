package edu.mum.cs.cs425.finalexam.midwestbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.finalexam.midwestbank.model.Account;

import java.util.List;

@Repository
public interface IAccountRepository extends JpaRepository<Account,Long> {
    List<Account> findAllByOrderByAccountNumber();


}
