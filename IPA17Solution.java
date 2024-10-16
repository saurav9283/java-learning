import java.util.*;

class Student {
    private int rollNo;
    private String name;
    private String subject;
    private char grade;
    private String date;
    public Student(int rollNo, String name, String subject, char grade, String date){
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.grade = grade;
        this.date = date;
       
    }
    public int getid()
    {
        return rollNo;
    }
    public String getname()
    {
        return name;
    }
    public String getSubject()
    {
        return subject;
    }
    public char getgrade()
    {
        return grade;
    }
    public String getDate()
    {
        return date;
    }
}

public class IPA17Solution{
    public static List<Student> findStudentByGradeAndMonth(Student[] students , char g, int findmonth)
    {
        List<Student> list = new ArrayList<>();
        for(Student student : students)
        {
            String[] data = student.getDate().split("/");
            int newdate = Integer.parseInt(data[1]);
            if(student.getgrade() == g && newdate == findmonth)
            {
                list.add(student);
            }
        }
        return list;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student[] student = new Student[4];
        for(int i = 0; i < 4;i++)
        {
            int rollNo = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            String subject = sc.nextLine();
            char grade = sc.nextLine().charAt(0);
            String date = sc.nextLine();
            
            student[i] = new Student(rollNo, name, subject, grade, date);
        }

        char g = sc.nextLine().charAt(0);
        int findmonth = sc.nextInt();sc.nextLine();

        List<Student> newstudent = findStudentByGradeAndMonth(student , g,findmonth);
        if(!newstudent.isEmpty())
        {
            for(Student sx:newstudent)
            {
                System.out.println(sx.getname());
                System.out.println(sx.getSubject());
            }
        }
        else
        {
            System.out.println("No student found");
        }
    }
}