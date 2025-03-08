package PRA;
import java.util.*;

class Politician {
    private String PoliticianName;
    private String partyName;
    private int votes;

    public Politician(String PoliticianName, String partyName, int votes) {
        this.PoliticianName = PoliticianName;
        this.partyName = partyName;
        this.votes = votes;
    }

    public String getPoliticianName() {
        return PoliticianName;
    }

    public String getPartyName() {
        return partyName;
    }

    public int getVotes() {
        return votes;
    }

}

class Region {
    private int regionId;
    private String regionName;
    private int noOfpilitician;
    int TotalVotes;
    private List<Politician> listPolitician;

    public Region(int regionId, String regionName, int noOfpilitician, List<Politician> listPolitician) {
        this.regionId = regionId;
        this.regionName = regionName;
        this.noOfpilitician = noOfpilitician;
        this.listPolitician = listPolitician;
    }

    public void setTotalVotes(int total)
    {
        this.TotalVotes = total;
    }

    public int getregionId() {
        return regionId;
    }

    public String getregionName() {
        return regionName;
    }

    public int getnoOfpilitician() {
        return noOfpilitician;
    }

    public List<Politician> getlistPolitician() {
        return listPolitician;
    }
    public int getTotalVotes()
    {
        return TotalVotes;
    }
}

class Service {
    public void MaximumVotesinRegion(List<Region> listRegion)
    {
        for(Region r:listRegion)
        {
            List<Politician> politicians = r.getlistPolitician();
            politicians.sort(Comparator.comparing(Politician::getVotes).reversed());
            
            int maxvalue = politicians.get(0).getVotes();
            int count = 0;
            for(Politician p: politicians)
            {
                if(maxvalue == p.getVotes())
                {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("No single politician found with maximum votes for " + r.getregionName());
            } else {
                System.out.println(r.getregionName() + " with " + r.getregionId() + " = " + politicians.get(0).getPoliticianName());
            }
        }
    }
    
    // Politician maxVotePolitician = Collections.max(politicians, Comparator.comparing(Politician::getVotes));
    // System.out.println(r.getregionName() + " with " + r.getregionId() + " = " + maxVotePolitician.getPoliticianName());
    public void MaximumVotesForWhichRegion(List<Region> listRegion)
    {
        String regionName = "";
        for(Region r:listRegion)
        {
            int currentMax = 0;
            for(Politician p:r.getlistPolitician())
            {
                currentMax += p.getVotes();
            }
            r.setTotalVotes(currentMax);      
        }
        listRegion.sort(Comparator.comparing(Region::getTotalVotes).reversed());
        System.out.println(listRegion.get(0).getregionName());
    }
}

public class PRA3FN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfRegion = sc.nextInt();
        List<Region> listRegion = new ArrayList<>();
        for (int i = 0; i < numberOfRegion; i++) {
            int regionId = sc.nextInt();sc.nextLine();
            String regionName = sc.nextLine();
            int noOfPoliticians = sc.nextInt();sc.nextLine();
            List<Politician> listPolitician = new ArrayList<>();
            for (int j = 0; j < noOfPoliticians; j++) {
                String politicianName = sc.nextLine();
                String partyName = sc.nextLine();
                int votes = sc.nextInt();sc.nextLine();

                listPolitician.add(new Politician(politicianName, partyName, votes));
            }
            listRegion.add(new Region(regionId, regionName, noOfPoliticians, listPolitician));
        }

        Service service = new Service();

        service.MaximumVotesinRegion(listRegion);
        service.MaximumVotesForWhichRegion(listRegion);
    }
}
