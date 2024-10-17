import java.util.*;

class Institution {
    private int institutionId;
    private String institutionName;
    private int noOfStudentsPlaced;
    private int noOfStudentsCleared;
    private String location;
    private String grade;

    public Institution(int institutionId, String institutionName, int noOfStudentsPlaced, int noOfStudentsCleared,
            String location) {
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;
    }

    public int getinstitutionId() {
        return institutionId;
    }

    public String getinstitutionName() {
        return institutionName;
    }

    public int getnoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }

    public int getnoOfStudentsCleared() {
        return noOfStudentsCleared;
    }

    public String getlocation() {
        return location;
    }

    public String getgrade() {
        return grade;
    }
    public void setgrade(String grade)
    {
        this.grade = grade;
    }
}

public class IPA23Solution {
    public static int FindNumClearancedByLoc(Institution[] instutes,String find)
    {
        int sum = 0;
        for(Institution instution: instutes)
        {
            if(instution.getlocation().equalsIgnoreCase(find))
            {
                sum += instution.getnoOfStudentsCleared();
            }
        }
        return sum;
    }
    public static List<Institution> UpdateInstitutionGrade(Institution[] instutions, String search)
    {
        List<Institution> list = new ArrayList<>();
        String newMarks = "";
        for(Institution instute: instutions)
        {
            if(instute.getinstitutionName().equalsIgnoreCase(search))
            {
                int marks = instute.getnoOfStudentsPlaced()*100/instute.getnoOfStudentsCleared();
                if(marks >= 80)
                {
                    newMarks = "A";
                    instute.setgrade(newMarks);
                    list.add(instute);
                }
                else{
                    newMarks = "B";
                    instute.setgrade(newMarks);
                    list.add(instute);
                }
            }
        }
        if(list.isEmpty())
        {
            return null;
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Institution[] institute = new Institution[4];
        for (int i = 0; i < 4; i++) {
            int institutionId = sc.nextInt();
            sc.nextLine();
            String institutionName = sc.nextLine();
            int noOfStudentsPlaced = sc.nextInt();
            sc.nextLine();
            int noOfStudentsCleared = sc.nextInt();
            sc.nextLine();
            String location = sc.nextLine();

            institute[i] = new Institution(institutionId, institutionName, noOfStudentsPlaced, noOfStudentsCleared, location);
        }

        String find = sc.nextLine();
        String update = sc.nextLine();

        int ans = FindNumClearancedByLoc(institute,find);
        if(ans != 0)
        {
            System.out.println(ans);
        }

        List<Institution> newlist = UpdateInstitutionGrade(institute, update);
        if(newlist != null)
        {
            for(Institution i: newlist)
            {
                System.out.println(update+"::"+i.getgrade());
            }
        }


    }
}