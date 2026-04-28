import java.util.ArrayList;
import java.util.List;

class Student {
    private int student_id;
    private String student_name;
    private List<Integer> grades;

    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
    }

    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    public String getStudentName() {
        return student_name;
    }

    public void setStudentName(String student_name) {
        this.student_name = student_name;
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade " + grade + " added successfully.");
        } else {
            System.out.println("Invalid grade! Must be between 0 and 100.");
        }
    }

    public void showGrades() {
        System.out.println("Grades of " + student_name + ": " + grades);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rajnikant Tarun");

        // Update details
        s1.setStudentId(102);
        s1.setStudentName("Rajnikant Tarun");

        // Add grades
        s1.addGrade(85);
        s1.addGrade(92);
        s1.addGrade(110); // invalid

        // Display grades
        s1.showGrades();
    }
}
