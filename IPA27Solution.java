import java.util.*;

class Sim2{
    private int id;
    private String company;
    private int balance;
    private double ratePerSecond;
    private String circle;

    public Sim2(int id, String company, int balance, double ratePerSecond, String circle)
    {
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }
    public int getId()
    {
        return id;
    }
    public String getcompany()
    {
        return company;
    }
    public int getbalance()
    {
        return balance;
    }
    public double getratePerSecond()
    {
        return ratePerSecond;
    } 
    public String getcircle()
    {
        return circle;
    }
}

public class IPA27Solution{
    public static List<Sim2> matchAndSort(Sim2[] sims, String findstring, double finddouble)
    {
        List<Sim2> list = new ArrayList<>();
        for(Sim2 sim : sims)
        {
            if(sim.getcircle().equalsIgnoreCase(findstring) && sim.getratePerSecond() < finddouble)
            {
                list.add(sim);
            }
        }
        list.sort(Comparator.comparingInt(Sim2::getbalance).reversed());
        return list;

    }
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        sc.nextLine();
        Sim2[] sim2 = new Sim2[num1];
        for(int i = 0 ; i < num1; i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String company = sc.nextLine();
            int balance = sc.nextInt();sc.nextLine();
            double ratePerSecond = sc.nextDouble();sc.nextLine();
            String circle = sc.nextLine();

            sim2[i] = new Sim2(id,company,balance,ratePerSecond,circle);
        }
        String findstring = sc.nextLine();
        double finddouble = sc.nextDouble();
        sc.nextLine();

        List<Sim2> newlist = matchAndSort(sim2 , findstring,finddouble);
        if(!newlist.isEmpty())
        {
            for(Sim2 s:newlist)
            {
                System.out.println(s.getId());
            }
        }
    }
}