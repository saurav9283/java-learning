import java.util.*;

class Antenna{
    private int antennaid;
    private String antennaName;
    private String projectLead;
    private double antennaVSWR;
    public Antenna(int antennaid, String antennaName,String projectLead,double antennaVSWR)
    {
        this.antennaid = antennaid;
        this.antennaName = antennaName;
        this.projectLead =projectLead;
        this.antennaVSWR = antennaVSWR;
    }
    public int getId()
    {
        return antennaid;
    }
    public String getantennaName()
    {
        return antennaName;
    }
    public String getprojectLead()
    {
        return projectLead;
    }
    public double getantennaVSWR()
    {
        return antennaVSWR;
    }
}

class MyClass {
    public void searchAntennaByName (List<Antenna> antennas,String find)
    {
        boolean isVisible = false;
        for(Antenna antenna:antennas)
        {
            if(antenna.getantennaName().equalsIgnoreCase(find))
            {
                System.out.println(antenna.getId()); 
                isVisible = true;
            }
        }
        if(!isVisible)
        {
            System.out.println(0);
        }
    }
    public List<Antenna> sortAntennaByVSWR(List<Antenna>antennas,double find)
    {
        List<Antenna> list = new ArrayList<>();
        for(Antenna antenna:antennas)
        {
            if(antenna.getantennaVSWR() < find)
            {
                list.add(antenna);
            }
        }
        list.sort(Comparator.comparingDouble(Antenna::getantennaVSWR));
        return list;
    }
}

public class ILP18{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();sc.nextLine();

        List<Antenna> antennas =new ArrayList<>(4);
        for(int i = 0; i < 4; i++)
        {
            int antennaid =sc.nextInt();sc.nextLine();
            String antennaName = sc.nextLine();
            String projectLead = sc.nextLine();
            double antennaVSWR = sc.nextDouble();sc.nextLine();

            antennas.add(new Antenna(antennaid, antennaName, projectLead, antennaVSWR));
        }
        String find = sc.nextLine();
        double inp = sc.nextDouble();sc.nextLine();
        MyClass c = new MyClass();
        c.searchAntennaByName(antennas,find);
        List<Antenna> ans = c.sortAntennaByVSWR(antennas , inp);
        if(!ans.isEmpty())
        {
            for(Antenna a:ans)
            {
                System.out.println(a.getprojectLead());
            }
        }
        else{
            System.out.println("No Antenna found");
        }

    }
}