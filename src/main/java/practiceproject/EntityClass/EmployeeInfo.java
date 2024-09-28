package practiceproject.EntityClass;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor

@Table(name="EmployeeInfo")
public class EmployeeInfo {

  @Id
  @Column(name="employee_id",length=45)
 // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeid;

  @Column(name="employee_name")
    private String employeename;

  @Column(name="city")
    private String city;

}
