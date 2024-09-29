package bankingApp.service.impl;

import bankingApp.Dto.AccountDto;
import bankingApp.Mapper.AccountMapper;
import bankingApp.entity.Account;
import bankingApp.repository.AccountRepository;
import bankingApp.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
AccountServiceImpl accountService;
private final AccountMapper accountMapper;

    private AccountRepository accountRepository;
    public AccountServiceImpl(AccountMapper accountMapper, AccountRepository accountRepository) {
        this.accountMapper = accountMapper;
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountdto) {
        Account account = accountMapper.toBusiness(accountdto);
        Account saved = accountRepository.save(account);
        return accountMapper.toDto(saved);
    }

    @Override
    public AccountDto getAccountById(Long id) {
        Account account =accountRepository.findById(id).orElseThrow(()->new RuntimeException("Account Does Not Exists"));
        return accountMapper.toDto(account);
    }

    @Override
    public AccountDto deposit(Long id, double amount) {
        Account account =accountRepository.findById(id).orElseThrow(()->new RuntimeException("Account Does Not Exists"));
       double total = account.getBalance() + amount;
       account.setBalance(total);
      Account account1= accountRepository.save(account);
        return accountMapper.toDto(account1);
    }

    @Override
    public String withdraw(Long id, double amount) {
        Account account = accountRepository.findById(id).orElseThrow(()-> new RuntimeException("Invalid id"));
        double debited = account.getBalance()-amount;
        account.setBalance(debited);
        Account account1 =accountRepository.save(account);
        return "The amount"+" "+amount+ "  "+ "is withdrawn from you account";

    }
}
