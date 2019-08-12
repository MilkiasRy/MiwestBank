package edu.mum.cs.cs425.finalexam.midwestbank.Iservice;

import java.util.List;

import edu.mum.cs.cs425.finalexam.midwestbank.model.Account;

public interface IAccountService {
    public abstract List<Account> findAll();
    public abstract Account save(Account account);
    public String liquidity();
}
