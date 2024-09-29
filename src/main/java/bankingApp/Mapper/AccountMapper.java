package bankingApp.Mapper;

import bankingApp.Dto.AccountDto;
import bankingApp.entity.Account;
import bankingApp.repository.AccountRepository;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {


     Account toBusiness(AccountDto accountDto);


    AccountDto toDto(Account account);

//  public static  Account toBusiness(AccountDto accountDto){
//       Account account=new Account(
//               accountDto.getId(),
//        accountDto.getAccountHolderName(),
//        accountDto.getBalance()
//       );
//       return account;
//    }
//    public static AccountDto toDto(Account account){
//      AccountDto accountDto = new AccountDto(
//              account.getId(),
//              account.getAccountHolderName(),
//              account.getBalance()
//      );
//      return accountDto;
//    }

}
