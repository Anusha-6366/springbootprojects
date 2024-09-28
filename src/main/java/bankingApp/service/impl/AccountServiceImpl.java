package bankingApp.service.impl;

import bankingApp.Dto.AccountDto;
import bankingApp.Mapper.AccountMapper;
import bankingApp.entity.Account;
import bankingApp.repository.AccountRepository;
import bankingApp.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {


    private AccountRepository accountRepository;
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountdto) {
        Account account = AccountMapper.toBusiness(accountdto);
        Account saved = accountRepository.save(account);
        return AccountMapper.toDto(saved);
    }
}
