import java.util.*;

class Beach{
    private int beachId;
    private String beachName;
    private int beachRating;
    private int beachCost;

    public Beach(int beachId, String beachName, int beachRating, int beachCost)
    {
        this.beachId = beachId;
        this.beachName = beachName;
        this.beachRating = beachRating;
        this.beachCost = beachCost;
    }
    public int getid()
    {
        return beachId;
    }
    public String getbeachName()
    {
        return beachName;
    }
    public int getbeachRating()
    {
        return beachRating;
    }
    public int getbeachCost()
    {
        return beachCost;
    }
}

public class IPA51Solution{
    public static Beach findLeastRatingWithName(Beach[] beaches, String find, int findcost)
    {
        List<Beach> list = new ArrayList<>();
        for(Beach beach : beaches)
        {
            if(beach.getbeachName().equalsIgnoreCase(find) && beach.getbeachCost() > findcost)
            {
                list.add(beach);
            }
        }
        if(list.isEmpty())
        {
            return null;
        }
        list.sort(Comparator.comparingInt(Beach::getbeachRating));
        return list.get(1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Beach[] beach =  new Beach[4];
        for(int i = 0; i < 4; i++)
        {
            int beachId =  sc.nextInt();sc.nextLine();
            String beachName = sc.nextLine();
            int beachRating = sc.nextInt();sc.nextLine();
            int beachCost = sc.nextInt();sc.nextLine();

            beach[i] = new Beach(beachId, beachName, beachRating, beachCost);
        }

        String find = sc.nextLine();
        int findcost = sc.nextInt();

        Beach ans = findLeastRatingWithName(beach , find, findcost);
        if(ans != null)
        {
            System.out.println(ans.getbeachRating());
        }
        else{
            System.out.println("No beach found");
        }
        
    }
}