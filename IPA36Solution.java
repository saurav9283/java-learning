import java.util.*;

class MobileDetails {
    private int MobileId;
    private int Price;
    private String Brand;
    private boolean isFlagShip;

    public MobileDetails(int MobileId, int Price, String Brand, boolean isFlagShip) {
        this.MobileId = MobileId;
        this.Price = Price;
        this.Brand = Brand;
        this.isFlagShip = isFlagShip;
    }

    public int getid() {
        return MobileId;
    }

    public int getprice() {
        return Price;
    }

    public String getbrand() {
        return Brand;
    }

    public boolean isflag() {
        return isFlagShip;
    }
}

public class IPA36Solution {
    public static int getTotalPrice(MobileDetails[] mobiles, String find)

    {
        int sum = 0;
        for (MobileDetails mobile : mobiles) {
            if (mobile.getbrand().equalsIgnoreCase(find)) {
                sum += mobile.getprice();
            }
        }
        return sum;
    }

    public static List<MobileDetails> getSecondMin(MobileDetails[] mobiles) {
        MobileDetails first = null;
        MobileDetails second = null;
        for (MobileDetails mobile : mobiles) {
            if (first == null || mobile.getprice() < first.getprice()) {
                second = first;
                first = mobile;
            } else if (second == null || mobile.getprice() < second.getprice()) {
                second = mobile;
            }
        }
        List<MobileDetails> list = new ArrayList<>();
        for(int i = 0; i < mobiles.length; i++)
        {
            if(second.getprice() == mobiles[i].getprice())
            {
                list.add(mobiles[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobileDetails[] mobile = new MobileDetails[5];
        for (int i = 0; i < 5; i++) {
            int MobileId = sc.nextInt();
            sc.nextLine();
            int Price = sc.nextInt();
            sc.nextLine();
            String Brand = sc.nextLine();
            boolean isFlagShip = sc.nextBoolean();
            sc.nextLine();

            mobile[i] = new MobileDetails(MobileId, Price, Brand, isFlagShip);
        }

        String brand = sc.nextLine();

        int ans = getTotalPrice(mobile, brand);
        if (ans != 0) {
            System.out.println(ans);
        } else {
            System.out.println("NO such brand found");
        }

        List<MobileDetails> anslist = getSecondMin(mobile);
        if (anslist.size() != 0) {
            for (MobileDetails m : anslist) {
                System.out.println(m.getbrand() + " : " + m.getprice());
            }
        } else {
            System.out.println("No second minimum price found.");
        }

    }
}