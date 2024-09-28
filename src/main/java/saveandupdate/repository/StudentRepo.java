package saveandupdate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import saveandupdate.StudentEntity;
import saveandupdate.domain.StudentDomain;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Integer> {
    Optional<StudentDomain> findByRollNumber(int rollNum);
}
