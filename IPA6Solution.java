import java.util.*;

class RIT{
    private int ticketNo;
    private String raisedBy;
    private String assignedTo;
    private int priority;
    private String project;
    public RIT(int ticketNo , String raisedBy, String assignedTo, int priority, String project)
    {
        this.ticketNo = ticketNo;
        this.raisedBy = raisedBy;
        this.assignedTo = assignedTo;
        this.priority = priority;
        this.project = project;
    }

    public int getticketNo()
    {
        return ticketNo;
    }
    public String getraisedBy()
    {
        return raisedBy;
    }
    public String getassignedTo()
    {
        return assignedTo;
    }
    public String getproject()
    {
        return project;
    }
}

public class IPA6Solution{

    public static RIT getHighestPriorityTicket(RIT[] rit, String find)
    {
        RIT highestPriorityTicket = null;
        int minTicket = Integer.MAX_VALUE;
        for(RIT r: rit)
        {
            if(r.getproject().equals(find) && r.getticketNo() < minTicket)
            {
                minTicket = r.getticketNo();
                highestPriorityTicket =r;
            }
        }
        return highestPriorityTicket;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of RRt");
        int num1 = sc.nextInt();

        RIT[] rip = new RIT[num1];
        for(int i = 0; i < num1; i++)
        {
            System.out.println("Enter the details of " + i+1);
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();

            rip[i] = new RIT(a,b,c,d,e);
        }
        System.out.println("ENter the name to find ");
        String find = sc.nextLine();

        RIT highestPriorityTicket = getHighestPriorityTicket(rip , find);
        if(highestPriorityTicket != null)
        {
            System.out.println(highestPriorityTicket.getticketNo());
            System.out.println(highestPriorityTicket.getraisedBy());
            System.out.println(highestPriorityTicket.getassignedTo());
        }

    }
}