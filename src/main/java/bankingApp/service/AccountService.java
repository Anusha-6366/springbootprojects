package bankingApp.service;

import bankingApp.Dto.AccountDto;
import bankingApp.entity.Account;

public interface AccountService {

    AccountDto createAccount(AccountDto accountdto);

}
