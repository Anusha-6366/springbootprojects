package bankingApp.Mapper;

import bankingApp.Dto.AccountDto;
import bankingApp.entity.Account;
import bankingApp.repository.AccountRepository;

public class AccountMapper {


  public static  Account toBusiness(AccountDto accountDto){
       Account account=new Account(
               accountDto.getId(),
        accountDto.getAccountHolderName(),
        accountDto.getBalance()
       );
       return account;
    }
    public static AccountDto toDto(Account account){
      AccountDto accountDto = new AccountDto(
              account.getId(),
              account.getAccountHolderName(),
              account.getBalance()
      );
      return accountDto;
    }
}
