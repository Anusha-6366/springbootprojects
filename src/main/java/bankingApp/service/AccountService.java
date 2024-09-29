package bankingApp.service;

import bankingApp.Dto.AccountDto;
import bankingApp.entity.Account;

public interface AccountService {

    AccountDto createAccount(AccountDto accountdto);
    AccountDto getAccountById(Long id);
    AccountDto deposit(Long id,double amount);
    String withdraw(Long id,double amount);
}
