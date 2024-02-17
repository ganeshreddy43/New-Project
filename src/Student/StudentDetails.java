package Student;

import java.security.PublicKey;

public class StudentDetails {
    public String name;
    public String fatherName;
    public String id;


    @Override
    public String toString() {
        return "StudentDetails{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
