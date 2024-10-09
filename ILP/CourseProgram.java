package ILP;
import java.util.*;


class Course {
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    public Course(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getcourseId() {
        return courseId;
    }

    public void setcourseId(int courseId) {
        this.courseId = courseId;
    }

    public String courseName() {
        return courseName;
    }

    public void setcourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getcourseAdmin() {
        return courseAdmin;
    }

    public void setcourseAdmin(String courseAdmin) {
        this.courseAdmin = courseAdmin;
    }

    public int getquiz() {
        return quiz;
    }

    public void setquiz(int quiz) {
        this.quiz = quiz;
    }

    public int gethandson() {
        return handson;
    }

    public void sethandson(int handson) {
        this.handson = handson;
    }

}

public class CourseProgram {
    public static int findAvgOfQuizByAdmin(Course[] courses,String adminname )
    {
        int sum = 0;
        int count=0;
        for(Course course:courses)
        {
            if(course.getcourseAdmin().equals(adminname))
            {
                sum += course.getquiz();
                count++;
            }
            if(count == 0)
            {
                return 0;
            }
        }
        return sum/2;
    }

    public static Course[] sortCourseByHandsOn(Course[] courses , int hand)
    {
        ArrayList<Course> matchingCourses = new ArrayList<>();
        for(int i = 0; i < courses.length; i++)
        {
            if(courses[i].gethandson() < hand)
            {
                matchingCourses.add(courses[i]);
            }
        }
        Course[] obj = new Course[matchingCourses.size()];
        matchingCourses.toArray(obj);
        return obj;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();sc.nextLine();
        Course[] course = new Course[num];
        for(int i = 0; i < num; i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            int e = sc.nextInt();sc.nextLine();

            course[i] = new Course(a,b,c,d,e);
        }

        String admin = sc.nextLine();
        
        int ans = findAvgOfQuizByAdmin(course , admin);
        if(ans != 0)
        {
            System.out.println(ans);
        }
        else{
            System.out.println("No course Found");
        }
        int hand = sc.nextInt();
        Course[] sortCourse = sortCourseByHandsOn(course , hand);
        for(Course x:sortCourse)
        {
            System.out.println(x.courseName());
        }
    }
}