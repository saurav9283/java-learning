import java.util.*;

class Team{
    private int tId;
    private String tName;
    private String tCountry;
    private int tRun;

    public Team(int tId, String tName, String tCountry, int tRun)
    {
        this.tId = tId;
        this.tName = tName;
        this.tCountry = tCountry;
        this.tRun = tRun;
    }
    public int gettId()
    {
        return tId;
    }
    public String gettName()
    {
        return tName;
    }
    public String gettCountry()
    {
        return tCountry;
    }
    public int gettRun()
    {
        return tRun;
    }
}

public class IPA28Solution{
    public static Team findPlayer(Team[] teams, int find, String findstring)
    {
        for(Team team: teams)
        {
            if(team.gettCountry().equalsIgnoreCase(findstring)  && team.gettRun() > find)
            {
                return team;
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        sc.nextLine();
        Team[] team = new Team[num1];
        for(int i = 0; i < num1; i++)
        {
            int tId = sc.nextInt();sc.nextLine();
            String tName = sc.nextLine();
            String tCountry = sc.nextLine();
            int tRun = sc.nextInt();sc.nextLine();

            team[i] = new Team(tId,tName,tCountry,tRun);
        }
        int find = sc.nextInt(); sc.nextLine();
        String findstring = sc.nextLine();
        Team newtem = findPlayer(team, find, findstring);
        if(newtem != null)
        {
            System.out.println(newtem.gettId());
            System.out.println(newtem.gettName());
            System.out.println(newtem.gettCountry());
            System.out.println(newtem.gettRun());
        }
        else{
            System.out.println("No team is found from the given country and run");
        }
    }
}