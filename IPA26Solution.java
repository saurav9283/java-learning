import java.util.*;

class Player2{
    private int id;
    private String name;
    private int iccRank;
    private int matchesPlayed;
    private int runsScored;

    public Player2(int id, String name, int iccRank,int matchesPlayed, int runsScored)
    {
        this.id = id;
        this.name = name;
        this.iccRank = iccRank;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }
    public int getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public int geticcRank()
    {
        return iccRank;
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

public class IPA26Solution{
    public static List<Player2> findAverageOfRuns(Player2[] players, int target)
    {
        List<Player2> list = new ArrayList<>();
        for(Player2 player:players)
        {
            if(player.getmatchesPlayed() >= target)
            {
                list.add(player);
            }
        }
        list.sort(Comparator.comparingInt(Player2::getrunsScored).reversed());
        if(list.isEmpty())
        {
            return null;
        }
        else{
            return list;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int num1= sc.nextInt();sc.nextLine();
        Player2[] player = new Player2[num1];
        for(int i =0; i < num1; i++ )
        {
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            int iccRank = sc.nextInt();sc.nextLine();
            int matchesPlayed = sc.nextInt();sc.nextLine();
            int runsScored = sc.nextInt();sc.nextLine();

            player[i] = new Player2(id, name, iccRank, matchesPlayed, runsScored);

        }

        int target = sc.nextInt();sc.nextLine();
        List<Player2> newList = findAverageOfRuns(player, target);
        if(!newList.isEmpty())
        {
            for(Player2 pl:newList)
            {
                double ans = pl.getrunsScored()/pl.getmatchesPlayed();
                if(ans >= 80 && ans <= 100)
                {
                    System.out.println("Grade A");
                }
                else if(ans >= 50 && ans <= 79)
                {
                    System.out.println("Grade B");
                }
                else{
                    System.out.println("Grade C");
                }
            }
        }
    }
}