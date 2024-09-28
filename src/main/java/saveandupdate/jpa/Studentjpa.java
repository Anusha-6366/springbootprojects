package saveandupdate.jpa;

import saveandupdate.domain.StudentDomain;

public interface Studentjpa {
    public StudentDomain FetchStudentInfo(int id);
}
