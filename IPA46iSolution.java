import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Player {
    private int id;
    private String country;
    private String side;
    private double price;

    public Player(int id, String country,String side, double price)
    {
        this.id = id;
        this.country = country;
        this.side =  side;
        this.price = price;
    }
    public int getid()
    {
        return id;
    }
    public String getcountry()
    {
        return country;
    }
    public String getsidde()
    {
        return side;
    }
    public double getprice()
    {
        return price;
    }
}

public class IPA46iSolution{
    public static List<Player> searchPlayerForMatch(Player[] players, String find){
        List<Player> list =  new ArrayList<>();
        for(Player player: players)
        {
            if(player.getsidde().equalsIgnoreCase(find))
            {
                list.add(player);
            }
        }
        if(list.isEmpty())
        {
            return null;
        }
        list.sort(Comparator.comparingInt(Player::getid));
        return list;

    }
    public static void main(String[]  args)
    {
        Scanner sc = new Scanner(System.in);
        Player[] player = new Player[4];
        for(int i = 0; i < 4; i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String country = sc.nextLine();
            String side = sc.nextLine();
            double price = sc.nextDouble();sc.nextLine();

            player[i] = new Player(id, country, side, price);
        }

        String find = sc.nextLine();
        List<Player> newlist = searchPlayerForMatch(player, find);
        if(newlist != null)
        {
            for(Player n:newlist)
            {
                System.out.println(n.getid());
            }
        }
        else{
            System.out.println("no any player exist");
        }
    }

}