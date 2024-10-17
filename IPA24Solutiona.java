import java.util.*;
import java.util.Scanner;

class Inventory{
    private String inventoryId;
    private  int maximumQuantity;
    private int currentQuantity;
    private int threshold;

    public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold)
    {
        this.inventoryId =inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }
    public  String getinventoryId()
    {
        return inventoryId;
    }
    public int getmaximumQuantity()
    {
        return maximumQuantity;
    }
    public int getcurrentQuantity()
    {
        return currentQuantity;
    }
    public int getthreshold()
    {
        return threshold;
    }
}

public class IPA24Solutiona{
    public static List<Inventory> Replenish(Inventory[] invs, int find)
    {
        List<Inventory> list = new ArrayList<>();
        for(Inventory in:invs)
        {
            if(find >= in.getthreshold())
            {
                list.add(in);
            }
        }
        if(list.isEmpty())
        {
            return null;
        }
        else{

            return list;
        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Inventory[] inv = new Inventory[4];
        for(int i= 0; i < 4; i++)
        {
            String inventoryId = sc.nextLine();
            int maximumQuantity = sc.nextInt();sc.nextLine();
            int currentQuantity = sc.nextInt();sc.nextLine();
            int threshold = sc.nextInt();sc.nextLine();

            inv[i] = new Inventory(inventoryId,maximumQuantity,currentQuantity,threshold);
        }

        int find = sc.nextInt();sc.nextLine();
        List<Inventory> newlist = Replenish(inv,find);
        if(!newlist.isEmpty())
        {
            for(Inventory i:newlist)
            {
                if(i.getthreshold()>75)
                {
                    System.out.println(i.getinventoryId()+" Critical Falling");
                }
                else if(i.getthreshold() >= 50 && i.getthreshold() <= 75)
                {
                    System.out.println(i.getinventoryId()+" Moderate Filling");
                }
                else{
                    System.out.println(i.getinventoryId()+" Non-Critical Filling");
                }
            }
        }
    }
}