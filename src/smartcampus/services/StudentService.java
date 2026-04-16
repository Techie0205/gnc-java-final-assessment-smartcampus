package smartcampus.services;

import smartcampus.models.Student;
import smartcampus.exceptions.InvalidDataException;

import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(int id, String name, String email) throws InvalidDataException {

        if (name == null || name.trim().isEmpty()) {
            throw new InvalidDataException("Name cannot be empty");
        }

        if (!email.contains("@")) {
            throw new InvalidDataException("Invalid email format");
        }

        students.add(new Student(id, name, email));
        System.out.println("✔ Student added successfully!");
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Student findStudent(int id) {
        for (Student s : students) {
            if (s.getStudentId() == id) return s;
        }
        return null;
    }
}