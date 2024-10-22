import java.util.Scanner;
import java.util.*;


class Person {
    // Attributes
    private String firstName;
    private String lastName;
    private int age;
    private char gender;

    // Parameterized Constructor
    public Person(String firstName, String lastName, int age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

   

    public String getLastName() {
        return lastName;
    }

   

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

}

class Student extends Person {
    private String rollNo;
    private String course;
    private int semester;
    private double GPA;

    public Student(String firstName, String lastName, int age, char gender, 
                   String rollNo, String course, int semester, double GPA) {
        super(firstName, lastName, age, gender);
        this.rollNo = rollNo;
        this.course = course;
        this.semester = semester;
        this.GPA = GPA;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
public class IPA46Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}