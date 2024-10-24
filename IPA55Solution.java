import java.util.*;

class Resort {
    private int resortId;
    private String resortName;
    private String Category;
    private double resortPrice;
    private double resortRating;

    public Resort(int resortId, String resortName, String Category, double resortPrice, double resortRating) {
        this.resortId = resortId;
        this.resortName = resortName;
        this.Category = Category;
        this.resortPrice = resortPrice;
        this.resortRating = resortRating;
    }

    public int getresortid() {
        return resortId;
    }

    public String getresortName() {
        return resortName;
    }

    public String getCategory() {
        return Category;
    }

    public double getresortPrice() {
        return resortPrice;
    }

    public double getresortRating() {
        return resortRating;
    }
}

public class IPA55Solution {
    public static double findAvgPrice(Resort[] resorts, String find)
    {
        int sum = 0;
        int count = 0;
        for(Resort resort: resorts)
        {
            if(resort.getCategory().equalsIgnoreCase(find) && resort.getresortRating() > 4)
            {
                sum += resort.getresortPrice();
                count++;
            }
        }
        double avg = 0;
        if(count > 0)
        {
            avg = sum/count;
            return avg;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Resort[] resorts = new Resort[4];
        for (int i = 0; i < 4; i++) {
            int resortId = sc.nextInt();
            sc.nextLine();
            String resortName = sc.nextLine();
            String Category = sc.nextLine();
            double resortPrice = sc.nextDouble();
            sc.nextLine();
            double resortRating = sc.nextDouble();
            sc.nextLine();

            resorts[i] =  new Resort(resortId, resortName, Category, resortPrice, resortRating);
        }

        String findhotel =  sc.nextLine();
        double ans = findAvgPrice(resorts, findhotel);
        if(ans != 0)
        {
            System.out.println(ans);
        }
        else{
            System.out.println("No such Resort found");
        }
    }
}