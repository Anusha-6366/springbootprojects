package bankingApp.controller;

import bankingApp.Dto.AccountDto;
import bankingApp.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private AccountService accountService;
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }
    //Add Account RestApi
    @PostMapping
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }
    //GET AccountById
    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id){
      return ResponseEntity.ok(accountService.getAccountById(id));

    }
    //Deposit Rest Api
@PutMapping("/{id}/deposit")
    public ResponseEntity<AccountDto> depositAmount(@PathVariable Long id, @RequestBody Map<String, Double> request){
 return new ResponseEntity<>(accountService.deposit(id,request.get("amount")),HttpStatus.CREATED);
}
@PutMapping("/{id}/withdraw")
public ResponseEntity<String> withdraw(@PathVariable Long id, @RequestBody Map<String, Double> request){
return new ResponseEntity<>(accountService.withdraw(id,request.get("amount")),HttpStatus.CREATED);
}


}
