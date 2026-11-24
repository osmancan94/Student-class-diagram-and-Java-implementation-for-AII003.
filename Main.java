public class Main {
    public static void main(String[] args) {
        // Create a student object with my information.
        Student student = new Student(20221546, "Osman Can Altan", "Computer Engineering");

        // Register two courses to test the program.
        student.registerCourse("AII003");
        student.registerCourse("Database Systems");

        student.displayInfo();

        // Remove a course and display the information again.
        student.dropCourse("Database Systems");

        System.out.println("\nAfter dropping a course:");
        student.displayInfo();
    }
}
