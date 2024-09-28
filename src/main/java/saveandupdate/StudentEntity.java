package saveandupdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "Student")

public class StudentEntity {

    @Column(name = "rollNumber")
    private int rollNumber;
    @Column(name = "name")
    private String name;
    @Column(name = "parentsName")
    private String parentsName;


}
