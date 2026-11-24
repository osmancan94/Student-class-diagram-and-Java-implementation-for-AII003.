import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentId;
    private String name;
    private String department;
    private List<String> courses;

    // This constructor creates a new student.
    public Student(int studentId, String name, String department) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        courses = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // Check if the course is already registered before adding it.
    public boolean registerCourse(String course) {
        if (courses.contains(course)) {
            return false;
        }
        courses.add(course);
        return true;
    }

    // Remove a course from the student's course list.
    public boolean dropCourse(String course) {
        return courses.remove(course);
    }

    // Display the student information.
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Courses: " + courses);
    }
}
