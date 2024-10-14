import java.util.Scanner;

class Motel{
    private int motelId;
    private String motelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String cabFacility;
    private double totalBill;

    public Motel(int id, String name, String date, int noRoombooked, String cabfacility, double totalbill)
    {
        this.motelId = id;
        this.motelName = name;
        this.dateOfBooking = date;
        this.noOfRoomsBooked = noRoombooked;
        this.cabFacility = cabfacility;
        this.totalBill = totalbill;
    }
   
    public int getnoOfRoomsBooked(){
        return noOfRoomsBooked;
    }
    public void setnoOfRoomsBooked(int noRoombooked)
    {
        this.noOfRoomsBooked = noRoombooked;
    }
    public String getcabFacility()
    {
        return cabFacility;
    }
    public void setcabFacility(String cabfacility)
    {
        this.cabFacility = cabfacility;
    }
    
}

public class IPA5_Solution{

    public static int totalNoOfRoomsBooked(Motel[] models,String find)
    {
        int result = 0;
        for(Motel m: models)
        {
            if(m.getcabFacility().equals(find) && m.getnoOfRoomsBooked() > 5)
            {
                result = m.getnoOfRoomsBooked();
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        Motel[] model = new Motel[num1];
        for(int i = 0; i < num1; i++)
        {
            System.out.println("Enter the details of " + 0+i);
            int id = sc.nextInt();sc.nextLine();
            String  name = sc.nextLine();
            String date = sc.nextLine();
            int nobooked = sc.nextInt();sc.nextLine();
            String cab = sc.nextLine();
            double totalBill = sc.nextDouble();
            sc.nextLine();

            model[i] = new Motel(id,name,date,nobooked,cab,totalBill);
        }
        String find = sc.nextLine();
        System.out.print("Enter the yes no to find cab facelity " + find);

        int numberofbookedHotel = totalNoOfRoomsBooked(model , find);
        if(numberofbookedHotel != 0)
        {
            System.out.println(numberofbookedHotel);
        }
        else{
            System.out.println("No such rooms booked");
        }
        
    }
}