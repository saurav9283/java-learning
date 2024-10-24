import java.util.*;

class Course {
    private int CourseId;
    private String CourseName;
    private double CourseRating;
    private String Mode;
    private boolean HaveCertificate;

    public Course(int CourseId, String CourseName, double CourseRating, String Mode, boolean HaveCertificate) {
        this.CourseId = CourseId;
        this.CourseName = CourseName;
        this.CourseRating = CourseRating;
        this.Mode = Mode;
        this.HaveCertificate = HaveCertificate;
    }

    public int getCourseId() {
        return CourseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public double getCourseRating() {
        return CourseRating;
    }

    public String getMode() {
        return Mode;
    }

    public boolean getHaveCertificate() {
        return HaveCertificate;
    }
}

public class IPA54Solution {
    public static int CountCourse(Course[] courses, double find, String findmode)
    {
        int count = 0;
        for(Course course: courses)
        {
            if(course.getHaveCertificate() && course.getCourseRating() >= find && course.getMode().equalsIgnoreCase(findmode))
            {
                count++;
            }       
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] course = new Course[4];
        for (int i = 0; i < 4; i++) {
            int CourseId =  sc.nextInt();sc.nextLine();
            String CourseName =  sc.nextLine();
            double CourseRating = sc.nextDouble();sc.nextLine();
            String Mode =  sc.nextLine();
            boolean  HaveCertificate =  sc.nextBoolean();sc.nextLine();

            course[i] = new Course(CourseId, CourseName, CourseRating, Mode, HaveCertificate);
        }
        double find =  sc.nextInt();sc.nextLine();
        String findmode =  sc.nextLine();
        int ans =  CountCourse(course, find, findmode);
        if(ans != 0)
        {
            System.out.println(ans);
        }
        else{
            System.out.println("No course found");
        }

    }
}