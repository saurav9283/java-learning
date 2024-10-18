import java.util.*;

class Player3 {
    private int id;
    private String name;
    private String Country ;
    private  int matchesPlayed ;
    private int runsScored ;
    
    public Player3(int id, String name, String Country, int matchesPlayed, int runsScored)
    {
        this.id = id;
        this.name =  name;
        this.Country = Country;
        this.matchesPlayed= matchesPlayed;
        this.runsScored = runsScored;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getCountry()
    {
        return Country;
    }
    public int getmatchesPlayed()
    {
        return matchesPlayed;
    }
    public int getrunsScored()
    {
        return runsScored;
    }
}

public class IPA34Solution{
    public static List<Player3> findPlayerName(Player3[] players, String find, int findsearch)
    {
        List<Player3> list = new ArrayList<>();
        for(Player3 player: players){
            if(player.getCountry().equalsIgnoreCase(find) && player.getrunsScored() > findsearch)
            {
                list.add(player);
            }
        }
        if(list.isEmpty())
        {
            return null;
        }
        list.sort(Comparator.comparing(Player3::getName));
        return list;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();sc.nextLine();
        Player3[] player = new Player3[num1];
        for(int i = 0; i < num1; i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String name =  sc.nextLine();
            String Country = sc.nextLine();
            int matchesPlayed = sc.nextInt();sc.nextLine();
            int runsScored = sc.nextInt();sc.nextLine();

            player[i] = new Player3(id, name, Country, matchesPlayed, runsScored);
        }
        String find =  sc.nextLine();
        int findscore =  sc.nextInt();sc.nextLine();
        List<Player3> newlist = findPlayerName(player, find, findscore);
        if(newlist != null)
        {
            for(Player3 p:newlist)
            {
                System.out.println(p.getId()+":"+p.getName());
            }
        }
        else{
            System.out.println("No player found");
        }
    }
}