package practiceproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import practiceproject.EmployeeDto;
import practiceproject.service.PpService;

@RestController
public class PpController {

    @Autowired
    PpService ppService;
    @PostMapping(path = "/save")
    public String saveEmplInf(@RequestBody EmployeeDto employeeDto) {

    String id = ppService.saveEmployee(employeeDto);
        return id;
    }






}
