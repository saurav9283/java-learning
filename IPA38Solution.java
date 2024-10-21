
import java.util.*;

class HeadSets {
    private String headsetName;
    private String brand;
    private int price;
    private boolean available;

    public HeadSets(String headsetName, String brand, int price, boolean available) {
        this.headsetName = headsetName;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }

    public String getname() {
        return headsetName;
    }

    public String getbrand() {
        return brand;
    }

    public int getprice() {
        return price;
    }

    public boolean getavailable() {
        return available;
    }
}

public class IPA38Solution {
    public static int findTotalPriceForGivenBrand(HeadSets[] heads, String find) {
        int sum = 0;
        for (HeadSets head : heads) {
            if (head.getbrand().equalsIgnoreCase(find)) {
                sum += head.getprice();
            }
        }
        return sum;
    }

    public static HeadSets findAvailableHeadsetWithSecondMinPrice(HeadSets[] heads) {
        List<HeadSets> list = new ArrayList<>();
        for (HeadSets head : heads) {
            if (head.getavailable()) {
                list.add(head);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        list.sort(Comparator.comparing(HeadSets::getprice));
        return list.get(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HeadSets[] head = new HeadSets[4];
        for (int i = 0; i < 4; i++) {
            String headsetName = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            boolean available = sc.nextBoolean();
            sc.nextLine();

            head[i] = new HeadSets(headsetName, brand, price, available);
        }

        String find = sc.nextLine();
        int ans = findTotalPriceForGivenBrand(head, find);
        System.out.println(ans);
        HeadSets newhead = findAvailableHeadsetWithSecondMinPrice(head);
        if (newhead != null) {
            System.out.println(newhead.getname());
            System.out.println(newhead.getprice());
        } else {
            System.out.println("No Headsets available");

        }

    }
}