import java.util.*;

class NavalVessel{
    private int vesselld;
    private String vesselName;
    private int noOfVoyagesPlanned;
    private int noOfVoyagesCompleted;
    private String purpose;

    public NavalVessel(int vesselld, String vesselName, int noOfVoyagesPlanned,int noOfVoyagesCompleted, String purpose)
    {
        this.vesselld = vesselld;
        this.vesselName = vesselName;
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
        this.purpose = purpose;
    }
    public int getid()
    {
        return vesselld;
    }
    public String getvesselName()
    {
        return vesselName;
    }
    public int getnoOfVoyagesPlanned()
    {
        return noOfVoyagesPlanned;
    }
    public int getnoOfVoyagesCompleted()
    {
        return noOfVoyagesCompleted;
    }
    public String getpurpose()
    {
        return purpose;
    }
}

public class IPA16Solution{

    public static int findAvgVoyagesByPct(NavalVessel[] navels,int find)
    {
        int count = 0;
        int sum = 0;
        for(NavalVessel navel : navels)
        {
            if(navel.getnoOfVoyagesCompleted()*100/navel.getnoOfVoyagesPlanned() >= find)
            {
                sum += navel.getnoOfVoyagesCompleted();
                count++;
            }
        }
        if(count > 0)
        {
            int avg = sum/count;
            return avg;
        }
        else{
            return 0;
        }
    } 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        NavalVessel[] navel = new NavalVessel[4];
        for(int i = 0 ; i < 4;i++)
        {
            int vesselld = sc.nextInt();sc.nextLine();
            String vesselName  =sc.nextLine();
            int noOfVoyagesPlanned = sc.nextInt();sc.nextLine();
            int noOfVoyagesCompleted = sc.nextInt();sc.nextLine();
            String purpose = sc.nextLine();
            navel[i] = new NavalVessel(vesselld, vesselName, noOfVoyagesPlanned, noOfVoyagesCompleted, purpose);
        }
        int find = sc.nextInt();
        sc.nextLine();
        int ans = findAvgVoyagesByPct(navel,find);
        if(ans != 0)
        {
            System.out.println(ans);
        }

        else{
            
        }
    }
}