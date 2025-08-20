package sanjit_project1;

// Base class
class User {
    String name;
    String email;

    // Constructor for User
    public User(String name, String email) {
        this.name = name;
        this.email = email;
        System.out.println("[User] Name: " + name + ", Email: " + email);
    }
}

// Subclass: Student
class Student extends User {
    String studentId;

    // Constructor for Student
    public Student(String name, String email, String studentId) {
        super(name, email); // Call User constructor
        this.studentId = studentId;
        System.out.println("[Student] ID: " + studentId);
    }
}

// Subclass: Instructor
class Instructor extends User {
    String employeeId;

    // Constructor for Instructor
    public Instructor(String name, String email, String employeeId) {
        super(name, email); // Call User constructor
        this.employeeId = employeeId;
        System.out.println("[Instructor] ID: " + employeeId);
    }
}

// Main class
public class javaassignment1 {
    public static void main(String[] args) {
        // Create a Student object
        Student s = new Student("Alice", "alice@example.com", "S123");

        System.out.println();

        // Create an Instructor object
        Instructor i = new Instructor("Dr. Bob", "bob@example.com", "E456");
    }
}
