import java.util.*;

class Associate{
    private int id;
    private String name;
    private String technology;
    private int experienceInYears;
    
    public Associate(int id, String name, String technology, int experienceInYears)
    {
        this.id = id;
        this.name = name;
        this.technology= technology;
        this.experienceInYears = experienceInYears;
    }
    public int getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public String gettechnology()
    {
        return technology;
    }
    public int getexperienceInYears()
    {
        return experienceInYears;
    }
}

public class IPA22Solution{
    public static List<Associate> associatesForGivenTechnology(Associate[] associates, String find)
    {
        List<Associate> list = new ArrayList<>();
        for(Associate associate:associates){
            if(associate.gettechnology().equalsIgnoreCase(find) && associate.getexperienceInYears() %5 ==0)
            {
                list.add(associate);
            }
        }
        list.sort(Comparator.comparingInt(Associate::getid));
        return list;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Associate[] associate = new Associate[5];
        for(int i = 0;i < 5; i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            String technology = sc.nextLine();
            int experienceInYears = sc.nextInt();sc.nextLine();
            associate[i] = new Associate(id,name,technology,experienceInYears);
        }
        String find = sc.nextLine();
        List<Associate> newlist = associatesForGivenTechnology(associate , find);
        
        if(!newlist.isEmpty())
        {
            for(Associate a:newlist)
            {
                System.out.println(a.getid());
            }
        }

        
    
    }
}