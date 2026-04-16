package smartcampus.services;

import smartcampus.models.Course;
import smartcampus.exceptions.InvalidDataException;

import java.util.ArrayList;

public class CourseService {

    private ArrayList<Course> courses = new ArrayList<>();

    public void addCourse(int id, String name, double fee) throws InvalidDataException {

        if (name == null || name.trim().isEmpty()) {
            throw new InvalidDataException("Course name cannot be empty");
        }

        if (fee <= 0) {
            throw new InvalidDataException("Fee must be greater than 0");
        }

        courses.add(new Course(id, name, fee));
        System.out.println("✔ Course added successfully!");
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public Course findCourse(int id) {
        for (Course c : courses) {
            if (c.getCourseId() == id) return c;
        }
        return null;
    }
}