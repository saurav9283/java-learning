import java.util.*;

class TravelAgencies{
    private int regNo;
    private String agencyName;
    private String pakageType;
    private int price;
    private  boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName,String pakageType,int price, boolean
    flightFacility)
    {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.pakageType = pakageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }
    public int getiD()
    {
        return regNo;
    }
    public String getname()
    {
        return agencyName;
    }
    public String getpakageType()
    {
        return pakageType;
    }
    public int getprice()
    {
        return price;
    }
    public boolean getflightFacility()
    {
        return flightFacility;
    }
}

public class IPA32Solution{
    public static TravelAgencies findAgencyWithHighestPackagePrice(TravelAgencies[] travels)
    {
        TravelAgencies maxi = null;
        for(TravelAgencies travel: travels)
        {
            if(maxi == null || travel.getprice() > maxi.getprice())
            {
                maxi = travel;
            }
        }
        return maxi;
    }

    public static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies[] travels, int find, String findString)
    {
        for(TravelAgencies travel: travels)
        {
            if(travel.getflightFacility() == true && travel.getiD() == find && travel.getpakageType().equalsIgnoreCase(findString))
            {
                return travel;
            }
        }
        return null;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();sc.nextLine();
        TravelAgencies[] travel = new TravelAgencies[num1];
        for(int i =0; i < num1; i++)
        {
            int regNo = sc.nextInt();sc.nextLine();
            String agencyName = sc.nextLine();
            String pakageType = sc.nextLine();
            int price = sc.nextInt();sc.nextLine();
            boolean flightFacility =  sc.nextBoolean();
            sc.nextLine();
            travel[i] =  new TravelAgencies(regNo,agencyName,pakageType,price,flightFacility);
        }
        int find =  sc.nextInt();sc.nextLine();
        String findstring = sc.nextLine();
        TravelAgencies ans = findAgencyWithHighestPackagePrice(travel);
        if(ans != null)
        {
            System.out.println(ans.getprice());
        }

        TravelAgencies resullt = agencyDetailsForGivenldAndType(travel, find, findstring);
        if(resullt != null)
        {
            System.out.println(resullt.getname()+":"+resullt.getprice());
        }
        

    }
}