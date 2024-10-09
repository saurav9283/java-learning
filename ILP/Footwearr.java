import java.util.Scanner;

class Footwear {
    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    // Parametrized constructor
    public Footwear(int footwearId, String footwearName, String footwearType, int price) {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }

    // Getters and setters
    public int getFootwearId() {
        return footwearId;
    }

    public void setFootwearId(int footwearId) {
        this.footwearId = footwearId;
    }

    public String getFootwearName() {
        return footwearName;
    }

    public void setFootwearName(String footwearName) {
        this.footwearName = footwearName;
    }

    public String getFootwearType() {
        return footwearType;
    }

    public void setFootwearType(String footwearType) {
        this.footwearType = footwearType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class Footwearr {

    // Method to get count of footwears by type
    public static int getCountByType(Footwear[] footwears, String type) {
        int count = 0;
        for (Footwear footwear : footwears) {
            if (footwear.getFootwearType().equalsIgnoreCase(type)) {
                count++;
            }
        }
        return count;
    }

    // Method to get the second highest price by brand
    public static Footwear getSecondHighestPriceByBrand(Footwear[] footwears, String inputFootwearName) {
        Footwear highest = null;
        Footwear secondHighest = null;

        for (Footwear footwear : footwears) {
            if (footwear.getFootwearName().equalsIgnoreCase(inputFootwearName)) {
                if (highest == null || footwear.getPrice() > highest.getPrice()) {
                    secondHighest = highest;
                    highest = footwear;
                } else if (secondHighest == null || footwear.getPrice() > secondHighest.getPrice()) {
                    secondHighest = footwear;
                }
            }
        }
        return secondHighest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of footwears
        System.out.print("Enter the number of footwears: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Footwear[] footwears = new Footwear[n];

        // Taking input for each footwear
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for footwear " + (i + 1) + ":");

            System.out.print("Footwear ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Footwear Name: ");
            String name = sc.nextLine();

            System.out.print("Footwear Type: ");
            String type = sc.nextLine();

            System.out.print("Price: ");
            int price = sc.nextInt();
            sc.nextLine(); // consume newline

            footwears[i] = new Footwear(id, name, type, price);
        }

        // Taking input for getCountByType method
        System.out.print("Enter footwear type to search: ");
        String searchType = sc.nextLine();
        int count = getCountByType(footwears, searchType);
        if (count > 0) {
            System.out.println("Count of footwears: " + count);
        } else {
            System.out.println("Footwear not available");
        }

        // Taking input for getSecondHighestPriceByBrand method
        System.out.print("Enter footwear brand to search for second highest price: ");
        String brand = sc.nextLine();
        Footwear secondHighest = getSecondHighestPriceByBrand(footwears, brand);
        if (secondHighest != null) {
            System.out.println(secondHighest.getFootwearId() + " " + secondHighest.getFootwearName() + " " + secondHighest.getPrice());
        } else {
            System.out.println("Brand not available");
        }

        sc.close();
    }
}
