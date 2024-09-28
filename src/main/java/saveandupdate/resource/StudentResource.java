package saveandupdate.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import saveandupdate.domain.StudentDomain;
import saveandupdate.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentResource {

   public StudentService studentService;

    @GetMapping("/id")
    public StudentDomain FetcI(@PathVariable int id){
      return studentService.fetch(id);

    }

}
