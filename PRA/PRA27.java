package PRA;
import java.util.*;

class SalesMan{
    private int SalesManID;
    private String SalesManName;
    private int salary;
    private int bonus;
    private int salesDone;
    public SalesMan(int SalesManID,String SalesManName,int salary,int bonus,int salesDone)
    {
        this.SalesManID = SalesManID;
        this.SalesManName = SalesManName;
        this.salary = salary;
        this.bonus = bonus;
        this.salesDone = salesDone;
    }
    public int getSalesManID()
    {
        return SalesManID;
    }
    public String getSalesManName()
    {
        return SalesManName;
    }
    public int getSalary()
    {
        return salary;
    }
    public int getbonus()
    {
        return bonus;
    }
    public int getsalesDone()
    {
        return salesDone;
    }
    public void setBonus(int bonus)
    {
        this.bonus = bonus;
    }
    public void setSakesDone(int salesDone)
    {
        this.salesDone = salesDone;
    }
}

class BonusTracker{
    public void addBonus(SalesMan s,int salesDone)
    {
        // int total = salesDone/8000;
        int totalBonus = ((salesDone / 8000) * 2000);
        s.setBonus(s.getbonus()+totalBonus);
        s.setSakesDone(s.getsalesDone()+salesDone);
    }
    public void simulateBonus(ArrayList<SalesMan> salesList,int SalesManID, int salesDone)
    {
        for(SalesMan s:salesList)
        {
            if(s.getSalesManID() == SalesManID)
            {
                addBonus(s,salesDone);
                break;
            }
        }
    }

    public void displaySalesmanStats(SalesMan salesMan)
    {
        System.out.println(salesMan.getSalesManID());
        System.out.println(salesMan.getSalesManName());
        System.out.println(salesMan.getSalary());
        System.out.println(salesMan.getbonus());
        System.out.println(salesMan.getsalesDone());
    }
}

public class PRA27{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<SalesMan> trackerList = new ArrayList<>();
        while(true)
        {
            int SalesManID = sc.nextInt();sc.nextLine();
            String SalesManName = sc.nextLine();
            int salary = sc.nextInt();sc.nextLine();
            int bonus = sc.nextInt();sc.nextLine();
            int salesDone = sc.nextInt();sc.nextLine();
            trackerList.add(new SalesMan(SalesManID,SalesManName,salary,bonus,salesDone));

            String toContinue = sc.nextLine();
            if(toContinue.equalsIgnoreCase("n"))
            {
                break;
            }
        }
        System.out.println("out from break");
        int numberofTime = sc.nextInt();sc.nextLine();
        BonusTracker b =  new BonusTracker();
        for(int i = 0; i < numberofTime; i++)
        {
            int SalesManID =sc.nextInt();sc.nextLine();
            int SalesDone = sc.nextInt();sc.nextLine();
            b.simulateBonus(trackerList,SalesManID,SalesDone);
        }
        System.out.println(trackerList+" =-=-=-");

        for(SalesMan s: trackerList)
        {
            b.displaySalesmanStats(s);
        }
    }
}