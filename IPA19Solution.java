import java.util.*;

class Flowers{
    private int flowerId;
    private String flowerName;
    private int price;
    private int rating;
    private String type;
    
    public Flowers(int flowerId, String flowerName, int price, int rating,String type)
    {
        this.flowerId = flowerId;
        this.flowerName = flowerName;
        this.price = price;
        this.rating = rating;
        this.type = type;
    }

    public int getid()
    {
        return flowerId;
    }
    public String getflowerName()
    {
        return flowerName;
    }
    public int getprice()
    {
        return price;
    }
    public int getrating()
    {
        return rating;
    }
    public String gettype()
    {
        return type;
    }
}

public class IPA19Solution {
    public static Flowers findMinPriceByType(Flowers[] flowers, String find)
    {
        Flowers small = null;
        for(Flowers flower:flowers)
        {
            if(flower.gettype().equalsIgnoreCase(find))
            {
                if(small == null || flower.getprice() < small.getprice())
                {
                    small = flower;
                }
            }
        }
        return small;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Flowers[] flower = new Flowers[4];
        for(int i = 0; i < 4; i++)
        {
            int flowerId = sc.nextInt();sc.nextLine();
            String flowerName = sc.nextLine();
            int price = sc.nextInt();sc.nextLine();
            int rating = sc.nextInt();sc.nextLine();
            String type  =sc.nextLine();

            flower[i] = new Flowers(flowerId, flowerName, price, rating, type);
        }
        String find = sc.nextLine();
        Flowers ans = findMinPriceByType(flower , find);
        if(ans != null)
        {
            System.out.println(ans.getid());
        }
        else{
            System.out.println("There is no flower with given type");
        }
    }
}
