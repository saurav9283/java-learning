import java.util.*;

class Vegetable{
    private int VegetableId;
    private String VegetableName;
    private int Price;
    private int Rating;

    public Vegetable(int VegetableId,String VegetableName, int Price, int Rating)
    {
        this.VegetableId =  VegetableId;
        this.VegetableName =  VegetableName;
        this.Price = Price;
        this.Rating = Rating;
    }
    public int getVegetableId()
    {
        return VegetableId;
    }
    public String getVegetableName()
    {
        return VegetableName;
    }
    public int getPrice()
    {
        return Price;
    }
    public int getRating()
    {
        return Rating;
    }
}

public class IPA39Solution{
    public static Vegetable findMinimumPriceByRating(Vegetable[] vegitables, int find)
    {
        List<Vegetable> list = new ArrayList<>();
        for(Vegetable vegitable: vegitables)
        {
            if(vegitable.getRating() > find)
            {
                list.add(vegitable);
            }
        }
        if(list.isEmpty())
        {
            return null;
        }
        list.sort(Comparator.comparingInt(Vegetable::getRating));
        return list.get(1);

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Vegetable[] vegitable = new Vegetable[4];
        for(int i= 0; i < 4; i++)
        {
            int VegetableId = sc.nextInt();sc.nextLine();
            String VegetableName = sc.nextLine();
            int Price = sc.nextInt();sc.nextLine();
            int Rating = sc.nextInt();sc.nextLine();

            vegitable[i] = new Vegetable(VegetableId, VegetableName, Price, Rating);
        }

        int find = sc.nextInt();sc.nextLine();
        Vegetable newlist = findMinimumPriceByRating(vegitable, find);
        if(newlist != null)
        {
            System.out.println(newlist.getVegetableId());
        }
        else{
            System.out.println("no");
        }
    }
}