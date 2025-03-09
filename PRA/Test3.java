import java.util.*;

class votesisNegativeException extends Exception{
    public votesisNegativeException(String message)
    {
        super(message);
    }
}


class Politics{
    private String politicianName;
    private String partyName;
    private int votes;
    public Politics(String politicianName,String partyName,int votes) throws votesisNegativeException
    {
        if(votes < 0)
        {
            throw new votesisNegativeException("Alert: Votes of a certain politician is negative.");
        }
        this.politicianName = politicianName;
        this.partyName = partyName;
        this.votes = votes;
    }
    public String getPoliticianName() {
        return politicianName;
    }
    public String getPartyName() {
        return partyName;
    }
    public int getVotes() {
        return votes;
    }
}

class Region{
    private int regionId;
    private String regionName;
    private int noOfPolitics;
    private List<Politics> listPolitics;
    int totalVotes;
    public Region(int regionId , String regionName, int noOfPolitics,List<Politics> listPolitics)
    {
        this.regionId = regionId;
        this.regionName = regionName;
        this.noOfPolitics = noOfPolitics;
        this.listPolitics = listPolitics;
    }
    public int getRegionId() {
        return regionId;
    }
    public String getRegionName() {
        return regionName;
    }
    public int getNoOfPolitics() {
        return noOfPolitics;
    }
    public List<Politics> getListPolitics() {
        return listPolitics;
    }
    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }
    public int getTotalVotes() {
        return totalVotes;
    }
}

class Service
{
    public void FindMaximumVotesWithSomeRegion(List<Region> listRegions)
    {
        for(Region r:listRegions)
        {
            List<Politics> listpol = r.getListPolitics();
            listpol.sort(Comparator.comparing(Politics::getVotes).reversed());
            String ans = "";
            
            int maximumVotes = listpol.get(0).getVotes();
            int count = 0;
            for(Politics p: listpol)
            {
                if(p.getVotes() == maximumVotes)
                {
                    ans = p.getPoliticianName();
                    count++;
                }
            }
            
            if(count > 1)
            {
                System.out.println("No single politician found with maximum votes for RegionName ");
            }else{
                System.out.println(r.getRegionName() + " with id " + r.getRegionId()+" = "+ ans);
            }
        }
    }
    
    public void FindMaximumVoteForRegion(List<Region> listRegions)
    {
        int total = 0;
        for(Region r:listRegions)
        {
            for(Politics p:r.getListPolitics())
            {
                total += p.getVotes();
            }
            r.setTotalVotes(total);
        }
        listRegions.sort(Comparator.comparing(Region::getTotalVotes).reversed());
        int maximumTotalVotes = listRegions.get(0).getTotalVotes();
        int count = 0;
        
        for(Region r:listRegions)
        {
            if(r.getTotalVotes() == maximumTotalVotes)
            {
                count++;
            }
        }
        
        if(count > 1)
        {
            System.out.println("No region found with maximum votes.");
        }
        else{
            for(Region r:listRegions)
            {
                if(r.getTotalVotes() == maximumTotalVotes)
                {
                    System.out.println(r.getRegionName());
                    break;
                }
            }
        }
        
        
    }
}

public class Test3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numberOfRegion = sc.nextInt(); 
        if(sc.hasNextLine())
        {
            sc.nextLine();
        }
        List<Region> listRegion = new ArrayList<>();
        
        for(int i = 0; i <numberOfRegion; i++)
        {
            int regionId = sc.nextInt();
            if(sc.hasNextLine())
            {
                 sc.nextLine();
            }
            String regionName = sc.nextLine();
            int noOfPolitics = sc.nextInt();
            if(sc.hasNextLine())
            {
                sc.nextLine();
            }
            
            List<Politics> listPolitics = new ArrayList<>();
            for(int j = 0; j < noOfPolitics; j++)
            {
                String politicianName = sc.nextLine();
                String partyName = sc.nextLine();
                int votes = sc.nextInt();
                if(sc.hasNextLine())
                {
                    sc.nextLine();
                }
                try {
                   listPolitics.add(new Politics(politicianName, partyName, votes));
                    
                } catch (votesisNegativeException e) {
                    System.out.println(e.getMessage());
                }
                
            }
            listRegion.add(new Region(regionId, regionName, noOfPolitics, listPolitics));
        }
        
        Service service = new Service();
        service.FindMaximumVotesWithSomeRegion(listRegion);
        
        service.FindMaximumVoteForRegion(listRegion);
        
    }
}