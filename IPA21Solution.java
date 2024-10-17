import java.util.*;

class Fruits{
    private int fruitId;
    private String fruitName;
    private int price;
    private int rating;
    
    public Fruits(int fruitId , String fruitName, int price, int rating)
    {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
        this.rating = rating;
    }
    public int getid()
    {
        return fruitId;
    }
    public String getfruitname()
    {
        return fruitName;
    }
    public int getprice()
    {
        return price;
    }
    public int getrating()
    {
        return rating;
    }
}

public class IPA21Solution{
    public static Fruits findMaximumPriceByRating(Fruits[] fruits, int find)
    {
        List<Fruits> list = new ArrayList<>();
        for(Fruits fruit: fruits){
            if(fruit.getrating() > find){
                list.add(fruit);
            }
        }
        list.sort(Comparator.comparingInt(Fruits::getprice));
        return list.get(list.size()-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Fruits[] fruit = new Fruits[4];
        for(int i = 0; i < 4; i++)
        {
            int fruitId = sc.nextInt();sc.nextLine();
            String fruitName = sc.nextLine();
            int price = sc.nextInt();sc.nextLine();
            int rating = sc.nextInt();sc.nextLine();

            fruit[i] = new Fruits(fruitId, fruitName, price, rating);
        }
        int find = sc.nextInt();sc.nextLine();
        Fruits newfruit = findMaximumPriceByRating (fruit , find);
        if(newfruit != null)
        {
            System.out.println(newfruit.getid());
        }
        else{
            System.out.println("No such Fruit");
        }
    }
}