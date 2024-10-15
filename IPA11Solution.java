import java.util.*;

class Player {
    private int playerId;
    private String skill;
    private String level;
    private int points;

    public Player(int playerId, String skill, String level, int points) {
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }
    public int getid()
    {
        return playerId;
    }
    public String getskill()
    {
        return skill;
    }
    public String getlevel()
    {
        return level;
    }
    public int getpoints()
    {
        return points;
    }

}

public class IPA11Solution {
    public static int findPointsForGivenSkill(Player[] players, String search)
    {
        int sum = 0;
        for(Player player:players)
        {
            if(player.getskill().equalsIgnoreCase(search))
            {
                sum += player.getpoints();
            }
        }
        return sum;
    }

    public static Player getPlayerBasedOnLevel(Player[] players , String find,String search)
    {
        // List<Player> list = new ArrayList<>();
        for(Player player: players)
        {
            if(player.getlevel().equalsIgnoreCase(find) && player.getskill().equalsIgnoreCase(search) && player.getpoints() >= 20)
            {
                // list.add(player);
                return player;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] player = new Player[4];
        for(int i = 0 ; i < 4; i++)
        {
            int playerId = sc.nextInt();sc.nextLine();
            String skill = sc.nextLine();
            String level = sc.nextLine();
            int points = sc.nextInt();
            sc.nextLine();

            player[i] = new Player(playerId, skill, level, points);
        }
        String search = sc.nextLine();
        String find = sc.nextLine();

        int ans = findPointsForGivenSkill(player,search);
        if(ans > 0)
        {
            System.out.println(ans);
        }
        else{
            System.out.println(ans + " NO");
        }

        Player newplayer = getPlayerBasedOnLevel(player,find,search);
        if(newplayer != null)
        {
            System.out.println(newplayer.getid());
        }
        else{
            System.out.println("No player is available with specified level, skill and eligibility points");
        }

    }
}
