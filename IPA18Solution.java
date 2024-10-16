import java.util.*;

class Antenna {
    private int antennaid;
    private String antennaName;
    private String projectLead;
    private double antennaVSWR;

    public Antenna(int antennaid, String antennaName, String projectLead, double antennaVSWR)
    {
        this.antennaid = antennaid;
        this.antennaName = antennaName;
        this.projectLead = projectLead;
        this.antennaVSWR = antennaVSWR;
    }

    public int getid()
    {
        return antennaid;
    }
    public String getantennaName(){
        return antennaName;
    }
    public String getprojectLead(){
        return projectLead;
    }
    public double getantennaVSWR()
    {
        return antennaVSWR;
    }

}

public class IPA18Solution{
    public static int searchByname(Antenna[] antes, String find){
        for(Antenna ante: antes)
        {
            if(ante.getantennaName().equalsIgnoreCase(find))
            {
                return ante.getid();
            }
        }
        return 0;

    }

    public static List<Antenna> sortAntennaByVSWR(Antenna[] antes , double search)
    {
        List<Antenna> list = new ArrayList<>();
        for(Antenna ante:antes)
        {
            if(ante.getantennaVSWR() < search){
                list.add(ante);
            }
        }
        list.sort(Comparator.comparingDouble(Antenna::getantennaVSWR));
        return list;
    }
    public static void main(String[] args)
    {
        Scanner sc=  new Scanner(System.in);
        Antenna[] ante = new Antenna[4];
        for(int i = 0; i < 4; i++)
        {
            int antennaid = sc.nextInt();sc.nextLine();
            String antennaName = sc.nextLine();
            String projectLead =  sc.nextLine();
            double antennaVSWR = sc.nextDouble();
            sc.nextLine();

            ante[i] = new Antenna(antennaid, antennaName, projectLead, antennaVSWR);
        }

        String find = sc.nextLine();
        double  search = sc.nextDouble();
        sc.nextLine();

        int ans = searchByname(ante , find);
        if(ans != 0)
        {
            System.out.println(ans);
        }

        List<Antenna> news = sortAntennaByVSWR(ante, search);
        if(!news.isEmpty())
        {
            for(Antenna a:news)
            {
                System.out.println(a.getprojectLead());
            }
        }
        else{
            System.out.println("No Antenna found");
        }
    }
}