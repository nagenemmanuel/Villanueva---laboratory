//start 
import java.util.Scanner;
class person {
    String name;
    int age;
    int ID;

    public person(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
    }
}
//student class
class Student extends person {
    String Level;

    public Student(String name, int ID, String gradeLevel) {
        super(name, ID);
        this.Level = gradeLevel;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade Level: " + Level);

    }
}
// teacher class
class Teacher extends person {
    String subject;

    public Teacher(String name, int ID, String subject) {
        super(name, ID);
        this.subject = subject;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    
        }
    }

    //Staff class
    class Staff extends person {
        String position;

        public Staff(String name, int ID, String position) {
            super(name, ID);
            this.position = position;
        }

        public void displayInfo() {
            super.displayInfo();
            System.out.println("Position: " + position);
        }
    }
    //class school
    public class SchoolTest {
        public static void main(String[] args) {
            Student student = new Student("Robert", 423, "Grade 12");
            Teacher teacher = new Teacher("Mr. Welson", 202, "Computer");
            Staff staff = new Staff("Mr. Jones", 803, "Administration");
    
            System.out.println("Student Information:");
            student.displayInfo();
            System.out.println();
    
            System.out.println("Teacher Information:");
            teacher.displayInfo();
            System.out.println();
    
            System.out.println("Staff Information:");
            staff.displayInfo();
        }
    }
//end
    