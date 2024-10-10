package ILP;

import java.util.*;

class Student {
    private int rollNo;
    private String name;
    private String branch;
    private double score;
    private boolean dayScholar;

    public Student(int rollNo, String name, String branch, double score, boolean dayScholar) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholar = dayScholar;
    }

    public int getrollNo() {
        return rollNo;
    }

    public void setrollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getbranch() {
        return branch;
    }

    public void setbranch(String branch) {
        this.branch = branch;
    }

    public double getscore() {
        return score;
    }

    public void setscore(double score) {
        this.score = score;
    }

    public boolean getdayScholar() {
        return dayScholar;
    }

    public void setdayScholar(boolean dayScholar) {
        this.dayScholar = dayScholar;
    }
}

public class Solution {
    public static int findCountOfDayscholarStudents(Student[] students) {
        int count = 0;
        for (Student student : students) {
            if (student.getdayScholar() == true) {
                if (student.getscore() > 80) {
                    count++;
                }
            }
        }
        return count;
    }

    public static Student findStudentwithSecondHighestScore(Student[] students) {
        Student first = null;
        Student second = null;
        for (Student student : students) {
            if (!student.getdayScholar()) {

                if (first == null || student.getscore() > first.getscore()) {
                    second = first;
                    first = student;
                } else if (second == null || student.getscore() > second.getscore()) {
                    second = student;
                }
            }
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        Student[] student = new Student[num];
        for (int i = 0; i < num; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            boolean e = sc.nextBoolean();
            student[i] = new Student(a, b, c, d, e);
        }

        int dayScallerCount = findCountOfDayscholarStudents(student);
        if (dayScallerCount != 0) {
            System.out.println("total " + dayScallerCount);
        } else {
            System.out.println("No any student whose 80+ score");
        }

        Student secondhigh = findStudentwithSecondHighestScore(student);
        System.out.println(secondhigh.getrollNo() + "#" + secondhigh.getname() + "#" + secondhigh.getscore());


    }
}