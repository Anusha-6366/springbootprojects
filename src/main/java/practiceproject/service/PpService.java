package practiceproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practiceproject.EmployeeDto;
import practiceproject.EntityClass.EmployeeInfo;
import practiceproject.repository.EmployeeRepo;
@Service
public class PpService {

    @Autowired
    EmployeeRepo employeeRepo;

    public String saveEmployee(EmployeeDto employeeDto) {
        EmployeeInfo employeeInfo = new EmployeeInfo(
                employeeDto.getEmployeeid(),
                employeeDto.getEmployeename(),
                employeeDto.getCity()
        );
        employeeRepo.save(employeeInfo);
        return "Employee info is saved";
    }
}
