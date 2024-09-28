package saveandupdate.service;

import org.springframework.stereotype.Service;
import saveandupdate.StudentEntity;
import saveandupdate.domain.StudentDomain;
import saveandupdate.repository.StudentRepo;

import java.util.Objects;

@Service
public class StudentService {
    StudentRepo studentRepo;
public StudentDomain fetch(int rollNumber)
{
//    StudentDomain student = studentRepo.findByRollNumber(id)
//            .orElseThrow(() -> new RuntimeException("Student not found with roll number: " + id));
    StudentDomain studentDomain = studentRepo.findByRollNumber(rollNumber).orElseThrow(() -> new RuntimeException("student id doesnot exists"));
    return new StudentDomain(studentDomain.getName(),studentDomain.getParentsName());
}
}
