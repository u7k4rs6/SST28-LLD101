import java.util.ArrayList;

public class Database {
    public ArrayList<Student> studentList = new ArrayList<Student>();

    public void addStudent(Student s) {
        studentList.add(s);
    }
}