import java.util.*;

class Course {
    private String CourseName;
    private int CourseNumber;
    private String Mode;
    private boolean Sharedata;

    public Course(String CourseName, int CourseNumber, String Mode, boolean Sharedata)
    {
        this.CourseName =  CourseName;
        this.CourseNumber =  CourseNumber;
        this.Mode = Mode;
        this.Sharedata = Sharedata;
    }
    public String getCourseName()
    {
        return CourseName;
    }
    public int getCourseNumber()
    {
        return CourseNumber;
    }
    public String getmode()
    {
        return Mode;
    }
    public boolean getSharedata()
    {
        return Sharedata;
    }
}

public class IPA53Solution{
    public static String findCourseStatus(Course[] courses, String find)
    {
        for(Course course: courses)
        {
            if(course.getCourseName().equalsIgnoreCase(find))
            {
                if(course.getCourseNumber() == 1000)
                {
                    return "High";
                }
                else if(course.getCourseNumber() >= 500 && course.getCourseNumber() < 1000)
                {
                    return "Medium";
                }
                else if(course.getCourseNumber() < 500)
                {
                    return "Low";
                }
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Course[] course = new Course[4];
        for(int i = 0;i < 4;i++)
        {
            String CourseName = sc.nextLine();
            int CourseNumber = sc.nextInt();sc.nextLine();
            String Mode = sc.nextLine();
            boolean Sharedata = sc.nextBoolean();sc.nextLine();

            course[i] = new Course(CourseName, CourseNumber, Mode, Sharedata);
        }

        String find =  sc.nextLine();
        String newlist = findCourseStatus(course, find);
        if(newlist != null)
        {
            System.out.println(newlist);
        }
        else{
            System.out.println("No course found");
        }

    }
}