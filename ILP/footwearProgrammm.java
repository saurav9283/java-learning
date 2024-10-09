package ILP;
import java.util.*;

class Footwear {
    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    public Footwear(int footwearId, String footwearName, String footwearType, int price) {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }

    public int getfootwearId() {
        return footwearId;
    }

    public void setfootwearId(int footwearId) {
        this.footwearId = footwearId;
    }

    public String getfootwearName() {
        return footwearName;
    }

    public void setfootwearName(String footwearName) {
        this.footwearName = footwearName;
    }

    public String getbrand() {
        return footwearType;
    }

    public void setfootwearType(String footwearType) {
        this.footwearType = footwearType;
    }

    public int getprice() {
        return price;
    }

    public void setprice(int price) {
        this.price = price;
    }
}

public class footwearProgrammm {
    public static int getCountByType(Footwear[] footwears, String search) {
        int count = 0;
        for (int i = 0; i < footwears.length; i++) {
            if (footwears[i].getfootwearName().equals(search)) {
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return count;
    }

    public static Footwear getSecondHighestPriceByBrand(Footwear[] footwears, String brand) {
        List<Footwear> listfootwear = new ArrayList<>();
        for (Footwear footwear : footwears) {
            if (footwear.getbrand().equals(brand)) {
                listfootwear.add(footwear);
            }
        }
        if (listfootwear.size() < 2) {
            return null;
        }
        listfootwear.sort(Comparator.comparingInt(Footwear::getprice));
        return listfootwear.get(listfootwear.size() - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Footwear[] footwears = new Footwear[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter footwear id, name, type, and price:");
            int a = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character

            footwears[i] = new Footwear(a, b, c, d);
        }

        System.out.println("Enter footwear type to search:");
        String search = sc.nextLine();

        int counttype = getCountByType(footwears, search);
        if (counttype > 0) {
            System.out.println("Count: " + counttype);
        } else {
            System.out.println("No footwear found of this type.");
        }

        System.out.print("Enter footwear brand to search for second highest price: ");
        String brand = sc.nextLine();
        Footwear secondHighest = getSecondHighestPriceByBrand(footwears, brand);
        if (secondHighest != null) {
            System.out.println(secondHighest.getfootwearId());
            System.out.println(secondHighest.getbrand());
            System.out.println(secondHighest.getprice());
        } else {
            System.out.println("Not enough footwear of this brand to find the second highest price.");
        }
    }
}
