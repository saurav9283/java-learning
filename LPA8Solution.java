import java.util.*;

class Hotel {
    private int hotelId;
    private String hotelName;
    private String dateofBooking;
    private int noofroomBooked;
    private String wififac;
    private double totalBill;

    public Hotel(int hotelId, String hotelName, String dateofBooking, int noofroomBooked, String wififac,
            double totalBill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateofBooking = dateofBooking;
        this.noofroomBooked = noofroomBooked;
        this.wififac = wififac;
        this.totalBill = totalBill;
    }

    public double gettotalBill() {
        return totalBill;
    }

    public String getwififac() {
        return wififac;
    }

    public String getdateofBooking()

    {
        return dateofBooking;
    }

    public int getnoofroomBooked() {
        return noofroomBooked;
    }

    public int gethotelId() {
        return hotelId;
    }
}

public class LPA8Solution {

    public static int noOfRoomsBookedInGivenMonth(Hotel[] hotels, String find) {
        int ans = 0;
        for (Hotel hotel : hotels) {
            if (hotel.getdateofBooking().contains(find)) {
                ans = hotel.getnoofroomBooked();
            }
        }
        return ans;
    }

    public static Hotel searchHotelByWifiOption(Hotel[] hotels, String search) {
        search = search.toLowerCase();
        Hotel first = null;
        Hotel second = null;
        for (Hotel hotel : hotels) {
            if (hotel.getwififac().contains(search)) {
                if (first == null || hotel.gettotalBill() > first.gettotalBill()) {
                    second = first;
                    first = hotel;
                } else if (second == null || hotel.gettotalBill() > second.gettotalBill()) {
                    second = hotel;
                }
            }
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int num1 = sc.nextInt();
        Hotel[] hotel = new Hotel[num1];
        for (int i = 0; i < num1; i++) {
            System.out.println("Enter the details for " + (i + 1));
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            String e = sc.nextLine();
            double f = sc.nextDouble();
            sc.nextLine();
            hotel[i] = new Hotel(a, b, c, d, e, f);
        }
        System.out.println("Entwe month to find number of booking ");
        String find = sc.nextLine();

        int numberofRoomBooked = noOfRoomsBookedInGivenMonth(hotel, find);
        if (numberofRoomBooked != 0) {
            System.out.println(numberofRoomBooked);
        } else {
            System.out.println("Not present");
        }
        System.out.println("Enter the search by wifi fac yes or no");
        String search = sc.nextLine();

        Hotel secondhighestBilled = searchHotelByWifiOption(hotel, search);
        if (secondhighestBilled != null) {
            System.out.println(secondhighestBilled.gethotelId());
        } else {
            System.out.println("No such option available");
        }

    }
}